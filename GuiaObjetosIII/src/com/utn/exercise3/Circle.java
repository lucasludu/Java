package com.utn.exercise3;

public class Circle extends Figure {
    private double R = 1.0;

    /** ESTRUCTURA POR DEFECTO **/
    public Circle() {
        super();
    }

    /** ESTRUCTURA POR PARAMETRO **/
    public Circle(String colour, double R) {
        super(colour);
        this.R = R;
    }

    /** GETTER **/
    public double getR() {
        return R;
    }

    /** SETTER **/
    public void setR(double r) {
        R = r;
    }

    /** toString **/
    @Override
    public String toString() {
        return "Circle { " +
                "Figure SubClass = " + super.toString() +
                " R = " + R +
                '}';
    }

    /** CALCULO DE PERIMETRO **/
    @Override
    public double calculatePerimeter() {
        return (2 * Math.PI * this.R);
    }

    /** CALCULO DE AREA **/
    @Override
    public double calculateArea() {
        return (Math.PI * Math.pow(this.R, 2));
    }
}
