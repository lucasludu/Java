package com.utn.exercise2;

import java.util.UUID;

public class itemSales {

    private UUID uuid;
    private String name;
    private String description;
    private double priceU;
    private int cuantity;
    private double priceT;

    public itemSales() {

    }

    public itemSales(String name, String description, double priceU, int cuantity) {
        this.uuid = UUID.randomUUID();
        this.name = name;
        this.description = description;
        this.priceU = priceU;
        this.cuantity = cuantity;
        this.priceT = priceU * cuantity;
    }

    /**GETTER **/
    public UUID getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPriceU() {
        return priceU;
    }

    public int getCuantity() {
        return cuantity;
    }

    public double getPriceT() {
        return (priceU * cuantity);
    }

    /** SETTER **/
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPriceU(double priceU) {
        this.priceU = priceU;
    }

    public void setCuantity(int cuantity) {
        this.cuantity = cuantity;
    }

    /** toString **/
    @Override
    public String toString() {
        return "itemSales:\n\t\t\t\t\t { " +
                "uuid = " + uuid +
                ", name = '" + name + '\'' +
                ", description = '" + description + '\'' +
                ", priceU = " + priceU +
                ", cuantity = " + cuantity +
                ", priceT = " + priceT +
                '}';
    }

}
