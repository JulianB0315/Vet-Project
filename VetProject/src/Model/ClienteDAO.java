
package Model;
import DB.ConexionOracle;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
public class ClienteDAO {
    ConexionOracle conectar = new ConexionOracle(); 
    Connection con;
    PreparedStatement ps; 
    ResultSet rs;
    
    public List Listar(){
        List<Cliente>datos=new ArrayList<>();
        String sql = "SELECT nombre, telefono FROM CLIENTE";
        try{
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Cliente c = new Cliente();
                c.setNombre(rs.getString(1));
                c.setTelefono(rs.getString(2));
                datos.add(c);
            }
        }catch (Exception e){
        
        }
        return datos;
    }
}
