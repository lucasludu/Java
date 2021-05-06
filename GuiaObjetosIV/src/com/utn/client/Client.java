package com.utn.client;

import com.utn.video.Rent;

import java.util.ArrayList;
import java.util.List;

public class Client {

    /** Atributes **/
    public static int cont = 0;

    private int id = 0;
    private String name = "";
    private int telephone = 0;
    private String address = "";

    private List<Rent> rent = new ArrayList<>();

    /** Constructor **/
    public Client () {

    }

    public Client(String name, int telephone, String address) {
        this.id         = cont++;
        this.name       = name;
        this.telephone  = telephone;
        this.address    = address;
    }

    /** GETTER **/
    public static int getCont() {
        return cont;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getTelephone() {
        return telephone;
    }

    public String getAddress() {
        return address;
    }

    public List<Rent> getRent() {
        return rent;
    }

    /** SETTER **/
    public static void setCont(int cont) {
        Client.cont = cont;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setRent(List<Rent> rent) {
        this.rent = rent;
    }

    /** toString **/
    @Override
    public String toString() {
        return
                "Client { " +
                "ID = "         + id                + ", " +
                "Name = '"      + name      + '\''  + ", " +
                "Telephone = "  + telephone         + ", " +
                "Address = '"   + address   + '\''  + " "  +
                '}';
    }

}
