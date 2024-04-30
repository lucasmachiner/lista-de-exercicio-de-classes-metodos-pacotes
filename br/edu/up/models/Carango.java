package models;

public class Carango {
  private double valorVeiculo;
  private String combustivel;

  public Carango(double valorVeiculo, String combustivel) {
    this.valorVeiculo = valorVeiculo;
    this.combustivel = combustivel;
  }

  public double getValorVeiculo() {
    return this.valorVeiculo;
  }

  public void setValorVeiculo(double valorVeiculo) {
    this.valorVeiculo = valorVeiculo;
  }

  public String getCombustivel() {
    return this.combustivel;
  }

  public void setCombustivel(String combustivel) {
    this.combustivel = combustivel;
  }

  public Carango() {
  }

}
