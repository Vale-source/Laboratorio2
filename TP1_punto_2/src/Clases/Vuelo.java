package Clases;

import java.util.ArrayList;

public class Vuelo {
    private String destino, fecha_llegada, fecha_salida, origen;

    private Avion avion;

    public Vuelo(){

    }

    public Vuelo(String destino, String fecha_llegada, String fecha_salida, String origen, String aerolinea, int cantidad_pasajeros, int matricula, String modelo, ArrayList<Piloto> pilotos) {
        this.destino = destino;
        this.fecha_llegada = fecha_llegada;
        this.fecha_salida = fecha_salida;
        this.origen = origen;

        this.avion = new Avion(aerolinea,cantidad_pasajeros,matricula,modelo,pilotos);
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFecha_llegada() {
        return fecha_llegada;
    }

    public void setFecha_llegada(String fecha_llegada) {
        this.fecha_llegada = fecha_llegada;
    }

    public String getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(String fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    @Override
    public String toString() {
        return "{" +
                " Destino='" + destino + '\'' +
                ", Fecha de llegada='" + fecha_llegada + '\'' +
                ", Fecha de salida='" + fecha_salida + '\'' +
                ", Origen='" + origen + '\'' +
                ", Avion=" + avion +
                '}';
    }
}
