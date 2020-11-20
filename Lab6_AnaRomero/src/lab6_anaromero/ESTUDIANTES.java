package lab6_anaromero;

/**
 *
 * @author Ana Romero
 */
public class ESTUDIANTES {
    private String nombre,apellido,numCuenta,genero;
    private int edad;
    private float mensualidad;
    private CARRERA carrera;

    public ESTUDIANTES() {
    }

    public ESTUDIANTES(String nombre, String apellido, String numCuenta, String genero, int edad, float mensualidad, CARRERA carrera) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numCuenta = numCuenta;
        this.genero = genero;
        this.edad = edad;
        this.mensualidad = mensualidad;
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getMensualidad() {
        return mensualidad;
    }

    public void setMensualidad(float mensualidad) {
        this.mensualidad = mensualidad;
    }

    public CARRERA getCarrera() {
        return carrera;
    }

    public void setCarrera(CARRERA carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "nombre:" + nombre + " apellido: " + apellido + " numero Cuenta: " + numCuenta + ", genero: " + genero + ", edad: " + edad  + carrera;
    }
    
    
}
