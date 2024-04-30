package exercicios;

import models.Idade;

public class Exercicio10 {
  public void exercicio10() {
    Idade idades = new Idade();
    Prompt.imprimir("Digite o número de pessoas: ");
    int numPessoas = Prompt.lerInteiro();

    for (int i = 0; i < numPessoas; i++) {
      Prompt.imprimir("Informe idade da pessoa: " + (i + 1));
      int idade = Prompt.lerInteiro();

      if (idade >= 18) {
        Prompt.imprimir("Maior de idade");
      } else {
        Prompt.imprimir("Menor de idade");
      }
    }
  }

}
