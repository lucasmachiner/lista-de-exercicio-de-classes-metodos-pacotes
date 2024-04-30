package exercicios;

public class Exercicio16 {
  public void exercicio16() {

    double salarioMinimo = 1400;

    for (int i = 0; i < 584; i++) {
      Prompt.imprimir("Digite o salario do funcionario " + i + " em reais: ");
      double salario = Prompt.lerDecimal();

      double reajuste;
      if (salario < 3 * salarioMinimo) {
        reajuste = salario * 0.5;
      } else if (salario >= 3 * salarioMinimo && salario <= 10 * salarioMinimo) {
        reajuste = salario * 0.2;
      } else if (salario > 10 * salarioMinimo && salario <= 20 * salarioMinimo) {
        reajuste = salario * 0.15;
      } else {
        reajuste = salario * 0.1; // 10%
      }
      double novoSalario = salario + reajuste;

      Prompt.imprimir("Novo salario do funcionario: " + i + ": R$ " + novoSalario);
    }
  }
}
