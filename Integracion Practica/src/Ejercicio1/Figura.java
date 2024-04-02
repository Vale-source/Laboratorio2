package Ejercicio1;

import java.util.ArrayList;

public class Figura {

    private ArrayList<Poligono> poligonos = new ArrayList<>();
    private ArrayList<Elipse> elipses = new ArrayList<>();

    public Figura() {
    }

    public void agregarPoligonos(Poligono figura1){
        poligonos.add(figura1);
    }

    public void agregarElipse(Elipse figura2){
        elipses.add(figura2);
    }
}
