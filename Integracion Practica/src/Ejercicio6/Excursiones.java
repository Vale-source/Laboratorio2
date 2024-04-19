
package Ejercicio6;

import java.util.ArrayList;

public class Excursiones {
    private Alojamiento alojamiento;
    private int codigoExcursion, dia, hora;
    private ArrayList<Persona> listaVisitantes = new ArrayList<>();

    public Excursiones(int codigoExcursion, int dia, int hora) {
        this.codigoExcursion = codigoExcursion;
        this.dia = dia;
        this.hora = hora;
    }

    public void addVisitante(Persona p){
        listaVisitantes.add(p);
    }

    public ArrayList<Persona> getListaVisitantes() {
        return listaVisitantes;
    }

    public Alojamiento getAlojamiento() {
        return alojamiento;
    }

    public void addAlojamiento(Alojamiento alojamiento) {
        this.alojamiento = alojamiento;
    }

    public int getCodigoExcursion() {
        return codigoExcursion;
    }

    public void setCodigoExcursion(int codigoExcursion) {
        this.codigoExcursion = codigoExcursion;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
}
