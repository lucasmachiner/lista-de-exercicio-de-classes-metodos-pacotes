package exercicios;

import models.Cotacao;

public class Exercicio4 {
    public void exercicio04() {

        Prompt.imprimir("Informe a cotação do dolar: ");
        double cotacaoDolar = Prompt.lerDecimal();
        Cotacao cotacao = new Cotacao(cotacaoDolar);

        Prompt.imprimir("Informe a quantidade de reais que deseja converter: ");
        double valorReal = Prompt.lerDecimal();

        double valorDolar = cotacao.converterParaDolar(valorReal);

        Prompt.imprimir("O valor em dolares (US$) é: $" + valorDolar);
    }

}
