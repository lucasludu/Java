package com.utn.exercise2;

import com.utn.exercise2.Person;

public class Student extends Person {
    private int yearAdmision;
    private int quota;
    private String career;

    /** Estructura por defecto **/
    public Student() {

    }

    /** Estructura por Parametro **/
    public Student(int dni, String name, String surName, String email, String address, int yearAdmision, int quota, String career) {
        super(dni, name, surName, email, address);
        this.yearAdmision = yearAdmision;
        this.quota = quota;
        this.career = career;
    }

    /** GETTER **/
    public int getYearAdmision() {
        return yearAdmision;
    }

    public int getQuota() {
        return quota;
    }

    public String getCareer() {
        return career;
    }

    /** SETTER **/
    public void setYearAdmision(int yearAdmision) {
        this.yearAdmision = yearAdmision;
    }

    public void setQuota(int quota) {
        this.quota = quota;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    /** toString **/
    @Override
    public String toString() {
        return "Student { " +
                "Person SubClass = " + super.toString() +
                "yearAdmision = " + yearAdmision +
                ", quota = " + quota +
                ", career = '" + career + '\'' +
                '}';
    }
}
