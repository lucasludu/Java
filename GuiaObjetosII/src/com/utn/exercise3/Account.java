package com.utn.exercise3;

import com.utn.exercise3.Titular;

import java.util.UUID;

public class Account {

    private static final int OPMAX = 10;

    private UUID uuid;
    private double balance;
    private Titular titular;
    private int opCont = 0;
    private String operations[] = new String[OPMAX];

    public Account() {

    }

    public Account(double balance, Titular titular) {
        this.uuid = UUID.randomUUID();
        this.balance = balance;
        this.titular = titular;
    }

    /** GETTER **/
    public UUID getUuid() {
        return uuid;
    }

    public double getBalance() {
        return balance;
    }

    public Titular getTitular() {
        return titular;
    }

    public String[] getOperations() {
        return operations;
    }

    /** SETTER **/
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /** toString **/
    @Override
    public String toString() {
        return "Account { " +
                "uuid = " + uuid +
                ", balance = " + balance +
                ", titular = " + titular +
                '}';
    }

    /** DEPOSIT **/
    public boolean getDeposit(double amount) {
        boolean correct = true;
        if(amount < 0) {
            correct = false;
        } else {
            documentDeposit(amount);
            this.balance += amount;
        }
        return correct;
    }

    /** EXTRACTION **/
    /*
    public boolean getExtraction(double amount) {
        boolean correct = true;
        if(amount < 0) {
            correct = false;
        } else {
            if(this.balance >= amount) {
                this.balance -= amount;
            }
        }
        return correct;
    }
    */

    public boolean getExtraction(double amount) {
        boolean correct = true;
        if(amount >= -2000) {
            this.balance -= amount;
            documentExtraction(amount);
        } else {
            correct = false;
        }
        return correct;
    }

    public void documentDeposit(double amount) {
        if(this.opCont == OPMAX) {
            this.opCont = 0;
        }
        operations[opCont] = "The Client" + titular.getName() + " deposited $" + amount;
        this.opCont++;
    }

    public void documentExtraction(double amount) {
        if(this.opCont == OPMAX) {
            this.opCont = 0;
        }
        operations[opCont] = "The Client " + titular.getName() + ", extracted $" + amount;
        this.opCont++;
    }

}
