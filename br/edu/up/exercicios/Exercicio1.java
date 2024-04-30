package exercicios;

public class Exercicio1 {

  public static double calcularMedia(double nota1, double nota2, double nota3) {
    return (nota1 + nota2 + nota3) / 3;
  }

  public void exercicio01() {
    Prompt.imprimir("Informe nome: ");
    String nome = Prompt.lerLinha();

    Prompt.imprimir("Informe primeira nota: ");
    double nota1 = Prompt.lerDecimal();
    Prompt.imprimir("Informe segunda nota: ");
    double nota2 = Prompt.lerDecimal();
    Prompt.imprimir("Informe terceira nota: ");
    double nota3 = Prompt.lerDecimal();

    Prompt.imprimir("Média: " + calcularMedia(nota1, nota2, nota3));
  }
}
