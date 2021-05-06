package com.utn.guitar;

import com.utn.instrument.Instrumento;

public abstract class Cuerda extends Instrumento {

    /** ATRIBUTOS **/
    protected int cantCuerdas;

    /** CONSTRUCTORES **/
    public Cuerda (String marca, double precio) {
        super(marca, precio);
        this.cantCuerdas = cantCuerdas;
    }

    /** GETTER AND SETTER **/
    public int getCantCuerdas() {
        return cantCuerdas;
    }

    public void setCantCuerdas(int cantCuerdas) {
        this.cantCuerdas = cantCuerdas;
    }

    /** toString **/
    @Override
    public String toString() {
        return
                "Cuerda { "                             +
                "Cantidad de Cuerdas = " + cantCuerdas  + " " +
                "} " + super.toString();
    }

    /** CALSE ABSTRACTA **/
    public abstract void aumentaPrecio();

}
