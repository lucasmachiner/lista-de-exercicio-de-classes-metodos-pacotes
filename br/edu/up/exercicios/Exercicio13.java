package exercicios;

import models.Apta;

public class Exercicio13 {
  public void exercicio13() {

    Prompt.imprimir("Digite o número de pessoas: ");
    int pessoas = Prompt.lerInteiro();
    Apta apta = new Apta();
    int aptas = 0;
    int naoAptas = 0;

    for (int i = 0; i < pessoas; i++) {

      Prompt.imprimir("Dados da pessoa: " + (i + 1) + ":");
      String nome = Prompt.lerLinha();

      Prompt.imprimir("Sexo(M/F): ");
      String sexo = Prompt.lerLinha();

      Prompt.imprimir("Idade: ");
      int idade = Prompt.lerInteiro();

      Prompt.imprimir("Saúde (S/N): ");
      String saude = Prompt.lerLinha();

      if ((sexo == "M" || sexo == "m") && idade >= 18 && saude == "S") {
        Prompt.imprimir(nome + " está apto para o serviço militar obrigatório.");
        aptas++;
      } else {
        Prompt.imprimir(nome + " não está apto para o serviço militar obrigatório.");
        naoAptas++;
      }

    }

    Prompt.imprimir("Total de pessoas aptas: " + aptas);
    Prompt.imprimir("Total de pessoas não aptas: " + naoAptas);

  }

}
