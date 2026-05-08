package ar.edu.unahur.obj2.w2j.contenidos;

import java.util.ArrayList;
import java.util.List;

public abstract class ContenidoConComponentes extends Contenido {
    private final List<Contenido> componentes = new ArrayList<>();

    protected ContenidoConComponentes(String titulo, double costo) {
        super(titulo, costo);
    }

    @Override
    public Double doCosto() {
        return this.componentes.stream().mapToDouble(Contenido::costo).average().orElse(0.0);
    }

    protected void agregarComponente(Contenido componente) {
        this.componentes.add(componente);
    }
}