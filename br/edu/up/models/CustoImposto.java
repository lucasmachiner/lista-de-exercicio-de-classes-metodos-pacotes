package models;

public class CustoImposto {
  public static double custoCarro(double custoFabrica) {
    double impostos = 0.45 * custoFabrica;
    double custoTotal = custoFabrica + impostos;
    double percentagemDistribuidor = 0.28 * custoTotal;
    return custoTotal + percentagemDistribuidor;
  }

}
