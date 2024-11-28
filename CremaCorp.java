package com.mycompany.cosmetice;

public class CremaCorp extends Cosmetice {
    private String parfum;

    public CremaCorp(String nume, String brand, double pret, String parfum) {
        super(nume, brand, pret);
        this.parfum = parfum;
    }

    public String getParfum() {
        return parfum;
    }

    @Override
    public String toString() {
        return super.toString() + ", parfum='" + parfum + '\'' + '}';
    }
}


