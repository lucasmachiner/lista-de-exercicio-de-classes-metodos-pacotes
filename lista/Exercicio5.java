package lista;

import java.util.Scanner;

public class Exercicio5 {
    public static double prestacao(double valorCompra) {
        double prestacao = valorCompra / 5;
        return prestacao;
    }

    public void exercicio05() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o valor da compra: R$");
        double valorCompra = sc.nextDouble();

        System.out.println("valor de cada prestação é: R$" + prestacao(valorCompra));

        sc.close();
    }

}
