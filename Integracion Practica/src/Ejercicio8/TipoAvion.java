
package Ejercicio8;

public class TipoAvion {
    private int capacidad;
    private int numeroModelo;
    private float peso;

    public TipoAvion(int capacidad, int numeroModelo, float peso) {
        this.capacidad = capacidad;
        this.numeroModelo = numeroModelo;
        this.peso = peso;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getNumeroModelo() {
        return numeroModelo;
    }

    public void setNumeroModelo(int numeroModelo) {
        this.numeroModelo = numeroModelo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}
