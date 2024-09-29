package org.example;

public class ProdusElectronic extends Produs {
    private String garantie;

    public ProdusElectronic(String nume, double pret, int stoc, String garantie) {
        super(nume, pret, stoc);
        this.garantie = garantie;
    }

    public String getGarantie() {
        return garantie;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Produs electonic:" + nume + "Pret: " + this.pret+  "Garantie : " + this.garantie);
    }

}
