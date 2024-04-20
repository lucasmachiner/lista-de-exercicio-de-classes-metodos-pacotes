package models;

public class Exercicio4 {
    private double cotacaoDolar;

    public double getCotacaoDolar() {
        return this.cotacaoDolar;
    }

    public void setCotacaoDolar(double cotacaoDolar) {
        this.cotacaoDolar = cotacaoDolar;
    }

    public void Cotacao(double cotacaoDolar) { // Construtor para cotação de dolar
        this.cotacaoDolar = cotacaoDolar;
    }

    public double converterParaDolar(double valorReal) {
        return valorReal / cotacaoDolar;
    }

}
