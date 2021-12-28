package Exercicio02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Funcionario> list = new ArrayList<>();


        System.out.println("Quantidade de funcionários:");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println("Funcionario #" + i + ":");

            System.out.println("Digite o ID:");
            int id = sc.nextInt();
            while(temId(list, id)){
                System.out.println("ID não pode ser repetido");
                id = sc.nextInt();
            }

            System.out.println("Digite o nome:");
            String name = sc.next();
            sc.nextLine();
            System.out.println("Digite o salario:");
            double salario = sc.nextDouble();

            list.add(new Funcionario(id, name, salario));
        }

        System.out.println("Digite o ID:");
        int id = sc.nextInt();
        Funcionario f = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if(f == null){
            System.out.println("Esse dado não existe");
        }else {
            System.out.println("Digite a porcentam do acrescimento:");
            double porcentagem = sc.nextDouble();
            f.incrementoSalario(porcentagem);
        }

        System.out.println();
        System.out.println("Lista de funcinários:");
        for(Funcionario obj: list){
            System.out.println(obj);
        }
        sc.close();

    }

    private static boolean temId(List<Funcionario> list, int id) {
        Funcionario f = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return f != null;
    }
}
