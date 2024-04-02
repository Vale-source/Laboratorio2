package Ejercicio1;

import java.util.ArrayList;

public class Poligono {

    private ArrayList<Integer> lista_lados = new ArrayList<>();

    public Poligono(ArrayList<Integer> lista_lados) {
        this.lista_lados = lista_lados;
    }

    public ArrayList<Integer> getLista_lados() {
        return lista_lados;
    }

    public void setLista_lados(ArrayList<Integer> lista_lados) {
        this.lista_lados = lista_lados;
    }
}
