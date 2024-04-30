package exercicios;

import models.Triangulo;

public class Exercicio19 {
  public void exercicio19() {
    Triangulo triangulo = new Triangulo();
    Prompt.imprimir("Informe três valores referentes aos lados de um triângulo: ");
    int lado1 = Prompt.lerInteiro();
    int lado2 = Prompt.lerInteiro();
    int lado3 = Prompt.lerInteiro();

    if (triangulo.formaTriangulo(lado1, lado2, lado3)) {
      if (lado1 == lado2 && lado2 == lado3) {
        Prompt.imprimir("Triângulo equilatero");
      } else if (lado1 == lado2 || lado1 == lado2 || lado2 == lado3) {
        Prompt.imprimir("Triangulo isosceles");
      } else {
        Prompt.imprimir("Triangulo escaleno");
      }
    }
  }

}
