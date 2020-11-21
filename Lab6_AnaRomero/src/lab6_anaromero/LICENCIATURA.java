package lab6_anaromero;

/**
 *
 * @author Ana Romero
 */
public class LICENCIATURA extends CARRERA{
    private String tipo;

    public LICENCIATURA() {
        super();
    }

    public LICENCIATURA(String tipo, String nombre, String facultdad, String jefeCarrera, float costoMensualidad) {
        super(nombre, facultdad, jefeCarrera, costoMensualidad);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.getNombre();
    }
    
    
}
