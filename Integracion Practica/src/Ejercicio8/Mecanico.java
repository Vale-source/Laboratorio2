
package Ejercicio8;

import java.util.ArrayList;

public class Mecanico extends Persona {
    private float salario;
    private String turno;
    private ArrayList<Avion> autorizacionReparar;

    public Mecanico(int seguridadSocial, int telefono, String direccion, String nombre, float salario, String turno) {
        super(seguridadSocial, telefono, direccion, nombre);
        this.salario = salario;
        this.turno = turno;
        this.autorizacionReparar = new ArrayList<>();
    }

    public void addAvionReparar(Avion a){
        autorizacionReparar.add(a);
    }

    public ArrayList<Avion> getAutorizacionReparar() {
        return autorizacionReparar;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
}
