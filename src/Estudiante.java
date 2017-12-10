
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;


public class Estudiante extends Persona{
    private String idEstudiante;
    ArrayList<String> notas=new ArrayList<String>();

    public Estudiante() {
    }

    public Estudiante(String ci, String nom, Date fecha,String idEstudiante) {
        super(ci,nom,fecha);
        this.idEstudiante = idEstudiante;
    }

    /**
     * @return the idEstudiante
     */
    public String getIdEstudiante() {
        return idEstudiante;
    }

    /**
     * @param idEstudiante the idEstudiante to set
     */
    public void setIdEstudiante(String idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    /**
     * @return the notas
     */
    public String getNotas() {
        return Arrays.toString(notas.toArray());
    }

    /**
     * @param notas the notas to set
     */
    public void setNotas(double notas) {
        String.add(notas);
    }
    public double todasLasNotas(){
      
    }
    
    @Override
    public String toString(){
        return super.toString()+"Codigo Estudiante"+
                getIdEstudiante()+"\n Notas:"+getNotas();
    }
    
}
