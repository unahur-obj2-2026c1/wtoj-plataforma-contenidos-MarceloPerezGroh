package ar.edu.unahur.obj2.w2j.contenidos;

public class Episodio {
    private Integer numero;
    private String titulo;
    private Double costo;

    public Episodio(String titulo, Integer numero) {
        this.numero = numero;
        this.titulo = titulo;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public Double getCosto() {
        return costo;
    }

}
