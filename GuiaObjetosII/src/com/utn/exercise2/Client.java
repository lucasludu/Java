package com.utn.exercise2;

import java.util.UUID;

public class Client {

    private UUID uuid;
    private String name;
    private String email;
    private double discPorc;

    public Client() {

    }

    public Client(String name, String email, double porcDisc) {
        this.uuid = UUID.randomUUID();
        this.name = name;
        this.email = email;
        this.discPorc = porcDisc;
    }

    /** GETTER **/
    public UUID getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getPorcDisc() {
        return discPorc;
    }

    /** SETTER **/
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPorcDisc(double porcDisc) {
        this.discPorc = porcDisc;
    }

    /** toString **/
    @Override
    public String toString() {
        return "Client{" +
                "uuid=" + uuid +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", discPorc=" + discPorc +
                '}';
    }

    public void getClient() {
        System.out.println("UUID..................: " + this.uuid);
        System.out.println("Name..................: " + this.name);
        System.out.println("Email.................: " + this.email);
        System.out.println("Discount Porcentage...: " + this.discPorc);
    }
}
