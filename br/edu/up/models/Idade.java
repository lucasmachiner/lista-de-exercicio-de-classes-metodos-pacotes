package models;

public class Idade {
  private int numPessoas;
  private int idade;

  public Idade() {
  }

  public Idade(int numPessoas, int idade) {
    this.numPessoas = numPessoas;
    this.idade = idade;
  }

  public int getNumPessoas() {
    return this.numPessoas;
  }

  public void setNumPessoas(int numPessoas) {
    this.numPessoas = numPessoas;
  }

  public int getIdade() {
    return this.idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

}
