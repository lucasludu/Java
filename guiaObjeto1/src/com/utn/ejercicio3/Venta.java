package com.utn.ejercicio3;

public class Venta {

    private int id;
    private String description;
    private int cuantity;
    private double priceU;
    private double priceT;

    public Venta (int id, String description, int cuantity, double priceU) {
        this.id = id;
        this.description = description;
        this.cuantity = cuantity;
        this.priceU = priceU;
        this.priceT = priceU * cuantity;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public int getCuantity() {
        return cuantity;
    }

    public double getPriceU() {
        return priceU;
    }

    public double getPriceT() {
        return priceU * cuantity;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", cuantity=" + cuantity +
                ", priceU=" + priceU +
                ", priceT=" + priceT +
                '}';
    }

}
