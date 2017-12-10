
import java.util.Date;


public class Persona {
    private String cedula;
    private String nombre;
    private Date fecha;

    public Persona() {
    }

    public Persona(String cedula, String nombre, Date fecha) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fecha = fecha;
    }
 
    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
}

 
