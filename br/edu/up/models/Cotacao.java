package models;

public class Cotacao {
  private double cotacaoDolar;

  public double getCotacaoDolar() {
    return this.cotacaoDolar;
  }

  public void setCotacaoDolar(double cotacaoDolar) {
    this.cotacaoDolar = cotacaoDolar;
  }

  public Cotacao() {

  }

  public Cotacao(double cotacaoDolar) { // Construtor para cotação de dolar
    this.cotacaoDolar = cotacaoDolar;
  }

  public double converterParaDolar(double valorReal) {
    return valorReal / cotacaoDolar;
  }

}
