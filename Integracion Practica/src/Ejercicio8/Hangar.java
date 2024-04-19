
package Ejercicio8;

import java.util.ArrayList;

public class Hangar {
    private int numeroHangar;
    private String ubicacion;
    private ArrayList<Avion> capacidad = new ArrayList<>();

    public Hangar(int numeroHangar, String ubicacion) {
        this.numeroHangar = numeroHangar;
        this.ubicacion = ubicacion;
    }

    public void addCapacida(Avion a){
        capacidad.add(a);
    }

    public ArrayList<Avion> getCapacidad() {
        return capacidad;
    }

    public int getNumeroHangar() {
        return numeroHangar;
    }

    public void setNumeroHangar(int numeroHangar) {
        this.numeroHangar = numeroHangar;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
