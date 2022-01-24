//Dependencias usadas
const functions = require("firebase-functions");
const admin = require("firebase-admin");

admin.initializeApp();
const db = admin.firestore();

// https://firebase.google.com/docs/functions/write-firebase-functions

//Función parecida a trigger que se ejecuta cuando un usuario crea un documento en la colección "Servicios_Solicitados"
exports.onUserCreate = functions.firestore.document('Servicios_Solicitados/{Servicios_SolicitadosId}').onCreate(async (snap, context) => {
  const values = snap.data(); //Obtenemos todos los datos del último documento creado en la colección "Servicios_Solicitados"
  /*
    Obtenemos todos los documentos de la colección "Servicios_Solicitados" que su campo cedula_guardia
    sea igual al ingresado en el último documento creado en la colección "Servicios_Solicitados"
  */
  const query = db.collection("Servicios_Solicitados");
  const snapshot = await query.where("cedula_guardia", "==", values.cedula_guardia).get();
  var servicios = 0; //Variable para contar el número de veces que un guardia ha solicitado el "Servicio de adquisicion de balas"
  snapshot.forEach(x=>{
    var id_servicio = x.data().id_servicio; //Obtenemos el id del servicio del documento
    if(id_servicio == "2") {
      var fecha_servicio = x.data().fecha_servicio; //Obtenemos la fecha del documento
      var respuesta = verificarFecha(fecha_servicio); //Verificamos la fecha obtenida
      if(respuesta == true) { //Si la verificación de la fecha retorna verdadero
        servicios = servicios + 1; //Acumulamos el "Servicio de adquisicion de balas" que ha solicitado un guardia
      }
    }
  })
  //Eliminación
  try {
    if(servicios > 3){ //Si el guardia ya ha solicitado 3 veces el "Servicio de adquisicion de balas"
      const res = await db.collection("Servicios_Solicitados").doc(snap.id).delete(); //Eliminamos el último documento ingresado
      console.log(`Al guardia con la cédula '${values.cedula_guardia}' ya no se le puede facilitar mas balas en este mes!`);
    }
  } catch (error) {
    console.log(error);
  }
});

function verificarFecha(datoFecha) {
  var f_actual = new Date();
  //Obtenemos el año y el mes actual
  var año_actual = f_actual.getFullYear();
  var mes_actual = parseInt(f_actual.getMonth()) + 1;
  //Obtenemos el año y el mes del servicio solicitado
  var año_servicio = datoFecha.substring(0, 4);
  var mes_servicio = parseInt(datoFecha.substring(5, 7));
  //console.log(`Fecha actual: ${año_actual}/${mes_actual} - Fecha servicio: ${año_servicio}/${mes_servicio}`);
  /*
    Verificamos si el año y el mes del servicio solicitado son iguales al mes y año actual.
    Si es cierto retornamos verdadero y caso contrario retornamos falso.
  */
  if(año_servicio == año_actual && mes_servicio == mes_actual) {
    return true;
  } else {
    return false;
  }
}
