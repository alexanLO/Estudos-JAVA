import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            int v3 = sc.nextInt();

            double soma = (v1 * 2 + v2 * 3 + v3 * 5) / 10;

            System.out.printf("A media ponderada é de : %.1f%n", soma);

        }

        sc.close();
    }

}
