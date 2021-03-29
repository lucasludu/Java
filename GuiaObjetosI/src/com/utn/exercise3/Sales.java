package com.utn.exercise3;

import java.util.UUID;

public class Sales {

    private UUID uuid;
    private String description;
    private int cuantity;
    private double priceU;
    private double priceT;

    public Sales() {

    }

    public Sales(String description, int cuantity, double priceU) {
        this.uuid = UUID.randomUUID();
        this.description = description;
        this.cuantity = cuantity;
        this.priceU = priceU;
        this.priceT = cuantity * priceU;
    }

    public Sales(final Sales c) {
        this.uuid = c.uuid;
        this.description = c.description;
        this.cuantity = c.cuantity;
        this.priceU = c.priceU;
    }

    /** GETTER **/
    public UUID getUuid() {
        return uuid;
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
        return (priceU * cuantity);
    }

    /** SETTER **/
    public void setCuantity(int cuantity) {
        this.cuantity = cuantity;
    }

    public void setPriceU(double priceU) {
        this.priceU = priceU;
    }

    /** toString **/
    @Override
    public String toString() {
        return "Sales { " +
                "uuid = " + uuid +
                ", description =' " + description + '\'' +
                ", cuantity = " + cuantity +
                ", priceU = " + priceU +
                ", priceT = " + priceT +
                '}';
    }

}
