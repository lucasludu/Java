package com.utn.instrument;

public abstract class Instrumento {

    /** ATRIBUTOS **/
    private String marca;
    private double precio;

    /** CONSTRUCTORES **/
    public Instrumento () {

    }

    public Instrumento (String marca) {
        this.marca = marca;
    }

    public Instrumento(String marca, double precio) {
        this.marca = marca;
        this.precio = precio;
    }

    /** GETTER AND SETTER **/
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /** toString **/
    @Override
    public String toString() {
        return
                "Instrumento { " +
                "Marca = '"      + marca  + '\'' + ", " +
                "Precio = "      + precio        + " "  +
                '}';
    }

    /** ABSTRACTO **/
    public abstract void aumentaPrecio();

}
