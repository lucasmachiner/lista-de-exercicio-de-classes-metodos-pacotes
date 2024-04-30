package exercicios;

import models.EstudanteDois;

public class Exercicio25 {
  public void exercicio25() {
    Prompt.imprimir("Digite o nome do estudante: ");
    String nome = Prompt.lerLinha();
    Prompt.imprimir("Digite o número de matrícula do estudante: ");
    int matricula = Prompt.lerInteiro();
    Prompt.imprimir("Digite a nota do trabalho de laboratório (0 a 10): ");
    double notaLaboratorio = Prompt.lerDecimal();
    Prompt.imprimir("Digite a nota da avaliação semestral (0 a 10): ");
    double notaAvaliacaoSemestral = Prompt.lerDecimal();
    Prompt.imprimir("Digite a nota do exame final (0 a 10): ");
    double notaExameFinal = Prompt.lerDecimal();
    EstudanteDois estudanteDois = new EstudanteDois();

    if (notaLaboratorio < 0 || notaLaboratorio > 10 ||
        notaAvaliacaoSemestral < 0 || notaAvaliacaoSemestral > 10 ||
        notaExameFinal < 0 || notaExameFinal > 10) {
      Prompt.imprimir("As notas devem estar no intervalo de 0 a 10.");
      return;
    }

    double pesoLaboratorio = 2;
    double pesoAvaliacaoSemestral = 3;
    double pesoExameFinal = 5;
    double notaFinal = (notaLaboratorio * pesoLaboratorio +
        notaAvaliacaoSemestral * pesoAvaliacaoSemestral +
        notaExameFinal * pesoExameFinal) / (pesoLaboratorio + pesoAvaliacaoSemestral + pesoExameFinal);

    String classificacao;
    if (notaFinal >= 8 && notaFinal <= 10) {
      classificacao = "A";
    } else if (notaFinal >= 7 && notaFinal < 8) {
      classificacao = "B";
    } else if (notaFinal >= 6 && notaFinal < 7) {
      classificacao = "C";
    } else if (notaFinal >= 5 && notaFinal < 6) {
      classificacao = "D";
    } else {
      classificacao = "R";
    }

    Prompt.imprimir("Nome do estudante: " + nome);
    Prompt.imprimir("Número de matrícula: " + matricula);
    Prompt.imprimir("Nota final: " + notaFinal);
    Prompt.imprimir("Classificação: " + classificacao);
  }

}
