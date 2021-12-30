package entities;


public class Product {
    private String name;
    protected double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String priceTag(){
        StringBuilder sb = new StringBuilder();
        sb.append(name + " $");
        sb.append(price);
        return priceTag();
    }

}
