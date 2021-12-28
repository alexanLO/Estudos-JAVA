import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero:");
        int n = sc.nextInt();

        if(n >= 0) {
            System.out.println("Positivo!");
        }else{
            System.out.println("Negativo!");
        }

        sc.close();
    }
}
