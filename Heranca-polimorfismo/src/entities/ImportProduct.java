package entities;

public class ImportProduct extends Product {
    private double customsFree;

    public ImportProduct(String name, double price, double customFree) {
        super(name, price);
        this.setCustomsFree(customFree);
    }

    public double getCustomsFree() {
        return customsFree;
    }

    public void setCustomsFree(double customsFree) {
        this.customsFree = customsFree;
    }

    public double totalPrice() {
        return price += price * customsFree;
    }

    @Override

    public String priceTag() {
        StringBuilder sb = new StringBuilder();
        super.priceTag();
        sb.append(" (Custom free: $");
        sb.append(customsFree + ")");

        return priceTag();
    }
}
