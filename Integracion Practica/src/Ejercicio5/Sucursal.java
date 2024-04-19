package Ejercicio5;

import java.util.ArrayList;

public class Sucursal {
    private ArrayList<Platos> platos;

    public Sucursal() {
        this.platos = new ArrayList<>(20);
    }

    public void addPlato (Platos p) {
        platos.add(p);
    }

    public void setPlatos(ArrayList<Platos> platos) {
        this.platos = platos;
    }
}
