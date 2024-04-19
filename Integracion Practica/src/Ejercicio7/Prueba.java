
package Ejercicio7;

import java.util.ArrayList;

public class Prueba {
    private String fechaInicio, fechaFin, tipoPrueba;
    private Codigo codigo;
    private Estacion estacion;
    private ArrayList<Pista> pistaCompuesta = new ArrayList<>();

    public Prueba(String fechaInicio, String fechaFin, String tipoPrueba, Codigo codigo, Estacion estacion) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.tipoPrueba = tipoPrueba;
        this.codigo = codigo;
        this.estacion = estacion;
    }

    public void addPistaCompuesta(Pista p){
        pistaCompuesta.add(p);
    }

    public ArrayList<Pista> getPistaCompuesta() {
        return pistaCompuesta;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getTipoPrueba() {
        return tipoPrueba;
    }

    public void setTipoPrueba(String tipoPrueba) {
        this.tipoPrueba = tipoPrueba;
    }

    public Codigo getCodigo() {
        return codigo;
    }

    public void setCodigo(Codigo codigo) {
        this.codigo = codigo;
    }

    public Estacion getEstacion() {
        return estacion;
    }

    public void setEstacion(Estacion estacion) {
        this.estacion = estacion;
    }
}
