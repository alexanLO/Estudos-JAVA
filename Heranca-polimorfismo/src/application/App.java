package application;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportProduct;
import entities.Product;
import entities.UsedProduct;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> listProduct = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {

            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char type = sc.next().charAt(0);
            sc.nextLine();

            if (type == 'i') {
                System.out.print("Name: ");
                String name = sc.next();
                sc.nextLine();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                System.out.print("Custom fee: ");
                Double customFree = sc.nextDouble();

                Product productImport = new ImportProduct(name, price, customFree);

                listProduct.add(productImport);

            } else if (type == 'u') {

                System.out.print("Name: ");
                String name = sc.next();
                sc.nextLine();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date manufactureDate = sdf.parse(sc.next());

                Product usedProduct = new UsedProduct(name, price, manufactureDate);

                listProduct.add(usedProduct);

            } else {

                System.out.print("Name: ");
                String name = sc.next();
                sc.nextLine();
                System.out.print("Price: ");
                double price = sc.nextDouble();

                Product product = new Product(name, price);

                listProduct.add(product);
            }

        }

        //concerta erro de impressao

		System.out.println();
		System.out.println("PRICE TAGS:");
		for (Product product : listProduct) {
			System.out.println(product.priceTag());
		}
		
		sc.close();
    }
}
