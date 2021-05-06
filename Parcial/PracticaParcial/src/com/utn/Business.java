package com.utn;

import java.util.ArrayList;
import java.util.List;

public class Business extends Client {

    private List<Order> orders = new ArrayList<>();

    public Business () {
        super();
    }

    public Business(String name, String phone, String address) {
        super(name, phone, address);
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return
                "Business { "   +
                "Orders = "     + orders + " " +
                "} " + super.toString();
    }

}
