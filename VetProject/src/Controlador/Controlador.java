
package Controlador;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import gui.RegistroConsulta;
import Model.ClienteDAO;
import Model.Cliente;
import gui.Manipulacion;
import java.util.List;
import javax.swing.JTable;
public class Controlador implements ActionListener{
    ClienteDAO dao = new ClienteDAO();
    Cliente c = new Cliente();
    Manipulacion vista = new Manipulacion("1234");
    DefaultTableModel model = new DefaultTableModel();
    
    public Controlador(Manipulacion v) {
         this.vista = v;
         this.vista.btnUpdate.addActionListener(this);
    }
     
    public void listar (JTable tabla) {
        model =(DefaultTableModel) tabla.getModel();
        List<Cliente>lista=dao.Listar();
        Object []object=new Object [4];
        for (int i = 0; i < lista.size() ; i++) {
            object[0]=lista.get(i).getNombre();
            object [1]=lista.get(i).getTelefono();
            model.addRow (object);
        }   
        vista.tabla.setModel (model);
    }
    
     @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vista.btnUpdate){
            listar(vista.tabla);
        }
    }

}
    
   

   
    

