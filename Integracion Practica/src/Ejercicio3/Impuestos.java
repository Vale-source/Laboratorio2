package Ejercicio3;

public abstract class Impuestos {
    protected Integer montoA;
    protected Integer montoB;

    public Impuestos(Integer montoA, Integer montoB) {
        this.montoA = montoA;
        this.montoB = montoB;
    }

    public Integer calcularImpuestos(Integer montoA, Integer montoB){
        return montoA - montoB;
    }
}
