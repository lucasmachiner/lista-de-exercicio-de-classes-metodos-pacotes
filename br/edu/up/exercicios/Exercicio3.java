package exercicios;

public class Exercicio3 {
    public static double salarioVendedor(double salarioFixo, double totalVendas) {
        double comissao = totalVendas * 0.15;
        double salarioFinal = salarioFixo + comissao;
        return salarioFinal;
    }

    public void exercicio03() {

        Prompt.imprimir("Informe nome do vendedor: ");
        String nome = Prompt.lerLinha();

        Prompt.imprimir("Informe salário fixo: ");
        double salarioFixo = Prompt.lerDecimal();

        Prompt.imprimir("Informe o total de vendas no mês: ");
        double totalVendas = Prompt.lerDecimal();

        Prompt.imprimir("Salário final: " + salarioVendedor(salarioFixo, totalVendas));
    }

}