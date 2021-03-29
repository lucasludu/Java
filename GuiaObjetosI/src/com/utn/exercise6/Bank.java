package com.utn.exercise6;

public class Bank {

    private String name;
    private String accountNumber;
    private double interest;
    private double balance;

    public Bank() {

    }

    public Bank(String name, String accountNumber, double interest, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.interest = interest;
        this.balance = balance;
    }

    public Bank (final Bank c) {
        this.name = c.name;
        this.accountNumber = c.accountNumber;
        this.interest = c.interest;
        this.balance = c.balance;
    }

    /** GETTER **/
    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getInterest() {
        return interest;
    }

    public double getBalance() {
        return balance;
    }

    /** SETTER **/
    public void setName(String name) {
        this.name = name;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /** toString **/
    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", interest=" + interest +
                ", balance=" + balance +
                '}';
    }

    /** Entry **/
    public boolean entry(double amount) {
        boolean entryCorrect = true;
        if(amount < 0) {
            entryCorrect = false;
        } else {
            this.balance += amount;
        }
        return entryCorrect;
    }

    /** Refund **/
    public boolean refund(double amound) {
        boolean refundCorrect = true;
        if(amound < 0) {
            if(this.balance >= amound) {
                this.balance -= amound;
            }
        }
        return  refundCorrect;
    }

    /** Transfer **/
    public boolean transfer(Bank c, double amount) {
        boolean correct = true;
        if(amount < 0) {
            correct = false;
        } else {
            if(this.balance >= amount) {
                refund(amount);
                c.entry(amount);
            }
        }
        return correct;
    }

}
