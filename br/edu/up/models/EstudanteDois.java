package models;

public class EstudanteDois {
  private String nome;
  private int matricula;
  private double notaLaboratorio;
  private double notaSemestral;
  private double exameFinal;

  public EstudanteDois() {
  }

  public EstudanteDois(String nome, int matricula, double notaLaboratorio, double notaSemestral, double exameFinal) {
    this.nome = nome;
    this.matricula = matricula;
    this.notaLaboratorio = notaLaboratorio;
    this.notaSemestral = notaSemestral;
    this.exameFinal = exameFinal;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getMatricula() {
    return this.matricula;
  }

  public void setMatricula(int matricula) {
    this.matricula = matricula;
  }

  public double getNotaLaboratorio() {
    return this.notaLaboratorio;
  }

  public void setNotaLaboratorio(double notaLaboratorio) {
    this.notaLaboratorio = notaLaboratorio;
  }

  public double getNotaSemestral() {
    return this.notaSemestral;
  }

  public void setNotaSemestral(double notaSemestral) {
    this.notaSemestral = notaSemestral;
  }

  public double getExameFinal() {
    return this.exameFinal;
  }

  public void setExameFinal(double exameFinal) {
    this.exameFinal = exameFinal;
  }

}
