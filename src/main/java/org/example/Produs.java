package org.example;

abstract public class Produs {
    protected String nume;
    protected double pret;
    protected int stoc;

    public Produs(String nume, double pret, int stoc) {
        this.nume = nume;
        this.pret = pret;
        this.stoc = stoc;
    }

    public String getNume() {
        return nume;
    }

    public double getPret() {
        return pret;
    }

    public int getStoc() {
        return stoc;
    }

    public void scadeStoc(int cantitate){
        if (cantitate<=stoc){
            stoc-=cantitate;
        }

    }

    @Override
    public String toString() {
        return "Produs{" +
                "nume='" + nume + '\'' +
                ", pret=" + pret+
                '}';
    }

    public abstract void afiseazaDetalii();
}
