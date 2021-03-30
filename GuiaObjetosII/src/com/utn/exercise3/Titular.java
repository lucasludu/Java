package com.utn.exercise3;

import java.util.UUID;

public class Titular {

    private UUID uuid;
    private String name;
    private char genere;

    public Titular() {

    }

    public Titular(String name, char genere) {
        this.uuid = UUID.randomUUID();
        this.name = name;
        this.genere = genere;
    }

    /** GETTER **/
    public UUID getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public char getGenere() {
        return genere;
    }

    /** SETTER **/
    public void setName(String name) {
        this.name = name;
    }

    public void setGenere(char genere) {
        this.genere = genere;
    }

    /** toString **/
    @Override
    public String toString() {
        return "Titular { " +
                "uuid = " + uuid +
                ", name = '" + name + '\'' +
                ", genere = " + genere +
                '}';
    }

}
