package Exercicio01;

import java.util.Scanner;

public class ProgramaVector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Chekin[] vect = new Chekin[10];

        System.out.print("Quantos quartos você deseja? ");
        int n = sc.nextInt();

        for (int i = 1; i < n; i++) {
            System.out.println();
            System.out.println("Quantidade de quartos: " + i + ":");
            System.out.println("Ditie seu nome:");
            String name = sc.nextLine();
            System.out.println("Digite o seu email:");
            String email = sc.nextLine();
            System.out.println("Dite o numero do quato:");
            int quarto = sc.nextInt();
            vect[quarto] = new Chekin(name, email);
        }

        System.out.println();
        System.out.println("Quartos ocupados:");
        for (int i = 0; i < 10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }

        sc.close();
    }

}
