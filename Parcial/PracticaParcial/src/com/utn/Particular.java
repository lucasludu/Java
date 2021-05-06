package com.utn;

import java.util.ArrayList;
import java.util.List;

public class Particular extends Client {

    private List<Order> orders = new ArrayList<>();

    public Particular () {
        super();
    }

    public Particular(String name, String phone, String address) {
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
                "Particular { " +
                "Orders = "     + orders + " " +
                "} " + super.toString();
    }

}
