package com.utn.exercise3;

public class Square extends Figure {
    private double side = 1.0;

    /** ESTRUCTURA POR DEFECTO **/
    public Square() {
        super();
    }

    /** ESTRUCTURA POR PARAMETRO **/
    public Square(String colour, double side) {
        super(colour);
        this.side = side;
    }

    /** GETTER **/
    public double getSide() {
        return side;
    }

    /** SETTER **/
    public void setSide(double side) {
        this.side = side;
    }

    /** toString **/
    @Override
    public String toString() {
        return "Square { " +
                "Figure SubClass = " + super.toString() +
                " side = " + side +
                '}';
    }

    /** CALCULO DE PERIMETRO **/
    @Override
    public double calculatePerimeter() {
        return (2 * this.side);
    }

    /** CALCULO DE AREA **/
    @Override
    public double calculateArea() {
        return (Math.pow(this.side, 2));
    }

}
