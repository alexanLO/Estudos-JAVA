import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int tipo;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;


        System.out.println("Escolha o tipo 1 Álcool 2.Gasolina 3.Diesel 4.Para encerrar:");
        tipo = sc.nextInt();

    	while (tipo != 4) {
			if (tipo == 1) {
				alcool = alcool + 1;
			}
			else if (tipo == 2) {
				gasolina = gasolina + 1;
			}
			else if (tipo == 3) {
				diesel = diesel + 1;
			}
			
			tipo = sc.nextInt();
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

        sc.close();
    }
    
}
