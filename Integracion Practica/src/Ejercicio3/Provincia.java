package Ejercicio3;

import java.util.ArrayList;

public class Provincia {
    private String nombre;
    private ArrayList<Boolean> comparativaCiudades;

    public Provincia(String nombre) {
        this.comparativaCiudades = new ArrayList<>();
        this.nombre = nombre;
    }

    public void agregarComparativas(Boolean estadoCiudad){
        comparativaCiudades.add(estadoCiudad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Boolean> getComparativaCiudades() {
        return comparativaCiudades;
    }

    public Boolean contarCiudades(ArrayList<Boolean> ciudades){

        int contadorTrue = 0;
        int contadorFalse = 0;

        for (int i = 0; i < ciudades.size(); i++) {
            if (ciudades.get(i)){
                contadorTrue++;
            } else {
                contadorFalse++;
            }
        }

        if (contadorFalse >= contadorTrue){
            return false;
        } else {
            return true;
        }
    }
}
