package models.entities;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import models.enums.OrderStatus;

public class Order {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

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

    public void addProduct(OrderItem item){
        items.add(item);
    }

    public void removeProduct(OrderItem item){
        items.remove(item);
    }

}
