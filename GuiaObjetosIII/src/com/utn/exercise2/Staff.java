package com.utn.exercise2;

public class Staff extends Person {
    private double salary;
    private char turn;

    /** ESTRUCTURA POR DEFECTO **/
    public Staff() {
        super();
    }

    /** ESTRUCTURA POR PARAMETRO **/
    public Staff(int dni, String name, String surName, String email, String direction, double salary, char turn) {
        super(dni, name, surName, email, direction);
        this.salary = salary;
        this.turn = turn;
    }

    /** GETTER **/
    public double getSalary() {
        return salary;
    }

    public char getTurn() {
        return turn;
    }

    /** SETTER **/
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setTurn(char turn) {
        this.turn = turn;
    }

    /** toString **/
    @Override
    public String toString() {
        return "Staff { " +
                "Person SubClass = " + super.toString() +
                "salary = " + salary +
                ", turn = " + turn +
                '}';
    }
}
