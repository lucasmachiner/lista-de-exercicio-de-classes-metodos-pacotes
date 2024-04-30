package models;

public class Media {

  private double nota1;
  private double nota2;
  private double nota3;
  private String nome;

  public double getNota1() {
    return this.nota1;
  }

  public void setNota1(double nota1) {
    this.nota1 = nota1;
  }

  public double getNota2() {
    return this.nota2;
  }

  public void setNota2(double nota2) {
    this.nota2 = nota2;
  }

  public double getNota3() {
    return this.nota3;
  }

  public void setNota3(double nota3) {
    this.nota3 = nota3;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Media() {
  }

  public Media(double nota1, double nota2, double nota3, String nome) {
    this.nota1 = nota1;
    this.nota2 = nota2;
    this.nota3 = nota3;
    this.nome = nome;
  }

  public static double calcularMedia(double nota1, double nota2, double nota3) {
    return (nota1 + nota2 + nota3) / 3;
  }

}
