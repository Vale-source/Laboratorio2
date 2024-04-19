
package Ejercicio8;

import java.util.ArrayList;

public class Avion extends TipoAvion{
    private String fechaAdquisicion;
    private int numeroMatricula;
    private Hangar hangar;
    private Propietario propietario;
    private ArrayList<Piloto> pilotos = new ArrayList<>(2);

    public Avion(int capacidad, int numerModelo, float peso,String fechaAdquisicion, int numeroMatricula) {
        super(capacidad, numerModelo, peso);
        this.fechaAdquisicion = fechaAdquisicion;
        this.numeroMatricula = numeroMatricula;
    }

    public void addPiloto (Piloto p){
        pilotos.add(p);
    }

    public ArrayList<Piloto> getPilotos() {
        return pilotos;
    }

    public String getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    public void setFechaAdquisicion(String fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public void addHangar(Hangar hangar) {
        this.hangar = hangar;
    }

    public void addPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public Hangar getHangar() {
        return hangar;
    }

    public Propietario getPropietario() {
        return propietario;
    }
}
