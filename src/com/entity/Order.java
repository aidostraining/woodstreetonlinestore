package com.entity;

import java.util.Date;


public class Order extends Main{
    private int orderId;
    private String details;
    private Date orderDate;

    public Order(int orderId, String details,
                 Date orderDate,int getCustomerId, int getProductId){
        this.orderId = orderId;
        this.details = details;
        this.orderDate = orderDate;

    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
}
