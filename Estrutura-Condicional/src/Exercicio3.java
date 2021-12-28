import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A, B;

        System.out.println("Digite o valor de A e B");
        A = sc.nextInt();
        B = sc.nextInt();

        if(A % B == 0 || B % A == 0) {
            System.out.println("São multiplos");
        }else{
            System.out.println("Não são multiplos");
        }

        sc.close();
    }
}
