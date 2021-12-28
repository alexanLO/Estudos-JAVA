package Entities;

public class Converte {
    public double price;
    public double compra;

    public double total(){
        return (price * 0.06 + price)* compra;
    }
}
