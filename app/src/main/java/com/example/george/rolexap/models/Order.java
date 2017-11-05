package com.example.george.rolexap.models;

/**
 * Created by george on 11/4/2017.
 */

public class Order {
    private String user;
    private String usercontact;
    String location,quantity,orderType;

    public Order() {
    }

    public Order(String user, String usercontact, String location, String quantity, String orderType) {
        this.user = user;
        this.usercontact = usercontact;
        this.location = location;
        this.quantity = quantity;
        this.orderType = orderType;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getUsercontact() {
        return usercontact;
    }

    public void setUsercontact(String usercontact) {
        this.usercontact = usercontact;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    @Override
    public String toString() {
        return "Order{" +
                "user='" + user + '\'' +
                ", usercontact='" + usercontact + '\'' +
                ", location='" + location + '\'' +
                ", quantity='" + quantity + '\'' +
                ", orderType='" + orderType + '\'' +
                '}';
    }
}
