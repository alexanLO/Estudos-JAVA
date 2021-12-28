package Application;

import java.util.Locale;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

import Entities.Conta;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Conta c = new Conta();

        System.out.println("Informe o numero da conta:");
        int number = sc.nextInt();
        System.out.println("Informe o nome do títular:");
        String name = sc.next();
        sc.nextLine();

        System.out.println("Você fez o deposito inicial (y/n)?");
        char confirme = sc.next().charAt(0);
        sc.nextLine();
        if (confirme == 'y') {
            System.out.println("Digite o valor:");
            double depositoInicial = sc.nextDouble();
            c = new Conta(number, name, depositoInicial);
        }else{
            c = new Conta(number, name);
        }

        System.out.println("Conta: " + c.getNumber() + ", Name: " + c.getName() + ", Saldo: " + c.getSaldo() );

        sc.close();

    }
}
