package org.example;

import java.sql.Connection;
import java.sql.SQLException;

public class AdaugaProduse {

    public static void main(String[] args) throws SQLException {

        ProdusElectronic prodE1 = new ProdusElectronic("Laptop", 999.99, 5, "2");
        ProdusElectronic prodE2 = new ProdusElectronic("Televizor", 655.99, 7, "2");
        ProdusElectronic prodE3 = new ProdusElectronic("Frigider", 1299.99, 5, "2");
        ProdusElectronic prodE4 = new ProdusElectronic("Aragaz", 1399.99, 10, "5");
        ProdusElectronic prodE5 = new ProdusElectronic("Aer conditionat", 899.99, 3, "1");
        ProdusElectronic prodE6 = new ProdusElectronic("Cuptor electric", 1199.99, 9, "3");

        Connection conexiune = ConexiuneDB.conexiune();

        InsertProduse.adaugaProdus(conexiune, prodE1);
        InsertProduse.adaugaProdus(conexiune, prodE2);
        InsertProduse.adaugaProdus(conexiune, prodE3);
        InsertProduse.adaugaProdus(conexiune, prodE4);
        InsertProduse.adaugaProdus(conexiune, prodE5);
        InsertProduse.adaugaProdus(conexiune, prodE6);

        AfiseazaProduse.afiseazaProduse();


    }


}
