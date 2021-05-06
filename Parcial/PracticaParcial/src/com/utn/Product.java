package com.utn;

public class Product {

    private int number;
    private String name;
    private double price;

    public Product () {

    }

    public Product(int number, String name, double price) {
        this.number = number;
        this.name = name;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "Product { " +
                "Number = "  + number        + ", " +
                "Name = '"   + name   + '\'' + ", " +
                "Price = "   + price         + " "  +
                '}';
    }
}
