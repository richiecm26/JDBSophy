package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/dbsophy";
        String user = "root";
        String password = "marinamoya2606";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);

/*
            String insertQuery = "insert into Usuarios (Nombre, Correo, Edad) values('Ben Lee','blee@gmail.com','20')";
            int rowsAffected = conn.createStatement().executeUpdate(insertQuery);
            if (rowsAffected > 0) {
                System.out.println(rowsAffected + " rows affected");
                ResultSet rs = conn.createStatement().executeQuery("select * from Usuarios");


                while (rs.next()) {
                    System.out.println(rs.getString("Nombre"));
                    System.out.println(rs.getString("Correo"));
                    System.out.println(rs.getString("Edad"));
                    System.out.println(" ");


                }

            }


            String updateQuery = " Update Usuarios SET Nombre ='Ian Cox', Correo = 'Ianc@hotmail.com' WHERE Edad = 20";
            int rowsUpdated = conn.createStatement().executeUpdate(updateQuery);
            if (rowsUpdated > 0) {
                System.out.println(rowsUpdated + " rows updated");
                ResultSet rs = conn.createStatement().executeQuery("select * from Usuarios");


                while (rs.next()) {
                    System.out.println(rs.getString("Nombre"));
                    System.out.println(rs.getString("Correo"));
                    System.out.println(rs.getString("Edad"));
                    System.out.println(" ");
                }
            }

 */

            String deleteQuery = "Delete from Usuarios where Edad = 47";
            int rowsDeleted = conn.createStatement().executeUpdate(deleteQuery);
            if (rowsDeleted > 0) {
                System.out.println(rowsDeleted + " rows deleted");
                ResultSet rs = conn.createStatement().executeQuery("select * from Usuarios");
                while (rs.next()) {
                    System.out.println(rs.getString("Nombre"));
                    System.out.println(rs.getString("Correo"));
                    System.out.println(rs.getString("Edad"));
                    System.out.println(" ");
                }
            }


        }



                catch (Exception e) {
            System.out.println(e.getMessage());
        }








    }
}