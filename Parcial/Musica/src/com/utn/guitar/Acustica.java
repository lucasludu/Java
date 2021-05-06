package com.utn.guitar;

import com.utn.interfaces.Sonido;

public class Acustica extends Cuerda implements Sonido {

    private final int cantCuerdas = 6;
    private String madera;
    private final double aumento = 10;

    public Acustica (String marca, double precio, String madera) {
        super(marca, precio);
        this.setCantCuerdas(cantCuerdas);
        this.madera = madera;
    }

    public String getMadera() {
        return madera;
    }

    public void setMadera(String madera) {
        this.madera = madera;
    }

    @Override
    public String toString() {
        return
                "Acustica { " +
                "Madera = '"  + madera  + '\''  + ", " +
                "Aumento = "  + aumento         + " "  +
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
