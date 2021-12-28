package Entities;

public class Funcionario {
    public String name;
    public double salarioBruto;
    public double imposto;



    public Double SalarioLiquido() {
        return  salarioBruto  - imposto;
    }

    public void IncrementoSalario(double porcentagem) {
        salarioBruto += salarioBruto * porcentagem / 100.0;
    }

    public String toString() {
        return name + ", $ " + String.format("%.2f", SalarioLiquido());
        }
}
