package com.utn.exercise1;

public class Rectangle {

    private double lenght = 1.0;
    private double width = 1.0;

    /** Default Constructor **/
    public Rectangle() {

    }

    /** Constructor by parameter **/
    public Rectangle(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
    }

    /** Constructor by copy **/
    public Rectangle(Rectangle c) {
        this.width = c.width;
        this.lenght = c.lenght;
    }

    /** GETTER **/
    public double getLenght() {
        return lenght;
    }

    public double getWidth() {
        return width;
    }

    /** SETTER **/
    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    /** toString **/
    @Override
    public String toString() {
        return "Rectangle { " +
                "lenght = " + lenght +
                ", width = " + width +
                '}';
    }

    /** Perimeter **/
    public double getPerimeter() {
        return (2 * (width + lenght));
    }

    /** Area **/
    public double getArea() {
        return (width * lenght);
    }

}
