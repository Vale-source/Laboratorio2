package Ejercicio4;

import java.util.ArrayList;

public class Lote {
    private ArrayList<cosechaFina> granosFino = null;
    private ArrayList<cosechaGruesa> granosGrueso = null;
    private ArrayList<Pastura> pasturas = null;
    private ArrayList<mineralesPrimarios> mineralesPrimarios = null;
    private ArrayList<mineralesSecundarios> mineralesSecundarios = null;

    private boolean existePastura;

    public Lote(boolean existePastura) {
        this.existePastura = existePastura;
    }

    public void crearCosechaF(){
        if (pasturas == null){
            if (granosGrueso == null){
                if (granosFino == null){
                    this.granosFino = new ArrayList<>();
                } else {
                    System.out.println("Este suelo ya tiene cosecha fina");
                }
            } else {
                System.out.println("Este suelo tiene granos gruesos y por ende no puede tener granos finos ");
            }
        } else {
            System.out.println("Este suelo tiene pastura y por ende no puede tener granos finos");
        }

    }
    public void agregarCosechaF(cosechaFina granoFino){
        granosFino.add(granoFino);
    }

    public void crearCosechaG(){
        if (pasturas == null){
            if (granosFino == null){
                if (granosGrueso == null){
                    this.granosGrueso = new ArrayList<>();
                } else {
                    System.out.println("Este suelo ya tiene grano grueso");
                }
            } else {
                System.out.println("Este suelo ya tiene grano finos y no puede tener granos gruesos");
            }
        } else {
            System.out.println("Este suelo ya tiene pasturas y no puede tener granos gruesos");
        }

    }

    public void agreagarCosechaG(cosechaGruesa granoGrueso){
        granosGrueso.add(granoGrueso);
    }

    public void crearCosechaP(){
        if (!this.existePastura){
            if (granosGrueso == null){
                if (granosFino == null){
                    if (pasturas == null){
                        this.pasturas = new ArrayList<>();
                    } else {
                        System.out.println("Ya existe pastura en este lote");
                    }
                } else {
                    System.out.println("Ya exsite granos finos en este lote y por ende no se puede plantar pastura");
                }
            } else {
                System.out.println("Ya hay granos gruesos en este lote y por ende no se puede plantar pastura");
            }
        } else {
            System.out.println("Anteriormente ya hubo pastura en este lote y no se puede plantar mas pastura");
        }

    }

    public void agreagarPasturas(Pastura pastura){
        pasturas.add(pastura);
    }

    public void composicionTierra_primaria() {
        if (mineralesSecundarios == null) {
            if (mineralesPrimarios == null) {
                mineralesPrimarios = new ArrayList<>();
            } else {
                System.out.println("El suelo de este lote ya es de calidad primaria.");
            }
        } else {
            System.out.println("El suelo de este lote es de calidad secundaria y por ende no puede ser de calidad primaria.");
        }
    }

    public void agregarMineralesP(mineralesPrimarios mineralP){
        mineralesPrimarios.add(mineralP);
    }

    public void composicionTierra_secundaria() {
        if (mineralesPrimarios == null) {
            if (mineralesSecundarios == null) {
                mineralesSecundarios = new ArrayList<>();
            } else {
                System.out.println("El suelo de este lote ya es de calidad secundaria.");
            }
        } else {
            System.out.println("El suelo de este lote es de calidad primaria y por ende no puede ser de calidad secundaria.");
        }
    }

    public void agregarMineralesS(mineralesSecundarios mineralS){
        mineralesSecundarios.add(mineralS);
    }


    public boolean composicionTierra(){
        if (this.mineralesPrimarios == null){
            return false;
        } else {
            return true;
        }
    }

    public ArrayList<cosechaFina> getGranosFino() {
        return granosFino;
    }

    public ArrayList<cosechaGruesa> getGranosGrueso() {
        return granosGrueso;
    }

    public ArrayList<Pastura> getPasturas() {
        return pasturas;
    }

    public ArrayList<Ejercicio4.mineralesPrimarios> getMineralesPrimarios() {
        return mineralesPrimarios;
    }

    public ArrayList<Ejercicio4.mineralesSecundarios> getMineralesSecundarios() {
        return mineralesSecundarios;
    }

    @Override
    public String toString() {
        return "Lote{" +
                "granosFino=" + granosFino +
                ", granosGrueso=" + granosGrueso +
                ", pasturas=" + pasturas +
                ", mineralesPrimarios=" + mineralesPrimarios +
                ", mineralesSecundarios=" + mineralesSecundarios +
                ", existePastura=" + existePastura +
                '}';
    }
}
