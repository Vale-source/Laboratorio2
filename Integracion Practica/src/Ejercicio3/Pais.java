package Ejercicio3;

import java.util.ArrayList;

public class Pais {

    private String nombre;
    private ArrayList<Boolean> comparativaProvincias;

    public Pais(String nombre) {
        this.comparativaProvincias = new ArrayList<>();
        this.nombre = nombre;
    }

    public void agregarProvincia(Boolean provincia){
        comparativaProvincias.add(provincia);
    }

    public ArrayList<Boolean> getComparativaProvincias() {
        return comparativaProvincias;
    }

    public Boolean contarProvincias(ArrayList<Boolean> provincia){

        int contadorTrue = 0;
        int contadorFalse = 0;

        for (int i = 0; i < provincia.size(); i++) {
            if (provincia.get(i)){
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
