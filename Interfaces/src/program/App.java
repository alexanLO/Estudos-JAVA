package program;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import models.entities.Contrato;
import models.entities.Prestacao;
import models.services.ContratoServico;
import models.services.PaypalServico;

public class App {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ContratoServico cs = new ContratoServico(new PaypalServico());

    try {
        System.out.println("Entre com os dados do contrato:");
        System.out.print("Número: ");
        int numero = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        Date data = (Date) sdf.parse(sc.next());
        System.out.print("Valor: ");
        Double valorTotal = sc.nextDouble();

        Contrato contrato = new Contrato(numero, data, valorTotal);

        System.out.print("Entre com o número de prestações: ");
        int meses = sc.nextInt();

        cs.processoContrato(contrato, meses);

        System.out.println("Prestações:");
        for(Prestacao p : contrato.getPrestacoes()){
            System.out.println(p);
        }
        
    } catch (Exception e) {
   
        System.out.println(e);
    }

    sc.close();
    }
}
