package models;

public class Prestacao {
  public static double prestacao(double valorCompra) {
    double prestacao = valorCompra / 5;
    return prestacao;
  }

  private double valorCompra;

  public Prestacao() {
  }

  public double getValorCompra() {
    return this.valorCompra;
  }

  public void setValorCompra(double valorCompra) {
    this.valorCompra = valorCompra;
  }

  public Prestacao(double valorCompra) {
    this.valorCompra = valorCompra;
  }

}
