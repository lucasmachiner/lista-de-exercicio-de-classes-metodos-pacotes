package exercicios;

import models.Contador;

public class Exercicio9 {
  public void exercicio09() {
    int contador = 0;
    Contador contado = new Contador();
    for (int i = 0; i < 80; i++) {
      Prompt.imprimir("Informe um número: ");
      int numero = Prompt.lerInteiro();

      if (numero >= 10 && numero <= 150) {
        contador++;
      }
    }
    Prompt.imprimir("Quantidade de números entre 10 e 150: " + contador);
  }

}
