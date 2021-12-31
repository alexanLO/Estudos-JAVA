package models.entities;

import models.exceptions.DomainException;

public class Account {
    private int number;
    private String holder;
    private double balance;
    private double withDrawLimit;

    public Account(int number, String holder, double initialBalance, double withDrawLimit) {
        this.setNumber(number);
        this.setHolder(holder);
        this.setBalance(initialBalance);
        this.setWithDrowLimit(withDrawLimit);
    }

    public int getNumber() {
        return number;
    }

    public double getWithDrowLimit() {
        return withDrawLimit;
    }

    public void setWithDrowLimit(double withDrowLimit) {
        this.withDrawLimit = withDrowLimit;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }

    public void withDraw(double amount) {

        if (amount > withDrawLimit) {
            throw new DomainException("O valor excede o limite de saque");
        }
        if (amount > balance) {
            throw new DomainException("Não a saldo suficiente");
        }
        setBalance(getBalance() - amount);
    }
}
