package exercicios;

import models.Veiculo;

public class Exercicio12 {
  public void exercicio12() {
    Veiculo veiculo = new Veiculo();
    int carros2000 = 0;
    int carrosAcima2000 = 0;

    String continuar;
    do {
      Prompt.imprimir("Informe ano do veiculo: ");
      int anoVeiculo = Prompt.lerInteiro();

      double desconto;
      if (anoVeiculo <= 2000) {
        desconto = 0.12;
        carros2000++;
      } else {
        desconto = 0.07;
      }

      double valorOriginal = 25000;
      double valorDesconto = valorOriginal * desconto;
      double valorPago = valorOriginal - valorDesconto;

      Prompt.imprimir("Desconto: R$" + valorDesconto);
      Prompt.imprimir("Desconto: R$" + valorPago);

      carrosAcima2000++;

      Prompt.imprimir("Deseja continuar calculando desconto? (S/N)");
      continuar = Prompt.lerLinha();
    } while (continuar == "S" || continuar == "s");

    Prompt.imprimir("Total de carros até 2000: " + carros2000);
    Prompt.imprimir("Total de carros acima dos anos 2000: " + carrosAcima2000);
  }

}
