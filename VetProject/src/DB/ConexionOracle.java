
package DB;
import java.sql.Connection;
import java.sql.DriverManager;
public class ConexionOracle {
    private Connection conn = null;
    private String url, user, password;

    public ConexionOracle() {
        conectar();
    }
    
    private void conectar(){
    //Metodo para conectar la base de datos
    try{
        Class.forName("oracle.jdbc.OracleDriver"); //Driver de la DB
        url = "jdbc:oracle:thin:@localhost:1521:XE"; //Url de tu conexion
        user = "C##Conexion"; //User del sql Developer
        password = "Conexion"; //Contraseña del user
        conn = DriverManager.getConnection(url, user, password);
        System.out.println("Conexion exitosa.");
    }catch (Exception e){
        System.out.println("Error: No se pudo conectar :c");
    }
    }
    
    public void desconectar(){
    try{
        conn.close();
        System.out.println("Base de datos desconectada exitosamente");
    }catch(Exception e){
        System.out.println("Fallo al querer desconectar la base de datos");
    }
    }
    
}
