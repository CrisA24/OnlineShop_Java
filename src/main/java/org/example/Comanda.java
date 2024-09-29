package org.example;

import java.util.List;

public class Comanda {
    private List<Produs> produseComandate;
    private double total;

    public Comanda(List<Produs> produseComandate, double total) {
        this.produseComandate = produseComandate;
        this.total = total;
    }

    public void afiseazaComanda(){
        System.out.println("Comanda plasata");
        for (Produs produs : produseComandate){
            System.out.println(produs);
        }
        System.out.println("Total: " + total);

    }
}
