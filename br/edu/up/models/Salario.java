package models;

public class Salario {
  private String nome;
  private double salarioFixo;
  private double totalVendas;

  public Salario(String nome, double salarioFixo, double totalVendas) {
    this.nome = nome;
    this.salarioFixo = salarioFixo;
    this.totalVendas = totalVendas;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getSalarioFixo() {
    return this.salarioFixo;
  }

  public void setSalarioFixo(double salarioFixo) {
    this.salarioFixo = salarioFixo;
  }

  public double getTotalVendas() {
    return this.totalVendas;
  }

  public void setTotalVendas(double totalVendas) {
    this.totalVendas = totalVendas;
  }

  public Salario() {
  }

}
