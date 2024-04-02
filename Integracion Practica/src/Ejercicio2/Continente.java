package Ejercicio2;

import java.util.ArrayList;

public class Continente {
    private ArrayList<Pais> paises;

    public Continente() {
        this.paises = new ArrayList<>();
    }

    public void agregarPaises(Pais pais){
        paises.add(pais);
    }

    public ArrayList<Pais> getPaises() {
        return paises;
    }
}
