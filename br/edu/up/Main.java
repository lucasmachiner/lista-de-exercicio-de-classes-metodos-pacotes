import models.Exercicio1;
import models.Exercicio2;
import models.Exercicio3;
import models.Exercicio4;
import models.Exercicio5;
import models.Exercicio6;
import models.Exercicio7;
import models.Prompt;

public class Main {
  public static void main(String[] args) {
    int exercico = 0;

    Prompt.imprimir("Informe o número do exercico que deseja executar");
    Prompt.imprimir("1 - Exercicio 1");
    Prompt.imprimir("2 - Exercicio 2");
    Prompt.imprimir("3 - Exercicio 3");
    Prompt.imprimir("4 - Exercicio 4");
    Prompt.imprimir("5 - Exercicio 5");
    Prompt.imprimir("6 - Exercicio 6");
    Prompt.imprimir("7 - Exercicio 7");
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
      case 2:
        Exercicio2 consumo = new Exercicio2();
        break;
      case 3:
        Exercicio3 funcionario = new Exercicio3();
        break;
      case 4:
        Exercicio4 cotacao = new Exercicio4();
        break;
      case 5:
        Exercicio5 pretacao = new Exercicio5();
        break;
      case 6:
        Exercicio6 venda = new Exercicio6();
        break;
      case 7:
        Exercicio7 carro = new Exercicio7();
        break;
      default:
        break;
    }

  }
}