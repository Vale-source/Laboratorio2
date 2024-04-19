package Ejercicio5;

import java.util.ArrayList;

public class Restaurante extends Sucursal{
    private String nombre;
    private ArrayList<Personas> personas = new ArrayList<>();

    public Restaurante(String nombre) {
        this.nombre = nombre;
    }

    public void addPersonas(Personas p) {
        personas.add(p);
    }

    public void setPersonas(ArrayList<Personas> personas) {
        this.personas = personas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
