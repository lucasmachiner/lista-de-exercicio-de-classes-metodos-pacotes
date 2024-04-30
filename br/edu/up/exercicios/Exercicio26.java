package exercicios;

import models.GrupoRisco;

public class Exercicio26 {
  public void exercicio26() {
    GrupoRisco gp = new GrupoRisco();
    Prompt.imprimir("Digite o nome do pretendente: ");
    String nome = Prompt.lerLinha();
    Prompt.imprimir("Digite a idade do pretendente: ");
    int idade = Prompt.lerInteiro();
    Prompt.imprimir("Digite o grupo de risco do pretendente (1 - Baixo, 2 - Médio, 3 - Alto): ");
    int grupoRisco = Prompt.lerInteiro();

    if (idade < 17 || idade > 70) {
      Prompt.imprimir("O pretendente não se enquadra na faixa etária necessária para adquirir uma apólice de seguro.");
      return;
    }

    int categoria;
    if (idade >= 17 && idade <= 20) {
      categoria = grupoRisco;
    } else if (idade >= 21 && idade <= 24) {
      categoria = grupoRisco + 1;
    } else if (idade >= 25 && idade <= 34) {
      categoria = grupoRisco + 2;
    } else if (idade >= 35 && idade <= 64) {
      categoria = grupoRisco + 3;
    } else {
      categoria = grupoRisco + 6;
    }

    Prompt.imprimir("Nome do pretendente: " + nome);
    Prompt.imprimir("Idade do pretendente: " + idade);
    Prompt.imprimir("Grupo de risco do pretendente: " + grupoRisco);
    Prompt.imprimir("Categoria do pretendente: " + categoria);
  }

}
