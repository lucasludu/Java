package com.utn.guitar;

import com.utn.interfaces.Sonido;

public class Electrica extends Cuerda implements Sonido {

    private final int cantCuerdas = 6;
    private String modelo;
    private final double aumento = 5;

    public Electrica (String marca, double precio, String modelo) {
        super(marca, precio);
        this.setCantCuerdas(cantCuerdas);
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return
                "Electrica { "               +
                "Modelo = '" + modelo + '\'' + ", " +
                "Aumento = " + aumento       + " "  +
                "} " + super.toString();
    }

    @Override
    public void aumentaPrecio() {
        this.setPrecio(this.getPrecio() * (aumento/100 + 1));
    }

    @Override
    public String sonidoAmplificado() {
        return "Sonido Amplificado";
    }
}
