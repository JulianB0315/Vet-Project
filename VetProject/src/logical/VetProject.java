package logical;

import gui.InicioVet;
import DB.ConexionOracle;
public class VetProject {
    public static void main(String[] args) {
        InicioVet vet = new InicioVet();
        vet.setVisible(true);
        vet.setLocationRelativeTo(null);
        //Conectar la base de datos al ejecutar el sistema
        ConexionOracle conn = new ConexionOracle();
    }
}
