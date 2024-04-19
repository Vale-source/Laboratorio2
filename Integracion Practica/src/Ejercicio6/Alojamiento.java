package Ejercicio6;

import java.util.ArrayList;

public class Alojamiento {
    private int capacidad;
    private String categoria, nombre;
    private ArrayList<Excursiones> listaExcursiones = new ArrayList<>();
    private ArrayList<Reservas> listaReservas;

    public Alojamiento(int capacidad, String categoria, String nombre) {
        this.capacidad = capacidad;
        this.categoria = categoria;
        this.nombre = nombre;
        this.listaReservas = new ArrayList<>();
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addExcursion(Excursiones e){
        listaExcursiones.add(e);
    }

    public void addReserva(Reservas r){
        listaReservas.add(r);
    }

    public ArrayList<Excursiones> getListaExcursiones() {
        return listaExcursiones;
    }

    public ArrayList<Reservas> getListaReservas() {
        return listaReservas;
    }
}
