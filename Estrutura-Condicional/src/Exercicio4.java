import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int horaI, horaF, duracao;

        System.out.println("Digite a hora inicial e a hora final:");
        horaI = sc.nextInt();
		horaF = sc.nextInt();
		
		if (horaI < horaF) {
			duracao = horaF - horaI;
		}
		else {
			duracao = 24 - horaI + horaF;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		

        sc.close();
    }
}
