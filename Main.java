package com.mycompany.cosmetice;

public class Main {
    public static void main(String[] args) {
        // Instanțe Sampon
        Sampon sampon1 = new Sampon("Sampon Clasic", "Dove", 20.5, "Normal");
        Sampon sampon2 = new Sampon("Sampon Anti-Matreata", "Head & Shoulders", 25.0, "Gras");
        Sampon sampon3 = new Sampon("Sampon Hidratant", "L'Oreal", 30.0, "Uscat");

        // Instanțe CremaFata
        CremaFata cremaFata1 = new CremaFata("Crema Anti-Rid", "Nivea", 50.0, "Matura");
        CremaFata cremaFata2 = new CremaFata("Crema Hidratanta", "Garnier", 35.0, "Normala");
        CremaFata cremaFata3 = new CremaFata("Crema SPF50", "Bioderma", 70.0, "Sensibila");

        // Instanțe CremaCorp
        CremaCorp cremaCorp1 = new CremaCorp("Crema Corp Lavanda", "L'Occitane", 100.0, "Lavanda");
        CremaCorp cremaCorp2 = new CremaCorp("Crema Corp Vanilie", "The Body Shop", 80.0, "Vanilie");
        CremaCorp cremaCorp3 = new CremaCorp("Crema Corp Unt de Shea", "Palmer's", 60.0, "Unt de Shea");

        // Instanțe AfterShave
        AfterShave afterShave1 = new AfterShave("After Shave Clasic", "Gillette", 25.0, true);
        AfterShave afterShave2 = new AfterShave("After Shave Sensibil", "Nivea", 30.0, false);
        AfterShave afterShave3 = new AfterShave("After Shave Fresh", "Old Spice", 20.0, true);

        // Instanțe GelDeDus
        GelDeDus gelDeDus1 = new GelDeDus("Gel Dus Tropical", "Palmolive", 15.0, "Mango");
        GelDeDus gelDeDus2 = new GelDeDus("Gel Dus Fresh", "Nivea", 18.0, "Lamaie");
        GelDeDus gelDeDus3 = new GelDeDus("Gel Dus Relaxant", "Dove", 22.0, "Lavanda");

        // Afișare instanțe
        System.out.println(sampon1);
        System.out.println(sampon2);
        System.out.println(sampon3);

        System.out.println(cremaFata1);
        System.out.println(cremaFata2);
        System.out.println(cremaFata3);

        System.out.println(cremaCorp1);
        System.out.println(cremaCorp2);
        System.out.println(cremaCorp3);

        System.out.println(afterShave1);
        System.out.println(afterShave2);
        System.out.println(afterShave3);

        System.out.println(gelDeDus1);
        System.out.println(gelDeDus2);
        System.out.println(gelDeDus3);
    }
}
