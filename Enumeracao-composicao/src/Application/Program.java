package Application;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.enums.OrderStatus;

public class Program {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        // DADOS DO CLIENTE
        System.out.println("Insira os dados do cliente:");
        System.out.print("Nome: ");
        String name = sc.next();
        sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Qual é a data do seu aniversária (DD/MM/YYYY)? ");
        Date birthDate = Date.valueOf(sc.next());

        Client client = new Client(name, email, birthDate);

        // CRIANDO PEDIDO
        System.out.println("Insira os dados do pedido:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        Order order = new Order(new Date(), status, client);


        
        sc.close();
    }
}
