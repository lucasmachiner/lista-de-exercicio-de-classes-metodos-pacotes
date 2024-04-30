package models;

public class PrecoVenda {
  private double custoProduto;
  private double porcentagemInfo;

  public double getCustoProduto() {
    return this.custoProduto;
  }

  public void setCustoProduto(double custoProduto) {
    this.custoProduto = custoProduto;
  }

  public double getPorcentagemInfo() {
    return this.porcentagemInfo;
  }

  public void setPorcentagemInfo(double porcentagemInfo) {
    this.porcentagemInfo = porcentagemInfo;
  }

  public PrecoVenda() {
  }

  public PrecoVenda(double custoProduto, double porcentagemInfo) {
    this.custoProduto = custoProduto;
    this.porcentagemInfo = porcentagemInfo;
  }

}
