import lista.Exercicio1;
import lista.Prompt;

public class Main {
  public static void main(String[] args) {
    int exercico = 0;

    Prompt.imprimir("Informe o número do exercico que deseja executar");
    Prompt.imprimir("1 - Exercicio 1");
    exercico = Prompt.lerInteiro();

    switch (exercico) {
      case 1:
        Prompt.imprimir("Exercicio 1 sendo executado");
        Prompt.separador();
        Exercicio1 aluno1 = new Exercicio1();
        Prompt.imprimir("Informe o nome do aluno");
        aluno1.nome = Prompt.lerLinha();
        Prompt.imprimir("Informe a primeira nota do aluno");
        aluno1.nota1 = Prompt.lerDecimal();
        Prompt.imprimir("Informe a segunda nota do aluno");
        aluno1.nota2 = Prompt.lerDecimal();
        Prompt.imprimir("Informe a terceira nota do aluno");
        aluno1.nota3 = Prompt.lerDecimal();
        aluno1.info();
        break;

      default:
        break;
    }

  }
}