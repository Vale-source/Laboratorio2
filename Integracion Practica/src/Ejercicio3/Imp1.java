package Ejercicio3;

public class Imp1 extends Impuestos{


    public Imp1(Integer montoA, Integer montoB) {
        super(montoA, montoB);
    }

    @Override
    public Integer calcularImpuestos(Integer montoA, Integer montoB) {
        return montoA + montoB;
    }
}
