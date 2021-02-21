package com.example.buyer_two.core;

import java.util.Date;

public class Order {
    private String customer;
    private Double total;
    private Integer noOfItems;
    private Date orderDate;

    public Order(){}

    public Order(String customer, Double total, Integer noOfItems, Date orderDate) {
        this.customer = customer;
        this.total = total;
        this.noOfItems = noOfItems;
        this.orderDate = orderDate;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Integer getNoOfItems() {
        return noOfItems;
    }

    public void setNoOfItems(Integer noOfItems) {
        this.noOfItems = noOfItems;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
}
