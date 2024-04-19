
package Ejercicio6;
public class Persona {
    private int dni;
    private String nombre, profesion;

    public Persona(int dni, String nombre, String profesion) {
        this.dni = dni;
        this.nombre = nombre;
        this.profesion = profesion;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
}
