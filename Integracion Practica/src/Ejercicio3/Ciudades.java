package Ejercicio3;

import java.util.ArrayList;

public class Ciudades {
    private String nombre;

    private Integer compararImpuestos;

    private Integer compararGastos;

    public Ciudades(String nombre, Integer compararImpuestos, Integer compararGastos) {
        this.nombre = nombre;
        this.compararImpuestos = compararImpuestos;
        this.compararGastos = compararGastos;
    }

    public Boolean comparacionGastos(){
        if (this.compararGastos >= this.compararImpuestos){
            return false;
        } else {
            return true;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCompararImpuestos() {
        return compararImpuestos;
    }

    public void setCompararImpuestos(Integer compararImpuestos) {
        this.compararImpuestos = compararImpuestos;
    }


    public Integer getCompararGastos() {
        return compararGastos;
    }

    public void setCompararGastos(Integer compararGastos) {
        this.compararGastos = compararGastos;
    }
}
