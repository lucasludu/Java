package com.utn.ejercicio1;

public class Rectangle {

    private double broad = 1.0;
    private double high = 1.0;

    public Rectangle() {

    }

    public Rectangle(double broad, double high) {
        this.broad = broad;
        this.high = high;
    }

    public double getBroad() {
        return broad;
    }

    public void setBroad(double broad) {
        this.broad = broad;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "broad=" + broad +
                ", high=" + high +
                '}';
    }

    public double getPerimetro() {
        return 2 * (this.broad + this.high);
    }

    public double getArea() {
        return this.broad * this.high;
    }

}
