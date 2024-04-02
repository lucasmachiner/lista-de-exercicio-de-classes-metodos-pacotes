package lista;

import java.util.Scanner;

public class Exercicio6 {
    public static double precoVenda(double custoProduto, double porcentagemInfo) {
        return custoProduto + (custoProduto + porcentagemInfo);
    }

    public void exercicio06(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o preço de custo: ");
        double custoProduto= sc.nextDouble();

        System.out.println("Informe o percentual para venda: ");
        double porcentagemInfo = sc.nextDouble();

        System.out.println("Preço de venda: R$" + precoVenda(custoProduto, porcentagemInfo));

        sc.close();


}
