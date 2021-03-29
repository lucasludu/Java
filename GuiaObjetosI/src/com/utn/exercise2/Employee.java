package com.utn.exercise2;

public class Employee {

    private int dni = 1234;
    private String name = "Zeljko";
    private String surName = "Volodar";
    private double balance = 25000;

    /** Default Constructor **/
    public Employee() {

    }

    /** Constructor by parameter **/
    public Employee(int dni, String name, String surName, double balance) {
        this.dni = dni;
        this.name = name;
        this.surName = surName;
        this.balance = balance;
    }

    /** Constructor by Copy **/
    public Employee(final Employee c) {
        this.dni = c.dni;
        this.name = c.name;
        this.surName = c.surName;
        this.balance = c.balance;
    }

    /** GETTER **/
    public int getDni() {
        return dni;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public double getBalance() {
        return balance;
    }

    /** SETTER **/
    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /** toString **/
    @Override
    public String toString() {
        return "Employee { " +
                "dni = " + dni +
                ", name = '" + name + '\'' +
                ", surName = '" + surName + '\'' +
                ", balance = " + balance +
                '}';
    }

    /** SALARIO ANUAL**/
    public double getAnualSalary() {
        return (this.balance * 12);
    }

    /** AUMENTO DE SUELDO (PORCENTAJE) **/
    public double getIncrementSalary(double porcentage) {
        this.balance = this.balance + (this.balance * (porcentage / 100));
        return this.balance;
    }

}
