package org.example;

import java.util.ArrayList;
import java.util.List;

public class Aplicatie {
    public static void main(String[] args) {

        ProdusElectronic prodE1= new ProdusElectronic("Laptop",999.99,5, "2");
        ProdusElectronic prodE2= new ProdusElectronic("Televizor",655.99, 7, "2");
        ProdusElectronic prodE3= new ProdusElectronic("Frigider", 1299.99, 5, "2");
        ProdusVestimentar prodV1= new ProdusVestimentar("Rochie", 99.99, 4, "M");
        ProdusVestimentar prodV2= new ProdusVestimentar("Camasa", 45.99, 2, "S");
        ProdusVestimentar prodV3= new ProdusVestimentar("Fusta", 35.99, 4,"M");


        CosCumparaturi cosCumparaturi = new CosCumparaturi();

        cosCumparaturi.adaugaProdus(prodE1,1);
        cosCumparaturi.adaugaProdus(prodE2, 1);

        cosCumparaturi.afiseazaCos();

        List<Produs> produseComandate = new ArrayList<>();
        produseComandate.add(prodE1);
        produseComandate.add(prodE2);

        double total = prodE1.getPret()+ prodE2.getPret();

        Comanda comanda = new Comanda(produseComandate, total);

        comanda.afiseazaComanda();



    }
}