
package Ejercicio7;

import java.util.ArrayList;

public class Registro {
    private String fechaInicioParticipante, tiempoEmpleado;
    private int posicion;
    private ArrayList<Equipo> equipos = new ArrayList<>();
    private ArrayList<Participante> participantes = new ArrayList<>();
    private Prueba prueba;

    public Registro(String fechaInicioParticipante, String tiempoEmpleado, int posicion, Prueba prueba) {
        this.fechaInicioParticipante = fechaInicioParticipante;
        this.tiempoEmpleado = tiempoEmpleado;
        this.posicion = posicion;
        this.prueba = prueba;
    }

    public void addEquipos (Equipo e){
        equipos.add(e);
    }

    public void addParticipantes (Participante p){
        participantes.add(p);
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public ArrayList<Participante> getParticipantes() {
        return participantes;
    }

    public String getFechaInicioParticipante() {
        return fechaInicioParticipante;
    }

    public void setFechaInicioParticipante(String fechaInicioParticipante) {
        this.fechaInicioParticipante = fechaInicioParticipante;
    }

    public String getTiempoEmpleado() {
        return tiempoEmpleado;
    }

    public void setTiempoEmpleado(String tiempoEmpleado) {
        this.tiempoEmpleado = tiempoEmpleado;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public Prueba getPrueba() {
        return prueba;
    }

    public void setPrueba(Prueba prueba) {
        this.prueba = prueba;
    }

    public boolean verificarFederacion(Participante participante){
        if (participante.getFederacion() != null){
            return true;
        } else {
            return false;
        }
    }
}
