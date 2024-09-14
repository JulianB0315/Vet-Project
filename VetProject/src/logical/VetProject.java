package logical;

import gui.LoginVet;
import DB.ConexionOracle;
public class VetProject {
    public static void main(String[] args) {
        LoginVet log = new LoginVet();
        log.setVisible(true);
        log.setLocationRelativeTo(null);
        //Conectar la base de datos al ejecutar el sistema
        ConexionOracle conn = new ConexionOracle();
    }
}
