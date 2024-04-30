package models;

public class GrupoRisco {
  public class GrupoRisco {
    private String nome;
    private int idade;
    private int grupoRisco;

    public GrupoRisco() {
    }

    public GrupoRisco(String nome, int idade, int grupoRisco) {
      this.nome = nome;
      this.idade = idade;
      this.grupoRisco = grupoRisco;
    }

    public String getNome() {
      return this.nome;
    }

    public void setNome(String nome) {
      this.nome = nome;
    }

    public int getIdade() {
      return this.idade;
    }

    public void setIdade(int idade) {
      this.idade = idade;
    }

    public int getGrupoRisco() {
      return this.grupoRisco;
    }

    public void setGrupoRisco(int grupoRisco) {
      this.grupoRisco = grupoRisco;
    }

  }

}
