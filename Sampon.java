package com.mycompany.cosmetice;

public class Sampon extends Cosmetice {
    private String tipPar;

    public Sampon(String nume, String brand, double pret, String tipPar) {
        super(nume, brand, pret);
        this.tipPar = tipPar;
    }

    public String getTipPar() {
        return tipPar;
    }

    @Override
    public String toString() {
        return super.toString() + ", tipPar='" + tipPar + '\'' + '}';
    }
}
