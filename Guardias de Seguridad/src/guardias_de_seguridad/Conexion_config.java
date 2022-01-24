package guardias_de_seguridad;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion_config {
    
    //URI
    private String database = "jdbc:postgresql://localhost:5432/guardias_de_seguridad";
    private String user = "openpg";
    private String password = "openpgpwd";
    
    //Método
    public Connection conectar() {
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection(database, user, password);
            //JOptionPane.showMessageDialog(null, "Conexión Completa a la base de datos!");
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return conexion;
    }
}
