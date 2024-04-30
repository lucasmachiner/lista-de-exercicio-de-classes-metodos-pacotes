package exercicios;

import models.AlunoMedia;

public class Exercicio8 {
  public void Exercicio08() {
    Prompt.imprimir("Digite o nome do aluno: ");
    String nome = Prompt.lerLinha();

    Prompt.imprimir("Informe primeira nota: ");
    double nota1 = Prompt.lerDecimal();
    Prompt.imprimir("Informe segunda nota: ");
    double nota2 = Prompt.lerDecimal();
    Prompt.imprimir("Informe terceira nota: ");
    double nota3 = Prompt.lerDecimal();

    AlunoMedia al = new AlunoMedia(nome, nota1, nota2, nota3);

    double calcularMedia = al.calcularMedia();

    String mencao = al.obterMencao();

    Prompt.imprimir("Nome: " + al.getNome());
    Prompt.imprimir("Média: " + calcularMedia);
    Prompt.imprimir("Menção: " + mencao);
  }

}
