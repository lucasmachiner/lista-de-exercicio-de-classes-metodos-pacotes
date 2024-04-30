package models;

public class Veiculo {
  private int carros2000;
  private int carrosAcima2000;

  public Veiculo() {
  }

  public Veiculo(int carros2000, int carrosAcima2000) {
    this.carros2000 = carros2000;
    this.carrosAcima2000 = carrosAcima2000;
  }

  public int getCarros2000() {
    return this.carros2000;
  }

  public void setCarros2000(int carros2000) {
    this.carros2000 = carros2000;
  }

  public int getCarrosAcima2000() {
    return this.carrosAcima2000;
  }

  public void setCarrosAcima2000(int carrosAcima2000) {
    this.carrosAcima2000 = carrosAcima2000;
  }

}
