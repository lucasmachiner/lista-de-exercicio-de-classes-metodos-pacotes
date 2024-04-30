package exercicios;

import models.Quantidade;

public class Exercicio11 {
  public void exercicio11() {
    Quantidade qtd = new Quantidade();
    int mulher = 0;
    int homem = 0;

    for (int i = 0; i < 56; i++) {
      Prompt.imprimir("Digite o sexo: ");
      String sexo = Prompt.lerLinha();
      sexo.toUpperCase();

      if (sexo == "h") {
        Prompt.imprimir(" Homem");
        homem++;
      } else if (sexo == "m") {
        Prompt.imprimir("Mulher");
        mulher++;
      }
    }
    Prompt.imprimir("Qtd Homens: " + homem);
    Prompt.imprimir("Qtd Mulher: " + mulher);
  }

}
