package exercicios;

import models.CustoImposto;

public class Exercicio7 {
    public void exercicio07() {
        CustoImposto custoImposto = new CustoImposto();
        Prompt.imprimir("Informe o preço de custo da fabrica: ");
        double custoFabrica = Prompt.lerDecimal();

        Prompt.imprimir("Custo ao consumidor final: " + custoImposto.custoCarro(custoFabrica));
    }

}
