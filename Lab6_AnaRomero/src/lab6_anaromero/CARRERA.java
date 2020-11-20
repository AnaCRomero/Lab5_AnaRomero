package lab6_anaromero;

/**
 *
 * @author Ana Romero
 */
public class CARRERA {
    private String nombre,facultdad,jefeCarrera;
    private float costoMensualidad;

    public CARRERA() {
    }

    public CARRERA(String nombre, String facultdad, String jefeCarrera, float costoMensualidad) {
        this.nombre = nombre;
        this.facultdad = facultdad;
        this.jefeCarrera = jefeCarrera;
        this.costoMensualidad = costoMensualidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFacultdad() {
        return facultdad;
    }

    public void setFacultdad(String facultdad) {
        this.facultdad = facultdad;
    }

    public String getJefeCarrera() {
        return jefeCarrera;
    }

    public void setJefeCarrera(String jefeCarrera) {
        this.jefeCarrera = jefeCarrera;
    }

    public float getCostoMensualidad() {
        return costoMensualidad;
    }

    public void setCostoMensualidad(float costoMensualidad) {
        this.costoMensualidad = costoMensualidad;
    }

    
    
    
    
}
