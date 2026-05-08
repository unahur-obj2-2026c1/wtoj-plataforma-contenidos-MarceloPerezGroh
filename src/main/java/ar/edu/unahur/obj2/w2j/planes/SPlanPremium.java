package ar.edu.unahur.obj2.w2j.planes;

import ar.edu.unahur.obj2.w2j.plataformas.Usuario;

public class SPlanPremium implements PlanStrategy {
    private Double costoPlan;

    public SPlanPremium(Double costoPlan) {
        this.costoPlan = costoPlan;
    }

    @Override
    public Double costoPlan(Usuario usuario) {
        return this.costoPlan;
    }
}
