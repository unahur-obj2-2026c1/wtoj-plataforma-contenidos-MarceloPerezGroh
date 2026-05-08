package ar.edu.unahur.obj2.w2j.contenidos;

public abstract class Contenido {
    private final String titulo;
    private Double costoBase;

    protected Contenido(String titulo, Double costoBase) {
        this.titulo = titulo;
        this.costoBase = costoBase;
    }

    public String getTitulo() {
        return titulo;
    }

    public Double getCostoBase() {
        return costoBase;
    }

    public void setCosto(Double costoBase) {
        this.costoBase = costoBase;
    }

    // ---------- Template Method ----------
    public Double costo() {
        return costoBase + this.doCosto();
    }

    // Hook del template method
    public abstract Double doCosto();
    // -------------------------------------
}
