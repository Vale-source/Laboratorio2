package Clases;

public abstract class Persona {
    protected int dni;
    protected int edad;
    protected String nacionalidad;
    protected String nombre_apellido;

    public Persona(){

    }

    public Persona(int dni, int edad, String nacionalidad, String nombre_apellido) {
        this.dni = dni;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.nombre_apellido = nombre_apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getNombre_apellido() {
        return nombre_apellido;
    }

    public void setNombre_apellido(String nombre_apellido) {
        this.nombre_apellido = nombre_apellido;
    }

    @Override
    public String toString() {
        return "Persona: {" +
                " Dni = " + dni +
                ", Edad =" + edad +
                ", Nacionalidad ='" + nacionalidad + '\'' +
                ", Nombre y apellido ='" + nombre_apellido + '\'' +
                '}';
    }
}
