package AplicacaoClasses;

import java.util.Locale;
import java.util.Scanner;

import Entities.Aluno;

public class App03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); 
        Scanner sc = new Scanner(System.in);

        Aluno estudante = new Aluno();

        System.out.println("Digite o seu nome:");
        estudante.name = sc.nextLine();
        System.out.println("Digite as três nota do 1° Trimestre: ");
        estudante.trimestre1 = sc.nextDouble();
        estudante.trimestre2 = sc.nextDouble();
        estudante.trimestre3 = sc.nextDouble();

        System.out.printf("Nota final: %.2f%n", estudante.notaFinal());

        if (estudante.notaFinal() < 60.0) {
            System.out.println("Reprovado");
            System.out.printf("Faltou: %.2f%n", estudante.pontosPerdido());
        } else {
            System.out.println("Aprovado");
        }

        sc.close();
    }
    
}
