package com.utn.exercise2;

public class Person {
    private int dni;
    private String name;
    private String surName;
    private String email;
    private String address;

    /** ESTRUCTURA POR DEFECTO **/
    public Person() {

    }

    /** ESTRUCTURA POR PARAMETRO **/
    public Person(int dni, String name, String surName, String email, String address) {
        this.dni = dni;
        this.name = name;
        this.surName = surName;
        this.email = email;
        this.address = address;
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

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
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

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /** toString **/
    @Override
    public String toString() {
        return "Person { " +
                "dni = " + dni +
                ", name = '" + name + '\'' +
                ", surName = '" + surName + '\'' +
                ", email = '" + email + '\'' +
                ", address = '" + address + '\'' +
                '}';
    }
}
