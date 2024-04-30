package exercicios;

import models.Estudante;

public class Exercicio24 {
  public void exercicio24() {
    Estudante estudante = new Estudante();
    Prompt.imprimir("Digite a nota do trabalho de laboratório (0 a 10): ");
    double notaLaboratorio = Prompt.lerDecimal();
    Prompt.imprimir("Digite a nota da avaliação semestral (0 a 10): ");
    double notaAvaliacaoSemestral = Prompt.lerDecimal();
    Prompt.imprimir("Digite a nota do exame final (0 a 10): ");
    double notaExameFinal = Prompt.lerDecimal();

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

    Prompt.imprimir("A nota final do estudante é: " + notaFinal);
  }

}
