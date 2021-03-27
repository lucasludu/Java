package com.utn.ejercicio4;

public class Banco {

    private int id;
    private String nombre;
    private double balance;

    public Banco(int id, String nombre, double balance) {
        this.id = id;
        this.nombre = nombre;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", balance=" + balance +
                '}';
    }

    public double getCredito(double monto) {
        this.balance = this.balance + monto;
        return  balance;
    }

    public double getDebito (double monto) {
        if(this.balance > monto) {
            this.balance = this.balance - monto;
        }
        return this.balance;
    }

}
