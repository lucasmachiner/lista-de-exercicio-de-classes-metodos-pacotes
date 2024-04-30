package exercicios;

public class Exercicio15 {
  public void exercicio15() {

    double totalDesc = 0;
    double totalPago = 0;
    double desconto = 0;

    while (true) {
      Prompt.imprimir("Digite o tipo de combustivel que deseja: (alcool, diesel ou gasolina) 0 para encerrar: ");
      String combustivel = Prompt.lerLinha().toLowerCase();

      if (combustivel.equals(0)) {
        break;
      }

      Prompt.imprimir("Digite o valor do veiculo: ");
      double valorVeiculo = Prompt.lerDecimal();

      switch (combustivel) {
        case "alcool":
          desconto = 0.25 * valorVeiculo;
          break;
        case "diesel":
          desconto = 0.14 * valorVeiculo;
          break;
        case "gasolina":
          desconto = 0.21 * valorVeiculo;
          break;

        default:
          Prompt.imprimir("Tipo de combustivel invalido. Tente novamente");
          break;
      }
      double valorPago = valorVeiculo - desconto;
      totalDesc += desconto;
      totalPago += valorPago;

      Prompt.imprimir("Desconto: R$" + desconto);
      Prompt.imprimir("Valor a ser pago pelo cliente: R$" + valorPago);

      Prompt.lerLinha();
    }

    Prompt.imprimir("Total de desconto: R$" + totalDesc);
    Prompt.imprimir("Total pago pelos clientes: R$" + totalPago);
  }

}
