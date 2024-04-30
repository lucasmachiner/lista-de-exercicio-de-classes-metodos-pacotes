package exercicios;

import models.Lucro;

public class Exercicio14 {
  public void exercicio14() {
    double somaCusto = 0;
    double somaVenda = 0;
    Lucro lucro = new Lucro();
    for (int i = 0; i < 40; i++) {
      Prompt.imprimir("Produto: " + i + ":");
      Prompt.imprimir("Preço de custo: R$");
      double custo = Prompt.lerDecimal();
      Prompt.imprimir("Preço de venda: R$:");
      double venda = Prompt.lerDecimal();

      if (venda > custo) {
        Prompt.imprimir("Produto " + i + ": Lucro");
      } else if (venda < custo) {
        Prompt.imprimir("Produto " + i + ": Prejuizo");
      } else {
        Prompt.imprimir("Produto: " + i + ": Empate");
      }
      somaCusto += custo;
      somaVenda += venda;
    }
    double mediaCusto = somaCusto / 40;
    double mediaVenda = somaVenda / 40;

    Prompt.imprimir("Média de custo: " + mediaCusto);
    Prompt.imprimir("Média de venda: " + mediaVenda);
  }

}
