package exercicios;

import models.PrecoVenda;

public class Exercicio6 {
    public static double precoVenda(double custoProduto, double porcentagemInfo) {
        return custoProduto + (custoProduto + porcentagemInfo);
    }

    public void exercicio06() {
        PrecoVenda pc = new PrecoVenda();

        Prompt.imprimir("Informe o preço de custo: ");
        double custoProduto = Prompt.lerDecimal();

        Prompt.imprimir("Informe o percentual para venda: ");
        double porcentagemInfo = Prompt.lerDecimal();

        Prompt.imprimir("Preço de venda: R$" + precoVenda(custoProduto, porcentagemInfo));
    }

}
