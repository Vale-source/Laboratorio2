
package Ejercicio7;

import java.util.ArrayList;

public class Federacion {
    private String nombre;
    private ArrayList<Participante> federados = new ArrayList<>();;

    public Federacion(String nombre) {
        this.nombre = nombre;
    }

    public void addFederado(Participante p){
        federados.add(p);
    }

    public ArrayList<Participante> getFederados() {
        return federados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
