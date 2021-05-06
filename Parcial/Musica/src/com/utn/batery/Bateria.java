package com.utn.batery;

import com.utn.instrument.Instrumento;

public class Bateria extends Instrumento {

    private int cantTambor;
    private int cantPlatos;
    private final int precioTambor = 3000;
    private final int precioPlato = 2000;
    private final double aumento = 15;

    public Bateria () {
        super();
    }

    public Bateria (String marca, int cantTambor, int cantPlatos) {
        super(marca);
        if ( (cantTambor >= 3) && (cantPlatos >= 1 && cantPlatos <= 5) ) {
            this.cantTambor = precioTambor;
            this.cantPlatos = precioPlato;
            this.setPrecio(calculaPrecio(cantPlatos, cantTambor));
        }
    }

    /** GETTER **/
    public int getCantTambor() {
        return cantTambor;
    }

    public int getCantPlatos() {
        return cantPlatos;
    }

    /** SETTER **/
    public void setCantTambor(int cantTambor) {
        if (cantTambor >= 3) {
            this.cantTambor = cantTambor;
        }
    }

    public void setCantPlatos(int cantPlatos) {
        if (cantPlatos >= 1 && cantPlatos <= 5) {
            this.cantPlatos = cantPlatos;
        }
    }

    /** CALCULO EL PRECIO **/
    private double calculaPrecio (int cantPlatos, int cantTambor) {
        return ((cantPlatos * precioPlato) + (cantTambor * precioTambor));
    }

    /** CLASE ABSTRACTA DE INSTRUMENTOS **/
    @Override
    public void aumentaPrecio() {
        this.setPrecio(this.getPrecio() * 1.15);
    }

    /** toString **/
    @Override
    public String toString() {
        return
                "Bateria { "                                +
                "Cantidad de Tambores = "   + cantTambor    + ", " +
                "Cantidad de Platillos = "  + cantPlatos    + ", " +
                "Precio del Tambor = "      + precioTambor  + ", " +
                "Precio del Platillo = "    + precioPlato   + " "  +
                "} " + super.toString();
    }

}
