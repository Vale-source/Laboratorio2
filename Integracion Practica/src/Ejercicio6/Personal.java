package Ejercicio6;

import java.util.ArrayList;

public class Personal extends Persona {
    private String direccion;
    private int numCelular;
    private float sueldo;

    public Personal(int dni, String nombre, String profesion, String direccion, int numCelular, float sueldo) {
        super(dni, nombre, profesion);
        this.direccion = direccion;
        this.numCelular = numCelular;
        this.sueldo = sueldo;
    }


    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumCelular() {
        return numCelular;
    }

    public void setNumCelular(int numCelular) {
        this.numCelular = numCelular;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
}