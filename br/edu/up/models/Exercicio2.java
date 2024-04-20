package models;

public class Exercicio2 {
    private double distanciaPecorrida;
    private double combustivelGasto;

    public double getDistanciaPecorrida() {
        return this.distanciaPecorrida;
    }

    public void setDistanciaPecorrida(double distanciaPecorrida) {
        this.distanciaPecorrida = distanciaPecorrida;
    }

    public double getCombustivelGasto() {
        return this.combustivelGasto;
    }

    public void setCombustivelGasto(double combustivelGasto) {
        this.combustivelGasto = combustivelGasto;
    }

    public void Consumo(double distanciaPecorrida, double combustivelGasto) {
        this.distanciaPecorrida = distanciaPecorrida;
        this.combustivelGasto = combustivelGasto;
    }

    public static double consumoAutomovel(double distanciaPecorrida, double combustivelGasto) {
        return (distanciaPecorrida / combustivelGasto);
    }

}
