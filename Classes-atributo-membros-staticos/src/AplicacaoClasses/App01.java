package AplicacaoClasses;

import java.util.Locale;
import java.util.Scanner;

import Entities.Retangulo;

public class App01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a largura e a altura do retângulo:");
        double largura = sc.nextDouble();
        double altura = sc.nextDouble();

        Retangulo r = new Retangulo(largura, altura);

        System.out.printf("Área: %.2f.%n", r.area());
        System.out.printf("Perímetro: %.2f%n", r.perimetro());
        System.out.printf("Diagonal: %.2f%n", r.diagonal());
        
        sc.close();
    }
}
