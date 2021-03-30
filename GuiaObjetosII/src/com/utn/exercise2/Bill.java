package com.utn.exercise2;

import com.utn.exercise2.itemSales;
import com.utn.exercise2.Client;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.UUID;

public class Bill {

    private UUID uuid;
    private LocalDateTime date;
    private Client client;
    private itemSales[] items;

    public Bill() {

    }

    public Bill(Client client, itemSales[] items) {
        this.uuid = UUID.randomUUID();
        this.date = LocalDateTime.now();
        this.client = client;
        this.items = items;
    }

    /** GETTER **/
    public UUID getUuid() {
        return uuid;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public Client getClient() {
        return client;
    }

    public itemSales[] getItems() {
        return items;
    }

    /** toString **/
    @Override
    public String toString() {
        return "Bill { " +
                "uuid = " + uuid +
                ", date = " + date +
                ", PriceT = " + getPriceT() +
                ", client = " + client +
                ", \n\titems = " + Arrays.toString(items) +
                '}';
    }

    public double getPriceT() {
        double total = 0;
        for(itemSales sales : items) {
            if(sales != null) {
                total += sales.getPriceT();
            }
        }
        return (total - (total * (client.getPorcDisc() / 100)));
    }

}
