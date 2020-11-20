package lab6_anaromero;
import java.util.ArrayList;

/**
 *
 * @author Ana Romero
 */
public class MAESTROS {
    private String nombre,apellido;
    private float salario;
    private int edad;
    private ArrayList <CLASES> CLASES = new ArrayList();

    public MAESTROS() {
    }

    public MAESTROS(String nombre, String apellido, float salario, int edad,ArrayList CLASES) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.edad = edad;
        this.CLASES = CLASES;
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

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<CLASES> getClases() {
        return CLASES;
    }

    public void setClases(ArrayList<CLASES> Clases) {
        this.CLASES = Clases;
    }

    @Override
    public String toString() {
        return "MAESTROS: " + "nombre: " + nombre + " apellido:" + apellido + " salario:" + salario + ", edad:" + edad + " CLASES:" + CLASES;
    }
    
    
}
