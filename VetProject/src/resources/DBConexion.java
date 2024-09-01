package resources;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConexion {
    public static Connection getConnection() throws SQLException{
        String url = "";//Url de acuerdo ala configuracion
        String user ="";//Usuario de la conexion
        String password = "";//Contraseña de la conexion

        try {
            Class.forName("");//Diver de la base de datos
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Conectado");
        }

        return DriverManager.getConnection(url, user, password);
        //Si no saben como hacerlo mejor matate :v
    }
}
