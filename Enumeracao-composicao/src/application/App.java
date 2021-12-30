package application;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import models.entities.Client;
import models.entities.Order;
import models.entities.OrderItem;
import models.entities.Product;
import models.enums.OrderStatus;

public class App {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        // CRIANDO UM NOVO CLIENTE
        System.out.println("Insira os dados do cliente:");
        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Qual a data do seu nascimento: ");
        Date birthDate = sdf.parse(sc.next());

        Client client = new Client(name, email, birthDate);

        // CRIANDO UM PEDIDO
        System.out.println("Insira os dados do pedido:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        Order order = new Order(new Date(), status, client);

        System.out.print("Quantos produtos tem o seu pedido? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Insira o #" + i + " produto:");
            System.out.print("Nome: ");
            String productName = sc.next();
            sc.nextLine();
            System.out.print("Preço: ");
            double productPrice = sc.nextDouble();

            Product product = new Product(productName, productPrice);

            System.out.print("Quantidade: ");
            int quantity = sc.nextInt();

            OrderItem orderItem = new OrderItem(quantity, productPrice, product);

            order.addProduct(orderItem);
        }

        // IMPRIMINDO NA TELA

        System.out.println();
        System.out.println("Resumo do pedido:");
        System.out.println(order);
        sc.close();
    }
}
