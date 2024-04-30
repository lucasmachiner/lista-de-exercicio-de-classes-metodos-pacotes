package exercicios;

import models.Consumo;

public class Exercicio2 {
    public void exercicio02() {
        Consumo consumo = new Consumo();

        Prompt.imprimir("Informe a distância percorrida: ");
        double distanciaPercorrida = Prompt.lerDecimal();

        Prompt.imprimir("Informe o total de combustivel gasto: ");
        double combustivelGasto = Prompt.lerDecimal();

        Prompt.imprimir("Consumo médio: " + consumo.consumoAutomovel(distanciaPercorrida, combustivelGasto));
    }

}
