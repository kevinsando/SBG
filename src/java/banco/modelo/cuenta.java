
package banco.modelo;
import java.io.Serializable;
/**
 *
 * @author Kevin
 */

public class cuenta implements Serializable{
    
    private final String nombre;
    private final String id;
    private final String password;
    private final Integer telefono;
    
    public cuenta(String nombre, String id, String password, int telefono){
        this.nombre=nombre;
        this.id = id;
        this.password=password;
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
    public int getTel(){
        return telefono;
    }
    
    
    
}
