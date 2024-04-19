package Ejercicio5;

import java.util.ArrayList;

public class Ciudad {
    private ArrayList<Restaurante> restaurantes = new ArrayList<>();

    public Ciudad() {

    }

    public void addRestaurante(Restaurante r) {
        restaurantes.add(r);
    }

    public void setRestaurantes(ArrayList<Restaurante> restaurantes) {
        this.restaurantes = restaurantes;
    }
}
