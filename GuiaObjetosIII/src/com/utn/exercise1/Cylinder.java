package com.utn.exercise1;

import com.utn.exercise1.Circle;

public class Cylinder extends Circle {
    private double height = 1.0;

    /** ESTRUCTURA POR DEFECTO **/
    public Cylinder() {
        super();
    }

    /** ESTRUCTURA POR PARAMETRO **/
    public Cylinder(double R, double height) {
        super(R);
        this.height = height;
    }

    /** GETTER **/
    public double getHeight() {
        return height;
    }

    /** SETTER **/
    public void setHeight(double height) {
        this.height = height;
    }

    /** toString **/
    @Override
    public String toString() {
        return "Cylinder { " +
                "SubClass = " + super.toString() +
                " height = " + height +
                '}';
    }

    /** AREA **/
    public double getCylinderArea() {
        return ((2 * Math.PI * this.height * super.getR()) + (2 * super.circleArea()));
    }

    /** VOLUME **/
    public double getCylinderVolume() {
        return (super.circleArea() * this.height);
    }

}
