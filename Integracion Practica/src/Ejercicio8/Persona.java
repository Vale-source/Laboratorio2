
package Ejercicio8;

public class Persona {
    protected int seguridadSocial;
    protected int telefono;
    protected String direccion;
    protected String nombre;

    public Persona(int seguridadSocial, int telefono, String direccion, String nombre) {
        this.seguridadSocial = seguridadSocial;
        this.telefono = telefono;
        this.direccion = direccion;
        this.nombre = nombre;
    }

    public int getSeguridadSocial() {
        return seguridadSocial;
    }

    public void setSeguridadSocial(int seguridadSocial) {
        this.seguridadSocial = seguridadSocial;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
