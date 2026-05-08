package ar.edu.unahur.obj2.w2j.contenidos;

public class Documental extends Contenido {

    public Documental(String titulo, double costo) {
        super(titulo, costo);
    }

    @Override
    public Double doCosto() {
        return IDRA.getInstance().getValor();
    }
}