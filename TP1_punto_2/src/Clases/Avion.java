package Clases;

import java.util.ArrayList;

public class Avion {

    private String aerolinea;
    private int cantidad_pasajeros;
    private int matricula;
    private String modelo;

    private ArrayList<Piloto> pilotos;

    public Avion(){

    }

    public Avion(String aerolinea, int cantidad_pasajeros, int matricula, String modelo, ArrayList<Piloto> pilotos) {
        this.aerolinea = aerolinea;
        this.cantidad_pasajeros = cantidad_pasajeros;
        this.matricula = matricula;
        this.modelo = modelo;
        this.pilotos = new ArrayList<Piloto>(2);
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public int getCantidad_pasajeros() {
        return cantidad_pasajeros;
    }

    public void setCantidad_pasajeros(int cantidad_pasajeros) {
        this.cantidad_pasajeros = cantidad_pasajeros;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public ArrayList<Piloto> getPilotos() {
        return pilotos;
    }

    public void setPilotos(ArrayList<Piloto> pilotos) {
        this.pilotos = pilotos;
    }

    @Override
    public String toString() {
        return "{" +
                " Aerolinea='" + aerolinea + '\'' +
                ", Cantidad de pasajeros =" + cantidad_pasajeros +
                ", Matricula =" + matricula +
                ", Modelo ='" + modelo + '\'' + //Elimine el atributo piloto ya que es un dato que en los tickets de los aviones no deberia figurar
                '}';
    }
}
