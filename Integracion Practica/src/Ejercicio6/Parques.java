
package Ejercicio6;

import java.util.ArrayList;

public class Parques {
    private String fechaDeclaracion, nombre;
    private ArrayList<ComunidadAutoctona> lista_CA_perteneciente = new ArrayList<>();
    private ArrayList<Alojamiento> listaAlojamiento = new ArrayList<>();
    private ArrayList<Persona> listaVisitantes = new ArrayList<>();
    private ArrayList<Area> listaAreas; //Composicion
    private ArrayList<Personal> listaEmpleados; //Composicion
    private ArrayList<Entradas> listaEntradas; //Composicion

    public Parques(String fechaDeclaracion, String nombre) {
        this.fechaDeclaracion = fechaDeclaracion;
        this.nombre = nombre;
        this.listaAreas = new ArrayList<>();
        this.listaEmpleados = new ArrayList<>();
        this.listaEntradas = new ArrayList<>();
    }

    public String getFechaDeclaracion() {
        return fechaDeclaracion;
    }

    public void setFechaDeclaracion(String fechaDeclaracion) {
        this.fechaDeclaracion = fechaDeclaracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addComunidad(ComunidadAutoctona ca){
        lista_CA_perteneciente.add(ca);
    }

    public void addAlojamiento(Alojamiento a){
        listaAlojamiento.add(a);
    }

    public void addVisitantes(Persona p){
        listaVisitantes.add(p);
    }

    public void addAreas(Area a){
        listaAreas.add(a);
    }

    public void addEmpleado(Personal pl){
        listaEmpleados.add(pl);
    }

    public void addEntradas(Entradas e){
        listaEntradas.add(e);
    }

    public ArrayList<ComunidadAutoctona> getLista_CA_perteneciente() {
        return lista_CA_perteneciente;
    }

    public ArrayList<Alojamiento> getListaAlojamiento() {
        return listaAlojamiento;
    }

    public ArrayList<Persona> getListaVisitantes() {
        return listaVisitantes;
    }

    public ArrayList<Area> getListaAreas() {
        return listaAreas;
    }

    public ArrayList<Personal> getListaEmpleados() {
        return listaEmpleados;
    }

    public ArrayList<Entradas> getListaEntradas() {
        return listaEntradas;
    }

}
