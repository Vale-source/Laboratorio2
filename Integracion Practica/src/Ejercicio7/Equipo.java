
package Ejercicio7;

import java.util.ArrayList;

public class Equipo {
    private String codigo;
    private ArrayList<Participante> esquiadores = new ArrayList<>();
    private ArrayList<Integer> numEsquiadores;

    public Equipo(String codigo, ArrayList<Integer> numEsquiadores) {
        this.codigo = codigo;
        this.numEsquiadores = new ArrayList<>(esquiadores.size());
    }

    public void addEsquiador(Participante p){
        esquiadores.add(p);
    }

    public ArrayList<Participante> getEsquiadores() {
        return esquiadores;
    }

    public ArrayList<Integer> getNumEsquiadores() {
        return numEsquiadores;
    }

    public void setNumEsquiadores(ArrayList<Integer> numEsquiadores) {
        this.numEsquiadores = numEsquiadores;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
