package exercicios;

import models.ContaLuz;

public class Exercicio22 {
  public void exercicio22() {
    ContaLuz cl = new ContaLuz();
    Prompt.imprimir("Digite seu tipo de cliente: 1-residencia - 2-comercio - 3-industria");
    int cliente = Prompt.lerInteiro();

    Prompt.imprimir("Informe kwh:");
    double qtdKwh = Prompt.lerDecimal();

    double valorKWh;
    switch (cliente) {
      case 1:
        valorKWh = 0.60;
        break;
      case 2:
        valorKWh = 0.48;
        break;
      case 3:
        valorKWh = 1.29;
        break;
      default:
        Prompt.imprimir("Tipo de cliente inválido. Digite 1, 2 ou 3.");
        return;
    }

    double valorConta = qtdKwh * valorKWh;

    Prompt.imprimir("VALOR DA CONTA: R$" + valorConta);
  }

}
