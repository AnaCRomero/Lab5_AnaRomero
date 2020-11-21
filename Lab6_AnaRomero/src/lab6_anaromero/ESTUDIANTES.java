package lab6_anaromero;

/**
 *
 * @author Ana Romero
 */
public class ESTUDIANTES {
    private String nombre,apellido,genero;
    private int edad,numCuenta;
    private String carrera;

    public ESTUDIANTES() {
    }

    public ESTUDIANTES(String nombre, String apellido, int numCuenta, String genero, int edad, String carrera) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numCuenta = numCuenta;
        this.genero = genero;
        this.edad = edad;
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

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
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

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    

    @Override
    public String toString() {
        return "nombre:" + nombre + " apellido: " + apellido + ", genero: " + genero + ", edad: " + edad  + carrera;
    }
    
    
}
