package Ejercicio3;

public class Imp4 extends Impuestos{

    public Imp4(Integer montoA, Integer montoB) {
        super(montoA, montoB);
    }

    @Override
    public Integer calcularImpuestos(Integer montoA, Integer montoB) {
        return (montoB*montoB) + montoA;
    }
}
