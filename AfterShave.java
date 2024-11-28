package com.mycompany.cosmetice;

public class AfterShave extends Cosmetice {
    private boolean alcool;

    public AfterShave(String nume, String brand, double pret, boolean alcool) {
        super(nume, brand, pret);
        this.alcool = alcool;
    }

    public boolean isAlcool() {
        return alcool;
    }

    @Override
    public String toString() {
        return super.toString() + ", alcool=" + alcool + '}';
    }
}


