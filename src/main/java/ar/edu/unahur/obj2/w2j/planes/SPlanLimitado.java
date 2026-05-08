package ar.edu.unahur.obj2.w2j.planes;

import java.util.List;

import ar.edu.unahur.obj2.w2j.contenidos.Contenido;
import ar.edu.unahur.obj2.w2j.plataformas.Usuario;

public abstract class SPlanLimitado implements PlanStrategy {
    protected Integer limite;
    protected static Double costoBase = 5.0;

    public SPlanLimitado(Integer limite) {
        this.limite = limite;
    }

    public static Double getCostoBase() {
        return SPlanLimitado.costoBase;
    }

    public static void setCostoBase(Double costoBase) {
        SPlanLimitado.costoBase = costoBase;
    }

    // ---------- Template Method ----------
    @Override
    public Double costoPlan(Usuario usuario) {
        List<Contenido> contenidosVistos = usuario.getContenidosVistos();

        Double costoExtra = contenidosVistos.stream()
                .skip(this.limite)
                .mapToDouble(Contenido::getCostoBase)
                .sum();

        return this.doCostoFinal(SPlanLimitado.costoBase + costoExtra);
    }

    // Hook del template method
    protected abstract Double doCostoFinal(Double total);

    // -------------------------------------
    // template method
    @Override
    public void actualizacionCostoPLan(Double valor) {
        SPlanLimitado.costoBase = valor;
    }

}