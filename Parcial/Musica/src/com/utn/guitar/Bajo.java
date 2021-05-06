package com.utn.guitar;

public class Bajo extends Cuerda {

    private final int cantCuerdas = 4;
    private String modelo;
    private final double aumento = 20;

    public Bajo (String marca, double precio, String modelo) {
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
                "Bajo { " +
                "Cantidad de Cuerdas = " + cantCuerdas          + ", " +
                "Modelo = '"             + modelo       + '\''  + ", " +
                "Aumento = "            + aumento               + " "  +
                "} " + super.toString();
    }

    @Override
    public void aumentaPrecio() {
        this.setPrecio(this.getPrecio() + (aumento/100 + 1));
    }

}
