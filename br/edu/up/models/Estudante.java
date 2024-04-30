package models;

public class Estudante {
  private double notaLaboratorio;
  private double notaSemestral;

  public Estudante() {
  }

  private double exameFinal;

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

  public Estudante(double notaLaboratorio, double notaSemestral, double exameFinal) {
    this.notaLaboratorio = notaLaboratorio;
    this.notaSemestral = notaSemestral;
    this.exameFinal = exameFinal;
  }

}
