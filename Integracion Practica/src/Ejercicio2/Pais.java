package Ejercicio2;

import java.util.ArrayList;

public class Pais {
    private ArrayList<Provincia> provincias;
    private ArrayList<Pais> paises_limitrofes;
    private ArrayList<Provincia> provincias_limitrofes;
    private String capital;
    private String nombre;

    public Pais(String capital,String nombre) {
        this.nombre = nombre;
        this.capital = capital;
        this.provincias = new ArrayList<>();
        this.paises_limitrofes = new ArrayList<>();
        this.provincias_limitrofes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void agregarProvincias(Provincia provincia1){
        provincias.add(provincia1);
    }

    public void agregarPaises_limitrofes(Pais pais){
        paises_limitrofes.add(pais);
    }

    public void agregarProvincias_limitrofes(Provincia provincia2){
        provincias_limitrofes.add(provincia2);
    }

    public ArrayList<Provincia> getProvincias() {
        return provincias;
    }

    public ArrayList<Pais> getPaises_limitrofes() {
        return paises_limitrofes;
    }

    public ArrayList<Provincia> getProvincias_limitrofes() {
        return provincias_limitrofes;
    }

    @Override
    public String toString() {
        return nombre;
    }
}

