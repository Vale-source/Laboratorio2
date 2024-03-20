package Ejercicio_1;

public class Avion {
    private int matricula, cantidad_pasajeros;

    private String modelo;
    private float capacidad_carga;
    private  Flota flota;
    private Vuelo vuelo;

    public Avion(){

    }

    public Avion(int matricula, float capacidad_carga, int cantidad_pasajeros, String modelo, int cantidad_equipo, String estado_flota, String aerolinea) {
        this.matricula = matricula;
        this.capacidad_carga = capacidad_carga;
        this.cantidad_pasajeros = cantidad_pasajeros;
        this.modelo = modelo;
        this.flota = new Flota(cantidad_equipo,estado_flota,aerolinea);
    }

    public void setCapacidad_carga(float capacidad_carga) {
        this.capacidad_carga = capacidad_carga;
    }

    public Flota getFlota() {
        return flota;
    }

    public void setFlota(Flota flota) {
        this.flota = flota;
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

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public float getCapacidad_carga() {
        return capacidad_carga;
    }

    public void setCapacidad_carga(int capacidad_carga) {
        this.capacidad_carga = capacidad_carga;
    }

    public int getCantidad_pasajeros() {
        return cantidad_pasajeros;
    }

    public void setCantidad_pasajeros(int cantidad_pasajeros) {
        this.cantidad_pasajeros = cantidad_pasajeros;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }
}
