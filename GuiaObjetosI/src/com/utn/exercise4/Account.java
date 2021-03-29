package com.utn.exercise4;

import java.util.UUID;

public class Account {

    private UUID uuid;
    private String name;
    private double balance;

    public Account(String name, double balanace) {
        this.uuid = UUID.randomUUID();
        this.name = name;
        this.balance = balanace;
    }

    /** GETTER **/
    public UUID getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    /** SETTER **/
    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /** toString **/
    @Override
    public String toString() {
        return "Account { " +
                "uuid = " + uuid +
                ", name =' " + name + '\'' +
                ", balance = " + balance +
                '}';
    }

    /** GET CREDITO **/
    public double getCredit(double amount) {
        return (this.balance += amount);
    }

    /** GET DEBITO **/
    public boolean getDebit(double amount) {
        boolean correct = true;
        if(this.balance > amount) {
            this.balance -= amount;
        } else {
            correct = false;
        }
        return correct;
    }

}
