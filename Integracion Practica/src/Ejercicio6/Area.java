package Ejercicio6;

import java.util.ArrayList;

public class Area {
    private int kmCuadrados;
    private ArrayList<Especie> listaEspecies;
    private String nombre;

    public Area(int kmCuadrados, String nombre) {
        this.kmCuadrados = kmCuadrados;
        this.nombre = nombre;
        this.listaEspecies = new ArrayList<>();
    }

    public int getKmCuadrados() {
        return kmCuadrados;
    }

    public void setKmCuadrados(int kmCuadrados) {
        this.kmCuadrados = kmCuadrados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addEspecie(Especie e){
        listaEspecies.add(e);
    }

    public ArrayList<Especie> getListaEspecies() {
        return listaEspecies;
    }
}
