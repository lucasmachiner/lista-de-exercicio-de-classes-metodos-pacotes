package exercicios;

import models.Nadador;

public class Exercicio21 {
  public void exercicio21() {
    Nadador nadador = new Nadador();
    Prompt.imprimir("Digite a idade do nadador: ");
    int idade = Prompt.lerInteiro();

    String categoria;
    if (idade >= 5 && idade <= 7) {
      categoria = "Infantil A";
    } else if (idade >= 8 && idade <= 10) {
      categoria = "Infantil B";
    } else if (idade >= 11 && idade <= 13) {
      categoria = "Juvenil A";
    } else if (idade >= 14 && idade <= 17) {
      categoria = "Juvenil B";
    } else if (idade >= 18 && idade <= 25) {
      categoria = "Sênior";
    } else {
      categoria = "Idade fora da faixa etária";
    }

    Prompt.imprimir("Categoria do nadador: " + categoria);
  }

}
