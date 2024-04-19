
package Ejercicio7;

import java.util.ArrayList;

public class Estacion {
    private ArrayList<Federacion> administracion = new ArrayList<>();
    private ArrayList<Pista> cantidadPistas;
    private int codigo, telefono;
    private String direccion, nombre;
    private float kilometrosTotal;
    private ArrayList<String> contactos;

    public Estacion(int codigo, int telefono, String direccion, String nombre, float kilometrosTotal) {
        this.codigo = codigo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.nombre = nombre;
        this.contactos = new ArrayList<>();
        this.kilometrosTotal = kilometrosTotal;
        this.cantidadPistas = new ArrayList<>();
    }

    private void addAdministracion(Federacion f){
        administracion.add(f);
    }

    private void addPistas(Pista p){
        cantidadPistas.add(p);
    }

    private void addContactos(String c){
        contactos.add(c);
    }

    public ArrayList<Federacion> getAdministracion() {
        return administracion;
    }

    public ArrayList<Pista> getCantidadPistas() {
        return cantidadPistas;
    }

    public ArrayList<String> getContactos() {
        return contactos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public float getKilometrosTotal() {
        return kilometrosTotal;
    }

    public void setKilometrosTotal(float kilometrosTotal) {
        this.kilometrosTotal = kilometrosTotal;
    }
}
