package exercicios;

import models.PesoIdeal;

public class Exercicio23 {
  public void exercicio23() {

    PesoIdeal peso = new PesoIdeal();
    Prompt.imprimir("Digite o nome da pessoa: ");
    String nome = Prompt.lerLinha();
    Prompt.imprimir("Digite o sexo da pessoa (M/F): ");
    String sexo = Prompt.lerLinha().toLowerCase();
    Prompt.imprimir("Digite a altura da pessoa em metros: ");
    double altura = Prompt.lerDecimal();
    Prompt.imprimir("Digite a idade da pessoa: ");
    int idade = Prompt.lerInteiro();

    double pesoIdeal;
    if (sexo == "m") {
      if (altura > 1.70) {
        if (idade <= 20)
          pesoIdeal = (72.7 * altura) - 58;
        else if (idade >= 21 && idade <= 39)
          pesoIdeal = (72.7 * altura) - 53;
        else
          pesoIdeal = (72.7 * altura) - 45;
      } else {
        if (idade <= 40)
          pesoIdeal = (72.7 * altura) - 50;
        else
          pesoIdeal = (72.7 * altura) - 58;
      }
    } else if (sexo == "f") {
      if (altura > 1.50) {
        if (idade >= 35)
          pesoIdeal = (62.1 * altura) - 45;
        else
          pesoIdeal = (62.1 * altura) - 49;
      } else {
        pesoIdeal = (62.1 * altura) - 44.7;
      }
    } else {
      Prompt.imprimir("Sexo inválido. Utilize M ou F.");
      return;
    }

    Prompt.imprimir("Nome: " + nome);
    Prompt.imprimir("Peso Ideal: " + pesoIdeal + " kg");
  }
}

class Pessoa {
  private String nome;

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public char getSexo() {
    return this.sexo;
  }

  public void setSexo(char sexo) {
    this.sexo = sexo;
  }

  public double getAltura() {
    return this.altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  public int getIdade() {
    return this.idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  private char sexo;
  private double altura;
  private int idade;

  public Pessoa() {

  }

  public Pessoa(String nome, char sexo, double altura, int idade) {
    this.nome = nome;
    this.sexo = sexo;
    this.altura = altura;
    this.idade = idade;
  }

}
