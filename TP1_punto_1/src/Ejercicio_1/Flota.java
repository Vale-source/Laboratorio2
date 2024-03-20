package Ejercicio_1;

public class Flota {
    private int cantidad_equipo;
    private String estado_flota, nombre_flota, aerolinea;

    private Avion avion;
    public Flota(){

    }

    public Flota(int cantidad_equipo, String estado_flota, String aerolinea) {
        this.cantidad_equipo = cantidad_equipo;
        this.estado_flota = estado_flota;
        this.aerolinea = aerolinea;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public int getCantidad_equipo() {
        return cantidad_equipo;
    }

    public void setCantidad_equipo(int cantidad_equipo) {
        this.cantidad_equipo = cantidad_equipo;
    }

    public String getEstado_flota() {
        return estado_flota;
    }

    public void setEstado_flota(String estado_flota) {
        this.estado_flota = estado_flota;
    }

    public String getNombre_flota() {
        return nombre_flota;
    }

    public void setNombre_flota(String nombre_flota) {
        this.nombre_flota = nombre_flota;
    }

}
