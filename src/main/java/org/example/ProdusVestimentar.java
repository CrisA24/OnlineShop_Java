package org.example;

public class ProdusVestimentar extends Produs {
    private String marime;

    public ProdusVestimentar(String nume, double pret, int stoc, String marime) {
        super(nume, pret, stoc);
        this.marime = marime;

    }

    public String getMarime() {
        return marime;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Produs vestimentar: " + nume + ", Pret: " + pret + " RON, marime: " + marime);
    }
}
