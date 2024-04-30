package models;

public class Quantidade {
  private int mulher;
  private int homem;
  private char sexo;

  public Quantidade() {
  }

  public Quantidade(int mulher, int homem, char sexo) {
    this.mulher = mulher;
    this.homem = homem;
    this.sexo = sexo;
  }

  public int getMulher() {
    return this.mulher;
  }

  public void setMulher(int mulher) {
    this.mulher = mulher;
  }

  public int getHomem() {
    return this.homem;
  }

  public void setHomem(int homem) {
    this.homem = homem;
  }

  public char getSexo() {
    return this.sexo;
  }

  public void setSexo(char sexo) {
    this.sexo = sexo;
  }

}
