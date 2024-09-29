package org.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AfiseazaProduse {

        public static void afiseazaProduse() throws SQLException {
            String sql = "SELECT * FROM produse";

             Connection con  = ConexiuneDB.conexiune();
                 Statement statement = con.createStatement();
                 ResultSet resultSet = statement.executeQuery(sql);


               try{ while (resultSet.next()) {
                    System.out.println("Nume: " + resultSet.getString("nume"));
                    System.out.println("Preț: " + resultSet.getDouble("pret"));
                    System.out.println("Stoc: " + resultSet.getInt("stoc"));
                    System.out.println();
                }

            } catch (SQLException e) {
                System.out.println("Eroare la afisarea produselor: " + e.getMessage());
            }
        }
    }

