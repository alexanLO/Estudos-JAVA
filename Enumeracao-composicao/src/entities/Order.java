package entities;

import java.sql.Date;
import java.text.SimpleDateFormat;

import entities.enums.OrderStatus;

public class Order {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private OrderStatus status;
    private Date moment;

    Client client;

    public Order() {
    }

    public Order(Date moment, OrderStatus status, Client client) {
        this.status = status;
        this.moment = moment;
        this.client = client;

    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
    }
}
