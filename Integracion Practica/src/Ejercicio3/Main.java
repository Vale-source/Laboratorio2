package Ejercicio3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Imp1 mendozaImpuesto1 = new Imp1(100,200);
        Imp2 mendozaImpuesto2 = new Imp2(100,200);
        Imp3 mendozaImpuesto3 = new Imp3(100,200);
        Imp4 mendozaImpuesto4 = new Imp4(100,200);
        Imp5 mendozaImpuesto5 = new Imp5(100,200);

        Imp1 AlvearImpuesto1 = new Imp1(200,400);
        Imp2 AlvearImpuesto2 = new Imp2(200,400);
        Imp3 AlvearImpuesto3 = new Imp3(200,400);
        Imp4 AlvearImpuesto4 = new Imp4(200,400);
        Imp5 AlvearImpuesto5 = new Imp5(200,400);

        Imp1 LasHerasImpuesto1 = new Imp1(150,300);
        Imp2 LasHerasImpuesto2 = new Imp2(150,300);
        Imp3 LasHerasImpuesto3 = new Imp3(150,300);
        Imp4 LasHerasImpuesto4 = new Imp4(150,300);
        Imp5 LasHerasImpuesto5 = new Imp5(150,300);


        gastoPublico gastoPublico1 = new gastoPublico(1000);
        gastoPublico gastoPublico2 = new gastoPublico(500000000);
        gastoPublico gastoPublico3 = new gastoPublico(300000);

        montoRecaudado montoRecaudadoMendoza = new montoRecaudado();
        montoRecaudado montoRecaudadoAlvear = new montoRecaudado();
        montoRecaudado montoRecaudadoLasHeras = new montoRecaudado();

        montoRecaudadoMendoza.agregarImpuestos1(mendozaImpuesto1.calcularImpuestos(100,200));
        montoRecaudadoMendoza.agregarImpuestos2(mendozaImpuesto2.calcularImpuestos(100,200));
        montoRecaudadoMendoza.agregarImpuestos3(mendozaImpuesto3.calcularImpuestos(100,200));
        montoRecaudadoMendoza.agregarImpuestos4(mendozaImpuesto4.calcularImpuestos(100,200));
        montoRecaudadoMendoza.agregarImpuestos5(mendozaImpuesto5.calcularImpuestos(100,200));

        montoRecaudadoMendoza.agregarImpuestos1(AlvearImpuesto1.calcularImpuestos(200,400));
        montoRecaudadoMendoza.agregarImpuestos2(AlvearImpuesto2.calcularImpuestos(200,400));
        montoRecaudadoMendoza.agregarImpuestos3(AlvearImpuesto3.calcularImpuestos(200,400));
        montoRecaudadoMendoza.agregarImpuestos4(AlvearImpuesto4.calcularImpuestos(200,400));
        montoRecaudadoMendoza.agregarImpuestos5(AlvearImpuesto5.calcularImpuestos(200,400));


        montoRecaudadoLasHeras.agregarImpuestos1(LasHerasImpuesto1.calcularImpuestos(150,300));
        montoRecaudadoLasHeras.agregarImpuestos2(LasHerasImpuesto2.calcularImpuestos(150,300));
        montoRecaudadoLasHeras.agregarImpuestos3(LasHerasImpuesto3.calcularImpuestos(150,300));
        montoRecaudadoLasHeras.agregarImpuestos4(LasHerasImpuesto4.calcularImpuestos(150,300));
        montoRecaudadoLasHeras.agregarImpuestos5(LasHerasImpuesto5.calcularImpuestos(150,300));

        ArrayList<ArrayList> impuestosTotalesMendoza = new ArrayList<>();

        impuestosTotalesMendoza.add(0,montoRecaudadoMendoza.getImpuestos1());
        impuestosTotalesMendoza.add(1,montoRecaudadoMendoza.getImpuestos2());
        impuestosTotalesMendoza.add(2,montoRecaudadoMendoza.getImpuestos3());
        impuestosTotalesMendoza.add(3,montoRecaudadoMendoza.getImpuestos4());
        impuestosTotalesMendoza.add(4,montoRecaudadoMendoza.getImpuestos5());

        ArrayList<ArrayList> impuestosTotalesAlvear = new ArrayList<>();

        impuestosTotalesAlvear.add(0,montoRecaudadoAlvear.getImpuestos1());
        impuestosTotalesAlvear.add(1,montoRecaudadoAlvear.getImpuestos2());
        impuestosTotalesAlvear.add(2,montoRecaudadoAlvear.getImpuestos3());
        impuestosTotalesAlvear.add(3,montoRecaudadoAlvear.getImpuestos4());
        impuestosTotalesAlvear.add(4,montoRecaudadoAlvear.getImpuestos5());

        ArrayList<ArrayList> impuestosTotalesLasHeras = new ArrayList<>();

        impuestosTotalesLasHeras.add(0,montoRecaudadoLasHeras.getImpuestos1());
        impuestosTotalesLasHeras.add(1,montoRecaudadoLasHeras.getImpuestos2());
        impuestosTotalesLasHeras.add(2,montoRecaudadoLasHeras.getImpuestos3());
        impuestosTotalesLasHeras.add(3,montoRecaudadoLasHeras.getImpuestos4());
        impuestosTotalesLasHeras.add(4,montoRecaudadoLasHeras.getImpuestos5());


        Integer sumaImpuestosMendoza = montoRecaudadoMendoza.totalRecaudado(impuestosTotalesMendoza);
        Integer sumaImpuestosAlvear = montoRecaudadoAlvear.totalRecaudado(impuestosTotalesAlvear);
        Integer sumaImpuestosLasHeras = montoRecaudadoLasHeras.totalRecaudado(impuestosTotalesLasHeras);

        Ciudades SanRafael = new Ciudades("San Rafael",sumaImpuestosMendoza, gastoPublico1.getGastosTotales());
        Ciudades Alvear = new Ciudades("Alvear",sumaImpuestosAlvear, gastoPublico2.getGastosTotales());
        Ciudades LasHeras = new Ciudades("Las Heras",sumaImpuestosLasHeras, gastoPublico1.getGastosTotales());


        Provincia Mendoza = new Provincia("Mendoza");
        Mendoza.agregarComparativas(SanRafael.comparacionGastos());
        Mendoza.agregarComparativas(Alvear.comparacionGastos());
        Mendoza.agregarComparativas(LasHeras.comparacionGastos());


        //Los siguientes ejemplos son creados para testear si la clase Pais funciona bien
        //Se pueden cambiar los valores para que Pais de true o false
        Provincia SanJuan = new Provincia("San Juan");
        SanJuan.agregarComparativas(false);
        SanJuan.agregarComparativas(true);
        SanJuan.agregarComparativas(true);

        Provincia LaRioja = new Provincia("La Rioja");
        LaRioja.agregarComparativas(false);
        LaRioja.agregarComparativas(false);
        LaRioja.agregarComparativas(false);

        System.out.println();

        Pais Argentina = new Pais("Argentina");
        Argentina.agregarProvincia(Mendoza.contarCiudades(Mendoza.getComparativaCiudades()));
        Argentina.agregarProvincia(LaRioja.contarCiudades(LaRioja.getComparativaCiudades()));
        Argentina.agregarProvincia(SanJuan.contarCiudades(SanJuan.getComparativaCiudades()));

        System.out.println("Estado de los departamentos de Mendoza: ");
        System.out.println("San Rafael: " + SanRafael.comparacionGastos());
        System.out.println("Alvear: " + Alvear.comparacionGastos());
        System.out.println("Las Heras: " + LasHeras.comparacionGastos() + "\n");
        System.out.println("Estado de la provincia de Mendoza: " + Mendoza.contarCiudades(Mendoza.getComparativaCiudades()) + "\n");
        System.out.println("Estado de la provincia de La Rioja: " + LaRioja.contarCiudades(LaRioja.getComparativaCiudades()) + "\n");
        System.out.println("Estado de la provincia de San Juan: " + SanJuan.contarCiudades(SanJuan.getComparativaCiudades()) + "\n");
        System.out.println("Estado de Argentina: " + Argentina.contarProvincias(Argentina.getComparativaProvincias()));


    }
}
