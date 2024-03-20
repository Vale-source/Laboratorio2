import Clases.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pasajero> pasajeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Piloto p1 = new Piloto(22365814,45,"Argentina","Pedro Sanchez","experto",6228);
        Piloto p2 = new Piloto(34561127,36,"Argentina","Alberto Perez","intermedio",8845);

        ArrayList<Piloto> flota1 = new ArrayList<>(2);
        flota1.add(p1);
        flota1.add(p2);

        Piloto p3 = new Piloto(30552344,30,"Española","Alejandro Franco","novato",9532);
        Piloto p4 = new Piloto(25699439,48,"Español","Felipe Juarez","experto",5542);

        ArrayList<Piloto> flota2 = new ArrayList<>(2);
        flota2.add(p3);
        flota2.add(p4);

        Vuelo v1 = new Vuelo("Francia","20/03/2024","19/03/2024","Argentina","Aerolineas Argentinas",150,297654,"Airbus 320",flota1);
        Vuelo v2 = new Vuelo("España","26/03/2024","25/03/2024","Argentina","Aerolineas Paella",100,665719,"Boeing 737",flota2);

        Pasajero pj1 = new Pasajero(44771675,21,"Argentino","Valentin Curiel",true,"123456ef1");
        Pasajero pj2 = new Pasajero(43665124,23,"Argentino","Rodrigo Romero",true,"789456gh2");

        Reserva r1 = new Reserva(14,1,v1,pj1);
        Reserva r2 = new Reserva(15,1,v1,pj2);

        pasajeros.add(pj1);
        pasajeros.add(pj2);

        r1.agregarPasajero(pj1);
        r2.agregarPasajero(pj2);

        r1.agregarVuelo(v1);
        r2.agregarVuelo(v1);


        System.out.println("Tickets: ");
        System.out.println(r1.toString());
        System.out.println(r2.toString());
    }
}

