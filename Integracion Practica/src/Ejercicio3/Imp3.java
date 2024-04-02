package Ejercicio3;

public class Imp3 extends Impuestos{
    public Imp3(Integer montoA, Integer montoB) {
        super(montoA, montoB);
    }


    @Override
    public Integer calcularImpuestos(Integer montoA, Integer montoB) {
        return (montoA*2) + montoB;
    }
}
