package com.mycompany.cosmetice;

public class GelDeDus extends Cosmetice {
    private String aroma;

    public GelDeDus(String nume, String brand, double pret, String aroma) {
        super(nume, brand, pret);
        this.aroma = aroma;
    }

    public String getAroma() {
        return aroma;
    }

    @Override
    public String toString() {
        return super.toString() + ", aroma='" + aroma + '\'' + '}';
    }
}

