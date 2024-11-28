package com.mycompany.cosmetice;

public class Cosmetice {
    private String nume;
    private String brand;
    private double pret;

    public Cosmetice(String nume, String brand, double pret) {
        this.nume = nume;
        this.brand = brand;
        this.pret = pret;
    }

    public String getNume() {
        return nume;
    }

    public String getBrand() {
        return brand;
    }

    public double getPret() {
        return pret;
    }

    @Override
    public String toString() {
        return "Cosmetice{" +
                "nume='" + nume + '\'' +
                ", brand='" + brand + '\'' +
                ", pret=" + pret +
                '}';
    }
}

