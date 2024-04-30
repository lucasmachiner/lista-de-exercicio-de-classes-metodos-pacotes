package exercicios;

import models.Prestacao;

public class Exercicio5 {
    public static double prestacao(double valorCompra) {
        double prestacao = valorCompra / 5;
        return prestacao;
    }

    public void exercicio05() {
        Prestacao prestacao = new Prestacao();
        Prompt.imprimir("Informe o valor da compra: R$");
        double valorCompra = Prompt.lerDecimal();

        Prompt.imprimir("valor de cada prestação é: R$" + prestacao(valorCompra));
    }

}
