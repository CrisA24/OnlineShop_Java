package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class InsertProduse {

    public static void adaugaProdus(Connection conexiuneDB, Produs produs) throws SQLException {
        // Obținem conexiunea la baza de date
        Connection con = ConexiuneDB.conexiune();

        String sql = "INSERT INTO produse (nume, pret, stoc) VALUES (?, ?, ?)";

        PreparedStatement statement = con.prepareStatement(sql);


           try{ statement.setString(1, produs.getNume());
            statement.setDouble(2, produs.getPret());
            statement.setInt(3, produs.getStoc());

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Produsul a fost adăugat cu succes în baza de date!");
            }
        } catch (SQLException e) {
            System.out.println("Eroare la adăugarea produsului: " + e.getMessage());
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }
}

