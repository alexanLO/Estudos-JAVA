package application;

import java.security.DigestException;
import java.util.Locale;
import java.util.Scanner;


import models.entities.Account;
import models.exceptions.DomainException;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            
            
            System.out.println("Insira os dados da conta bancária:");
    System.out.print("Numero da conta: ");
    int number = sc.nextInt();
    System.out.print("Nome do Titular: ");
    String holder = sc.next();
    sc.nextLine();
    System.out.print("Valor do deposito inicial: ");
    double initialBalance = sc.nextDouble();
    System.out.print("Limite de saque: ");
    double withDrawLimit = sc.nextDouble();
    
    Account acc = new Account(number, holder, initialBalance, withDrawLimit);
    
    System.out.print("Insira o valor a ser sacado: ");
    acc.withDraw(sc.nextDouble());
    System.out.printf("Update saldo: %.2f", acc.getBalance());
    
} catch (DomainException e) {
    System.out.println("Erro no saque: " + e.getMessage());
}
    
    sc.close();
}
}
