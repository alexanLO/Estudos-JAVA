package models.entities;

import java.sql.Date;
import java.text.SimpleDateFormat;

import models.enums.OrderStatus;

public class Order {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Date moment;
    private OrderStatus status;

    // GET-SET
    public Date getMoment() {
        return moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

}
