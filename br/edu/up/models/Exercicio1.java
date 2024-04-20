package models;

public class Exercicio1 {

  public String nome;
  public double nota1;
  public double nota2;
  public double nota3;

  public double media() {
    Double calcMedia = (this.nota1 + this.nota2 + this.nota3) / 3;
    return calcMedia;
  }

  public void info() {
    Prompt.imprimir("O aluno " + this.nome + ", teve a média de: " + this.media());
  }

}
