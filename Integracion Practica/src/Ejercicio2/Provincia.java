package Ejercicio2;

import java.util.ArrayList;

public class Provincia {
    private ArrayList<Ciudad> ciudades;
    private ArrayList<Provincia> provincias_limitrofes;
    private String nombre;

    public Provincia(String nombre) {
        this.nombre = nombre;
        this.ciudades = new ArrayList<>();
        this.provincias_limitrofes = new ArrayList<>();
    }

    public void agregarCiudades(Ciudad ciudad){
        ciudades.add(ciudad);
    }

    public void agregarProvincias_limitrofes(Provincia provincia){
        provincias_limitrofes.add(provincia);
    }

    public ArrayList<Ciudad> getCiudades() {
        return ciudades;
    }

    public ArrayList<Provincia> getProvincias_limitrofes() {
        return provincias_limitrofes;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}

