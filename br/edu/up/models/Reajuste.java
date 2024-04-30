package models;

public class Reajuste {
  private double salario;
  private double reajuste;

  public Reajuste() {
  }

  public Reajuste(double salario, double reajuste) {
    this.salario = salario;
    this.reajuste = reajuste;
  }

  public double getSalario() {
    return this.salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public double getReajuste() {
    return this.reajuste;
  }

  public void setReajuste(double reajuste) {
    this.reajuste = reajuste;
  }
}
