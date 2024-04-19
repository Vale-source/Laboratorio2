
package Ejercicio8;

import java.util.ArrayList;

public class Piloto extends Persona{
    private int licencia;
    private String restricciones;
    private ArrayList<Avion> autorizacionVolar = new ArrayList<>();

    public Piloto(int seguridadSocial, int telefono, String direccion, String nombre, int licencia, String restricciones) {
        super(seguridadSocial, telefono, direccion, nombre);
        this.licencia = licencia;
        this.restricciones = restricciones;
    }

    public void addAvionAutorizado(Avion a){
        autorizacionVolar.add(a);
    }

    public ArrayList<Avion> getAutorizacionVolar() {
        return autorizacionVolar;
    }

    public int getLicencia() {
        return licencia;
    }

    public void setLicencia(int licencia) {
        this.licencia = licencia;
    }

    public String getRestricciones() {
        return restricciones;
    }

    public void setRestricciones(String restricciones) {
        this.restricciones = restricciones;
    }
}
