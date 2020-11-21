package lab6_anaromero;

/**
 *
 * @author Ana Romero
 */
public class CLASES {
    private String nombre,seccion,edificio,salon,tieneAire;

    public CLASES() {
    }

    public CLASES(String nombre, String seccion, String edificio, String salon, String tieneAire) {
        this.nombre = nombre;
        this.seccion = seccion;
        this.edificio = edificio;
        this.salon = salon;
        this.tieneAire = tieneAire;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getEdificio() {
        return edificio;
    }

    public void setEdificio(String edificio) {
        this.edificio = edificio;
    }

    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }

    public String getTieneAire() {
        return tieneAire;
    }

    public void setTieneAire(String tieneAire) {
        this.tieneAire = tieneAire;
    }

    @Override
    public String toString() {
        return nombre ;
    }
    
    
}
