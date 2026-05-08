package ar.edu.unahur.obj2.w2j.planes;

public class SPlanFamiliar extends SPlanLimitado {
    private final Double descuento = 0.15;

    public SPlanFamiliar(Integer limite) {
        super(limite);
    }

    @Override
    protected Double doCostoFinal(Double total) {
        return total * (1 - this.descuento);
    }
}