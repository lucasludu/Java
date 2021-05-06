package com.utn;

import com.utn.batery.Bateria;
import com.utn.guitar.Acustica;
import com.utn.guitar.Bajo;
import com.utn.guitar.Electrica;
import com.utn.instrument.Instrumento;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Instrumento bateria     = new Bateria("DAD", 3, 4);
        Instrumento bajo        = new Bajo("ASDADAS", 100, "LDF");
        Instrumento acustico    = new Acustica("GUK", 2000, "nogal");
        Instrumento electrica   = new Electrica("FEAHFLEA", 300, "iosehgso");

        ArrayList<Instrumento> listaInstrumento = new ArrayList<>();
        listaInstrumento.add(bateria);
        listaInstrumento.add(bajo);
        listaInstrumento.add(acustico);
        listaInstrumento.add(electrica);

        for (Instrumento inst : listaInstrumento) {
            System.out.println(inst.toString());
        }

        ((Electrica) electrica).sonidoAmplificado();

        for (Instrumento inst : listaInstrumento) {
            System.out.println("Elemento " + inst.getMarca());
            System.out.println("Precio Anual " + inst.getPrecio());
            inst.aumentaPrecio();
            System.out.println("Precio con aumento " + inst.getPrecio());
        }

    }
}
