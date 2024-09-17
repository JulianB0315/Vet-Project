
package Model;

 
public class Cliente {
    String Nombre;
    String telefono; 

    public Cliente() {
    }

    public Cliente(String Nombre, String telefono) {
        this.Nombre = Nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
