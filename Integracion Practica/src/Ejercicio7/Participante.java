
package Ejercicio7;

public class Participante {
    private int dni, edad, fechaNacimiento;
    private String codigo, nombre;
    private Federacion federacion = null;

    public Participante(int dni, int edad, int fechaNacimiento, String codigo, String nombre) {
        this.dni = dni;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.codigo = codigo;
        this.nombre = nombre;
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

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Federacion getFederacion() {
        return federacion;
    }

    public void addFederacion(Federacion federacion) {
        this.federacion = federacion;
    }
}
