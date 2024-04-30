package exercicios;

import models.Abono;

public class Exercicio18 {
  public void exercicio18() {
    Abono a = new Abono();
    Prompt.imprimir("Informe o nome do funcionario: ");
    String nome = Prompt.lerLinha();
    Prompt.imprimir("Informe a idade do funcionário: ");
    int idade = Prompt.lerInteiro();
    Prompt.imprimir("Digite o sexo do funcionario:(M/F) ");
    String sexo = Prompt.lerLinha().toLowerCase();
    Prompt.imprimir("Digite o salario do funcionario em reais: ");
    double salario = Prompt.lerDecimal();

    double abono = 0;

    if (sexo == "m") {
      if (idade >= 30) {
        abono = 100;
      } else {
        abono = 50;
      }
    } else if (sexo == "f") {
      if (idade >= 30) {
        abono = 200;
      } else {
        abono = 80;
      }
    } else {
      Prompt.imprimir("SEXO INVALIDO");
    }

    double salarioLiq = salario + abono;

    Prompt.imprimir("Funcionário: " + nome);
    Prompt.imprimir("Salário Liquido" + salarioLiq);
  }

}
