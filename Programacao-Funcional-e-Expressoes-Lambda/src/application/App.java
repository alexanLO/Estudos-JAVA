package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        // d:\in.txt

        System.out.print("Entre com o caminho do arquivo: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String readLine = br.readLine();

            while (readLine != null) {

                String[] fields = readLine.split(",");

                String name = fields[0];
                String email = fields[1];
                double salary = Double.parseDouble(fields[2]);

                employees.add(new Employee(name, email, salary));

                readLine = br.readLine();
            }

            // employees.forEach(System.out::println);

            System.out.println("Entre com o valor do slario: ");
            double dataSalary = sc.nextDouble();

            Comparator<String> comparator = (e1, e2) -> e1.toLowerCase().compareTo(e2.toLowerCase());

            List<String> listEmail = employees.stream().filter(e -> e.getSalary() > dataSalary).map(e -> e.getEmail())
                    .sorted(comparator).collect(Collectors.toList());

            listEmail.forEach(System.out::println);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();

    }
}
