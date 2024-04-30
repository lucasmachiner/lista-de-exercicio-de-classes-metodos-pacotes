package exercicios;

import models.Funcionario;

public class Exercicio17 {
  public void exercicio17() {
    Funcionario funcionario = new Funcionario();

    Prompt.imprimir("Digite o nome do funcionário: ");
    String nomeFuncionario = Prompt.lerLinha();

    Prompt.imprimir("Digite o salário do funcionário em reais: ");
    double salario = Prompt.lerDecimal();
    Prompt.imprimir("Digite o valor do salário mínimo em reais: ");
    double salarioMinimo = Prompt.lerDecimal();

    double novoSalario = salario * (1 + 0.1);

    double reajuste = novoSalario - salario;

    Prompt.imprimir("Nome do funcionário: " + nomeFuncionario);
    Prompt.imprimir("Reajuste: R$" + reajuste);
    Prompt.imprimir("Novo salário: R$" + novoSalario);

    double aumentoFolha = novoSalario - salario;

    Prompt.imprimir("Aumento na folha de pagamento da empresa: R$" + aumentoFolha);
  }

}
