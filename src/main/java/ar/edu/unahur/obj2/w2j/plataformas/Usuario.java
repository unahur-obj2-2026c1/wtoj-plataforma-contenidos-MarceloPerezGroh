package ar.edu.unahur.obj2.w2j.plataformas;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.w2j.contenidos.Contenido;
import ar.edu.unahur.obj2.w2j.planes.PlanStrategy;

public class Usuario {
  private List<Contenido> contenidosVistos = new ArrayList<>();
  private PlanStrategy plan;

  public Usuario(PlanStrategy plan) {
    this.plan = plan;
  }

  public List<Contenido> getContenidosVistos() {
    return contenidosVistos;
  }

  public void cambiarPlan(PlanStrategy plan) {
    this.plan = plan;
  }

  public void verContenido(Contenido contenido) {
    this.contenidosVistos.add(contenido);
  }

  public Double facturar() {
    Double montoFacturado = this.plan.costoPlan(this);
    this.contenidosVistos = new ArrayList<>();
    return montoFacturado;
  }
}