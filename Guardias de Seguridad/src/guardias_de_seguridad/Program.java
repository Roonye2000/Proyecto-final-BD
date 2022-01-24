package guardias_de_seguridad;

import java.io.IOException;
import javax.swing.JFrame;

public class Program extends JFrame{

    public static void main(String[] args) throws IOException {
        
        //Abrir la ventana principal (Home)
        Home home = new Home();
        home.setVisible(true);
        
    }
}
