package com.utn.exercise3;

public abstract class Figure {
    private String colour = "Blue";

    /** ESTRUCTURA POR DEFECTO **/
    public Figure() {

    }

    /** ESTRUCTURA POR PARAMETRO **/
    public Figure (String colour) {
        this.colour = colour;
    }

    /** GETTER **/
    public String getColour() {
        return colour;
    }

    /** SETTER **/
    public void setColour(String colour) {
        this.colour = colour;
    }

    /** toString **/
    @Override
    public String toString() {
        return "Figure { " +
                "Colour = '" + colour + '\'' +
                '}';
    }

    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}
