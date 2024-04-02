package Ejercicio3;

import java.util.ArrayList;

public class montoRecaudado {
    private ArrayList<Integer> impuestos1;
    private ArrayList<Integer> impuestos2;
    private ArrayList<Integer> impuestos3;
    private ArrayList<Integer> impuestos4;
    private ArrayList<Integer> impuestos5;

    public montoRecaudado() {
        this.impuestos1 = new ArrayList<>();
        this.impuestos2 = new ArrayList<>();
        this.impuestos3 = new ArrayList<>();
        this.impuestos4 = new ArrayList<>();
        this.impuestos5 = new ArrayList<>();
    }

    public void agregarImpuestos1(Integer imp1) {
        impuestos1.add(imp1);
    }

    public void agregarImpuestos2(Integer imp2) {
        impuestos2.add(imp2);
    }

    public void agregarImpuestos3(Integer imp3) {
        impuestos3.add(imp3);
    }

    public void agregarImpuestos4(Integer imp4) {
        impuestos4.add(imp4);
    }

    public void agregarImpuestos5(Integer imp5) {
        impuestos5.add(imp5);
    }

    public ArrayList<Integer> getImpuestos1() {
        return impuestos1;
    }

    public ArrayList<Integer> getImpuestos2() {
        return impuestos2;
    }

    public ArrayList<Integer> getImpuestos3() {
        return impuestos3;
    }

    public ArrayList<Integer> getImpuestos4() {
        return impuestos4;
    }

    public ArrayList<Integer> getImpuestos5() {
        return impuestos5;
    }

    public Integer totalRecaudado(ArrayList<ArrayList> total) {
        Integer suma = 0;

        for (ArrayList<Integer> listaImpuestos : total) {
            for (Integer imp : listaImpuestos) {
                suma += imp;
            }
        }

        return suma;
    }
}
