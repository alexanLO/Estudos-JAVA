package entities;

import java.util.Date;
import java.text.SimpleDateFormat;

public final class UsedProduct extends Product{
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date manufactureDate;

    public UsedProduct(String name, double price, Date manufactureDate){
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public static SimpleDateFormat getSdf() {
        return sdf;
    }

    public static void setSdf(SimpleDateFormat sdf) {
        UsedProduct.sdf = sdf;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override

    public String priceTag(){
        StringBuilder sb = new StringBuilder();
 
        sb.append(super.getName());
        sb.append("(used) $");
        sb.append(super.getPrice());
        sb.append(" (Manufacture date: " + manufactureDate + ")");  
        return priceTag();
    }
    
}
