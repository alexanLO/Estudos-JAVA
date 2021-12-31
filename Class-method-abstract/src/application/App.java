package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import models.entities.ContributionData;
import models.entities.LegalPerson;
import models.entities.PhysicalPerson;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<ContributionData> listContributionData = new ArrayList<>();

        System.out.print("Insira a quantidade d contribuinte: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Dados do contribuinte #" + i + ":");
            System.out.print("pessoa fisica ou jurídica (f/j)? ");
            char type = sc.next().charAt(0);

            if (type == 'f') {
                System.out.print("Nome: ");
                String name = sc.next();
                sc.nextLine();
                System.out.print("Renda anual: ");
                double annualIncome = sc.nextDouble();
                System.out.print("Despesas com saude: ");
                double healthExpenses = sc.nextDouble();

                ContributionData physicalPerson = new PhysicalPerson(name, annualIncome, healthExpenses);
                listContributionData.add(physicalPerson);
            } else {
                System.out.print("Nome: ");
                String name = sc.next();
                sc.nextLine();
                System.out.print("Renda anual: ");
                double annualIncome = sc.nextDouble();
                System.out.print("Insira a quantidade de funcionários: ");
                int numberEmployees = sc.nextInt();

                ContributionData legalPerson = new LegalPerson(name, annualIncome, numberEmployees);
                listContributionData.add(legalPerson);
            }
        }

        double sum = 0.0;
        System.out.println();
        System.out.println("IMPOSTOS PAGOS");
        for(ContributionData contribution : listContributionData) {
            double tax = contribution.tax();
            System.out.println(contribution.getName() + ": $" + String.format("%.2f", tax));
            sum += tax;
        }
        System.out.println();
        System.out.println("Imposto total: $" + String.format("%.2f", sum));
        sc.close();
    }
}
