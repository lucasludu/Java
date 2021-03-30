package com.utn.exercise1;

public class Author {

    private String name;
    private String surName;
    private String email;
    private char genere;

    public Author() {

    }

    public Author(String name, String surName, String email, char genere) {
        this.name = name;
        this.surName = surName;
        this.email = email;
        this.genere = genere;
    }

    /** GETTER **/
    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getEmail() {
        return email;
    }

    public char getGenere() {
        return genere;
    }

    /** SETTER **/
    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGenere(char genere) {
        this.genere = genere;
    }

    /** toString **/
    @Override
    public String toString() {
        return "Author { " +
                "name = '" + name + '\'' +
                ", surName = '" + surName + '\'' +
                ", email = '" + email + '\'' +
                ", genere = " + genere + " " +
                '}';
    }

    public void getAuthor() {
        System.out.println("Name......: " + this.name);
        System.out.println("Surname...: " + this.surName);
        System.out.println("Email.....: " + this.email);
        System.out.println("Genere....: " + this.genere);
    }

}
