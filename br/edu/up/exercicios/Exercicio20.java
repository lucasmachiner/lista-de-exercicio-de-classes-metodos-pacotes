package exercicios;

import models.Escola;

public class Exercicio20 {
  public void exercicio20() {
    Escola escola = new Escola();
    Prompt.imprimir("Informe seu nivel como professor:");
    int nivel = Prompt.lerInteiro();

    double valorHora = 0;
    switch (nivel) {
      case 1:
        valorHora = 12.0;
        break;
      case 2:
        valorHora = 17.0;
        break;
      case 3:
        valorHora = 25.0;
        break;
      default:
        Prompt.imprimir("Nivel invalido");
        break;
    }

    Prompt.imprimir("Informe o número de horas de aula: ");
    int horasAula = Prompt.lerInteiro();

    double salario = valorHora * horasAula;

    Prompt.imprimir("Seu salário como professor: R$" + salario);
  }

}
