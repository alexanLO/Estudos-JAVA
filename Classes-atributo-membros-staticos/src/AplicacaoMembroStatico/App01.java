package AplicacaoMembroStatico;

import java.util.Locale;
import java.util.Scanner;

import Entities.Converte;

public class App01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Converte c = new Converte();

        System.out.println("Quanto está o preço do dolar?");
        c.price = sc.nextDouble();
        System.out.println("Quanto de dolar você deseja comprar?");
        c.compra = sc.nextDouble();

        System.out.printf("Valor a ser pago em reais é: %.2f%n", c.total());

    }
}
