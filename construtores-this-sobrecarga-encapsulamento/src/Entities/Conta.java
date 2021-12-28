package Entities;

public class Conta {
    private int number;
    private String name;
    private double saldo;

    public Conta(){}

    public Conta(int number, String name, double depositoInicial) {
        this.number = number;
        this.name = name;
        deposita(depositoInicial);
    }

    public Conta(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public void deposita(double valor){
        this.saldo += valor;
    }

    public void saque(double valor){
        this.saldo -= (valor + 5.00);
    }

    public int getNumber() {
        return number;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSaldo() {
        return saldo;
    }
}
