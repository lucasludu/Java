package com.utn;

public class Order {

    private Client client = new Client();
    private Product product = new Product();
    private double distance = 0;
    private double deliveryPrice;
    private double totalPrice;

    public Order () {

    }

    public Order(Client client, Product product, double distance) {
        this.client = client;
        this.product = product;
        this.distance = distance;
        this.deliveryPrice = distance * 2;
        this.totalPrice = distance + deliveryPrice;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = (distance > 0) ? this.distance = distance : Double.parseDouble("Distance is not negative");
    }

    public double getDeliveryPrice() {
        return distance * 2;
    }

    public void setDeliveryPrice(double deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }

    public double getTotalPrice() {
        return distance + deliveryPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return
                "Order { " +
                "Client = "         + client        + ", " +
                "Product = "        + product       + ", " +
                "Distance = "       + distance      + ", " +
                "Delivery Price = " + deliveryPrice + ", " +
                "Total Price = "    + totalPrice    + " "  +
                '}';
    }
}
