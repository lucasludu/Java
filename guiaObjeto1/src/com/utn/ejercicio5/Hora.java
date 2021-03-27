package com.utn.ejercicio5;

public class Hora {

    private int H;
    private int M;
    private int S;

    public Hora(int H, int M, int S) {
        this.H = (H >= 0 && H < 24) ? H : 0;
        this.M = (M >= 0 && M < 60) ? M : 0;
        this.S = (S >= 0 && S < 60) ? S : 0;
    }

    public void sumarHora() {
        if(this.H == 23) {
            this.H = 0;
        } else {
            this.H++;
        }
    }

    public void sumarMinuto() {
        if(this.M == 59) {
            this.M = 0;
            sumarHora();
        } else {
            this.M++;
        }
    }

    public Hora sumarSegundo() {
        if(this.S == 59) {
            this.S = 0;
            sumarMinuto();
        } else {
            this.S++;
        }
        return this;
    }

    public void retrocederHora() {
        if(this.H == 0) {
            this.H = 23;
        } else {
            this.H--;
        }
    }

    public void retrocederMinuto() {
        if(this.M == 0) {
            this.M = 59;
            retrocederHora();
        } else {
            this.M--;
        }
    }

    public Hora retrocederSegundo() {
        if(this.S == 0) {
            this.S = 59;
            retrocederMinuto();
        } else {
            this.S--;
        }
        return this;
    }

    public String getHora() {
        String hh = String.format("%02d", this.H);
        String mm = String.format("%02d", this.M);
        String ss = String.format("%02d", this.S);

        return hh + " : " + mm + " : " + ss;
    }

}
