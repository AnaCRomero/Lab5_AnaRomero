package lab6_anaromero;

/**
 *
 * @author Ana Romero
 */
public class ING extends CARRERA{
    private String cadena;

    public ING() {
        super();
    }

    public ING(String cadena, String nombre, String facultdad, String jefeCarrera, float costoMensualidad) {
        super(nombre, facultdad, jefeCarrera, costoMensualidad);
        this.cadena = cadena;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    @Override
    public String toString() {
        return "INGENIERIA: " + cadena;
    }
    
    
}
