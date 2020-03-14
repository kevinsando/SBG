
package banco.modelo;
import java.io.Serializable;
/**
 *
 * @author Kevin
 */

public class usuario implements Serializable{
    
    private final String nombre;
    private final String id;
    private final String password;
    private final Integer rol;
    private final Integer telefono;
    
    public usuario(String nombre, String id, String password,int rol, int telefono){
        this.nombre=nombre;
        this.id = id;
        this.password=password;
        this.rol = rol;
        this.telefono=telefono;
    }
    @Override
    public String toString() {
        return String.format("{%s, %s, %s, %s}", this.getId(), this.getNombre(), this.getPassword(), this.getTel());
    }
    
    public String getId(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public String getPassword(){
        return password;
    }
    public int getRol(){
        return rol;
    }
    public int getTel(){
        return telefono;
    }
    
    
    
}
