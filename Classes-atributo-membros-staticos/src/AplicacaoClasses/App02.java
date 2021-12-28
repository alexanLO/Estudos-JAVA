package AplicacaoClasses;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

import Entities.Funcionario;

public class App02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario f = new Funcionario();
        System.out.println("Digite seu nome:");
        f.name = sc.nextLine();
        System.out.println("Digite seu salario bruto:");
        f.salarioBruto = sc.nextDouble();
        System.out.println("Digite a taxa de imposto:");
        f.imposto = sc.nextDouble();

        System.out.println(f);

        
        System.out.println("Digite a quantidade de porcentagem a ser incrementado: ");
         double porcentagem = sc.nextDouble();
        f.IncrementoSalario(porcentagem);
        System.out.println(f);

        sc.close();

    }
}
