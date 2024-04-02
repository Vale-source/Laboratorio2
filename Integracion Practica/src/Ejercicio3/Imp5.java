package Ejercicio3;

public class Imp5 extends Impuestos{

    public Imp5(Integer montoA, Integer montoB) {
        super(montoA, montoB);
    }

    public Integer calcularImpuestos(Integer montoA, Integer montoB) {
        return (montoA+montoB)*4;
    }
}
