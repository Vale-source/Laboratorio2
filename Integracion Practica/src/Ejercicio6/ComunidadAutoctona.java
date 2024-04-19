package Ejercicio6;

import java.util.ArrayList;

public class ComunidadAutoctona {
    private ArrayList<Parques> listaParques = new ArrayList<>();
    private String nombre;
    private OrganismoResponsable organismoResponsable;

    public ComunidadAutoctona(OrganismoResponsable organismoResponsable, String nombre) {
        this.organismoResponsable = organismoResponsable;
        this.nombre = nombre;
    }

    private void addParques(Parques p){
        listaParques.add(p);
    }

    public ArrayList<Parques> getListaParques() {
        return listaParques;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public OrganismoResponsable getOrganismoResponsable() {
        return organismoResponsable;
    }

    public void setOrganismoResponsable(OrganismoResponsable organismoResponsable) {
        this.organismoResponsable = organismoResponsable;
    }
}
