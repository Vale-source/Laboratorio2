
package Ejercicio8;

import java.util.ArrayList;

public class Servicio {
    private Avion avion;
    private ArrayList<Mecanico> mecanicos = new ArrayList<>();
    private float horasInvertidas;
    private String tipoServicio;

    public Servicio(Avion avion, float horasInvertidas, String tipoServicio) {
        this.avion = avion;
        this.horasInvertidas = horasInvertidas;
        this.tipoServicio = tipoServicio;
    }

    public void addMecanico(Mecanico m){
        mecanicos.add(m);
    }

    public ArrayList<Mecanico> getMecanicos() {
        return mecanicos;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public float getHorasInvertidas() {
        return horasInvertidas;
    }

    public void setHorasInvertidas(float horasInvertidas) {
        this.horasInvertidas = horasInvertidas;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }
}
