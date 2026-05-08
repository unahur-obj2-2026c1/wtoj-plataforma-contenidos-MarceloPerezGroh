package ar.edu.unahur.obj2.w2j.contenidos;

public class IDRA {
    // SINGLENTON
    // OBJECT QUE SE INSTANCIA UNA SOLA VEZ
    // UNA INSTANCIA UNICA DE OTRA CLASE
    // EN JAVA SE USA COMO CLASS
    // EN POO1 ERA COMO UN OBJECT SOLO
    private static IDRA instance = new IDRA();
    private Double valor = 0.5;

    // el singleton tiene un constructor privado para que no pueda acceder nadie
    // tiene una instancia , tiene acceso a las instacia
    private IDRA() {
    }

    public static IDRA getInstance() {
        return instance;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

}
