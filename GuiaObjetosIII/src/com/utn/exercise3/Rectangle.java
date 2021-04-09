package com.utn.exercise3;

public class Rectangle extends Figure {
    private double minorSide = 1.0;
    private double majorSide = 2.0;

    /** ESTRUCTURA POR DEFECTO **/
    public Rectangle() {
        super();
    }

    /** ESTRUCTURA POR PARAMETRO **/
    public Rectangle(String colour, double minorSide, double majorSide) {
        super(colour);
        this.minorSide = minorSide;
        this.majorSide = majorSide;
    }

    /** GETTER **/
    public double getMinorSide() {
        return minorSide;
    }

    public double getMajorSide() {
        return majorSide;
    }

    /** SETTER **/
    public void setMinorSide(double minorSide) {
        this.minorSide = minorSide;
    }

    public void setMajorSide(double majorSide) {
        this.majorSide = majorSide;
    }

    /** toString **/
    @Override
    public String toString() {
        return "Rectangle { " +
                "Figure SubClass = " + super.toString() +
                " minorSide = " + minorSide +
                ", majorSide = " + majorSide +
                '}';
    }

    /** CALCULO DE PERIMETRO **/
    @Override
    public double calculatePerimeter() {
        return (2 * (this.minorSide + this.majorSide));
    }
    /** CALCULO DE AREA **/
    @Override
    public double calculateArea() {
        return (this.minorSide * this.majorSide);
    }

}
