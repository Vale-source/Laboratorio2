package Ejercicio4;

public class Main {
    public static void main(String[] args) {
        Lote lote1 = new Lote(true);
        Lote lote2 = new Lote(false);
        Lote lote3 = new Lote(false);

        mineralesPrimarios Arcilla = new mineralesPrimarios("Arcilla");
        mineralesPrimarios Arena = new mineralesPrimarios("Arena lisa");

        mineralesSecundarios Tierra = new mineralesSecundarios("Tierra dura");
        mineralesSecundarios Piedra = new mineralesSecundarios("Piedra");

        mineralesPrimarios Tierra1 = new mineralesPrimarios("Tierra blanda");
        mineralesPrimarios Arcilla1 = new mineralesPrimarios("Arcilla");

        cosechaFina Trigo = new cosechaFina("Trigo");
        cosechaFina Avena = new cosechaFina("Avena");

        cosechaGruesa Maiz = new cosechaGruesa("Maiz");
        cosechaGruesa Girasol = new cosechaGruesa("Girasol");

        Pastura Alfalfa = new Pastura("Alfalfa");
        Pastura trebolSubterraneo = new Pastura("Trebol Subterraneo");

        lote1.composicionTierra_primaria();
        lote1.agregarMineralesP(Arcilla);
        lote1.agregarMineralesP(Arena);

        lote2.composicionTierra_secundaria();
        lote2.agregarMineralesS(Tierra);
        lote2.agregarMineralesS(Piedra);

        lote3.composicionTierra_primaria();
        lote3.agregarMineralesP(Tierra1);
        lote3.agregarMineralesP(Arcilla1);

        lote1.crearCosechaF();
        lote2.crearCosechaG();
        lote3.crearCosechaP();

        lote1.agregarCosechaF(Trigo);
        lote1.agregarCosechaF(Avena);

        lote2.agreagarCosechaG(Maiz);
        lote2.agreagarCosechaG(Girasol);

        lote3.agreagarPasturas(Alfalfa);
        lote3.agreagarPasturas(trebolSubterraneo);

        System.out.println(lote1.toString());
        System.out.println("El primer lote es de calidad especial: " + lote1.composicionTierra() + "\n");

        System.out.println(lote2.toString());
        System.out.println("El primer lote es de calidad especial: " + lote2.composicionTierra() + "\n");

        System.out.println(lote3.toString());
        System.out.println("El primer lote es de calidad especial: " + lote3.composicionTierra() + "\n");
    }
}
