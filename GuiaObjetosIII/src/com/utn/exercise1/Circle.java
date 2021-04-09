package com.utn.exercise1;

public class Circle {
    private double R = 1.0;
    private String colour = "Red";

    /** Estructura por defecto **/
    public Circle() {

    }

    /** Estructura por parametro **/
    public Circle(double R) {
        this.R = R;
    }

    public Circle(double R, String colour) {
        this.R = R;
        this.colour = colour;
    }

    /** GETTER **/
    public double getR() {
        return R;
    }

    public String getColour() {
        return colour;
    }

    /** SETTER **/
    public void setR(double r) {
        R = r;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    /** toString **/
    @Override
    public String toString() {
        return "Circle { " +
                "R = " + R +
                ", colour = '" + colour + '\'' +
                '}';
    }

    /** AREA **/
    public double circleArea() {
        return Math.PI * Math.pow(R, 2);
    }
}
