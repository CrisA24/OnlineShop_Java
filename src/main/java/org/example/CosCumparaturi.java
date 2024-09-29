package org.example;

import java.util.HashMap;
import java.util.Map;

public class CosCumparaturi {
    private Map<Produs, Integer> produseInCos;

    public CosCumparaturi() {
        this.produseInCos = new HashMap<>();
    }

    public void adaugaProdus(Produs produs, int cantitate) {
        if (cantitate > produs.getStoc()) {
            System.out.println("Stoc insuficient pentru " + produs.getNume());
            return;
        }

        if (produseInCos.containsKey(produs)) {
            produseInCos.put(produs, produseInCos.get(produs) + cantitate);
        } else {
            produseInCos.put(produs, cantitate);
        }

        produs.scadeStoc(cantitate);
        System.out.println(cantitate + " x " + produs.getNume() + " adaugate in cos.");
    }

    public void afiseazaCos() {
        System.out.println("Produse in cos:");
        for (Map.Entry<Produs, Integer> entry : produseInCos.entrySet()) {
            System.out.println(entry.getKey().getNume() + " - Cantitate: " + entry.getValue());
        }
    }
}
