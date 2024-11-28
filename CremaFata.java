package com.mycompany.cosmetice;

public class CremaFata extends Cosmetice {
    private String tipPiele;

    public CremaFata(String nume, String brand, double pret, String tipPiele) {
        super(nume, brand, pret);
        this.tipPiele = tipPiele;
    }

    public String getTipPiele() {
        return tipPiele;
    }

    @Override
    public String toString() {
        return super.toString() + ", tipPiele='" + tipPiele + '\'' + '}';
    }
}


