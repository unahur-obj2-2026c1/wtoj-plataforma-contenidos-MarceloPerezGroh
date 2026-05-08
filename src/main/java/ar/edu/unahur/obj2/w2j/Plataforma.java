package ar.edu.unahur.obj2.w2j;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.w2j.plataformas.Usuario;

public class Plataforma {
  private static Plataforma instance = new Plataforma();

  private Plataforma() {
  }

  public Plataforma getInstance() {
    return instance;
  }

  private List<Usuario> usuarios = new ArrayList<>();

  public Double facturarMes() {
    return this.usuarios.stream()
        .mapToDouble(Usuario::facturar)
        .sum();
  }

  // FORMA DE POO1
  /*
   * public Double facturarMes() {
   * return usuario.stream().mapToDouble(u -> u.contoMensual()).sum()
   * }
   */
  public void agregarUsuario(Usuario usuario) {
    this.usuarios.add(usuario);
  }

}