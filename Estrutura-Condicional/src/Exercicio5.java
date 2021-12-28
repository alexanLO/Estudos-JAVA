import java.sql.Array;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    private static final Object[] Array = null;

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int quantidade, codigo;
        double soma;

        System.out.println("Digite a quantidade e o codigo do pedido:");
        quantidade = sc.nextInt();
        codigo = sc.nextInt();

        if (codigo == 1) {
            soma = quantidade * 4.0;
            System.out.printf("Total a pagar: %.2f%n", soma);
        } 
        else if (codigo == 2) {
            soma = quantidade * 4.5;
            System.out.printf("Total a pagar: %.2f%n", soma);
        }
        else if(codigo == 3){
            soma = quantidade * 5.0;
            System.out.printf("Total a pagar: %.2f%n", soma);
        }
        else if(codigo == 4){
            soma = quantidade * 2.0;
            System.out.printf("Total a pagar: %.2f%n", soma);
        }
        else if(codigo == 5){
            soma = quantidade * 1.53;
            System.out.printf("Total a pagar: %.2f%n", soma);
        }

        sc.close();
    }
}
