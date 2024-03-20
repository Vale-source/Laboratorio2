package Clases;

import java.util.ArrayList;

public class Reserva {
    private int nro_asiento, nro_vuelo;

    private Vuelo vuelo;

    private Pasajero pasajero;

    public Reserva(int nro_asiento, int nro_vuelo, Vuelo vuelo, Pasajero pasajero) {
        this.nro_asiento = nro_asiento;
        this.nro_vuelo = nro_vuelo;

    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void agregarVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void agregarPasajero(Pasajero pasajero){
        this.pasajero = pasajero;
    }

    public int getNro_asiento() {
        return nro_asiento;
    }

    public void setNro_asiento(int nro_asiento) {
        this.nro_asiento = nro_asiento;
    }

    public int getNro_vuelo() {
        return nro_vuelo;
    }

    public void setNro_vuelo(int nro_vuelo) {
        this.nro_vuelo = nro_vuelo;
    }

    @Override
    public String toString() {
        return "Reserva: {" +
                " Nro_asiento =" + nro_asiento +
                ", Nro_vuelo =" + nro_vuelo +
                ", Vuelo =" + vuelo +
                ", Pasajero =" + pasajero +
                '}';
    }
}
