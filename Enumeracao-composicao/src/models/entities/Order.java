package models.entities;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import models.enums.OrderStatus;

public class Order {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date momentDate;
    private OrderStatus status;

    private List<OrderItem> items = new ArrayList<>();

    private Client client;

    public Order(Date momentDate, OrderStatus status, Client client) {
        this.momentDate = momentDate;
        this.status = status;
        this.client = client;
    }

    // GET-SET

    public void setMomentDate(Date momentDate) {
        this.momentDate = momentDate;
    }

    public Date getMomentDate() {
        return momentDate;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void addProduct(OrderItem item) {
        items.add(item);
    }

    public void removeProduct(OrderItem item) {
        items.remove(item);
    }

    public double total() {
        double sum = 0.0;
        for (OrderItem item : items) {
            sum += item.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Momento do pedido: ");
        sb.append(sdf.format(momentDate) + "\n");
        sb.append("Status do pedido: ");
        sb.append(status + "\n");
        sb.append("Cliente: ");
        sb.append(client + "\n");
        sb.append("Items do Pedido: /n");
        for (OrderItem item : items) {
            sb.append(item + "\n");
        }
        sb.append("Preço total: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }

}
