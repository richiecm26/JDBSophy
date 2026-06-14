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
            String insertQuery = "insert into cliente (Cod_cliente, nombre_razon_social, Identificacion_NIT, correo, Telefono, contacto, direccion) values(101,'xyz colombia SAS',830228769, 'xyzcolombia@email.com',3008759041,'Juan Aponte', 'Avenida 102 # 38 -45, Barranquilla, Colombia')";
            int rowsAffected = conn.createStatement().executeUpdate(insertQuery);
            if (rowsAffected > 0) {
                System.out.println(rowsAffected + " rows affected");
                ResultSet rs = conn.createStatement().executeQuery("select * from cliente");


                while (rs.next()) {
                    System.out.println(rs.getString("Cod_cliente"));
                    System.out.println(rs.getString("nombre_razon_social"));
                    System.out.println(rs.getString("Identificacion_NIT"));
                    System.out.println(rs.getString("correo"));
                    System.out.println(rs.getString("Telefono"));
                    System.out.println(rs.getString("contacto"));
                    System.out.println(rs.getString("direccion"));
                    System.out.println(" ");


                }

            }



            String updateQuery = " Update cliente SET Cod_cliente = 78, nombre_razon_social ='Juana Rodriguez SA', Identificacion_NIT = 704782875, correo ='rodriguezjuana46@email.com', Telefono = 3158745689, contacto ='Arturo Pardo', direccion ='Carrera 108 # 07 -32, Bogota, Colombia' WHERE Cod_cliente = 78";
            int rowsUpdated = conn.createStatement().executeUpdate(updateQuery);
            if (rowsUpdated > 0) {
                System.out.println(rowsUpdated + " rows updated");
                ResultSet rs = conn.createStatement().executeQuery("select * from cliente");


                while (rs.next()) {
                    System.out.println(rs.getString("Cod_cliente"));
                    System.out.println(rs.getString("nombre_razon_social"));
                    System.out.println(rs.getString("Identificacion_NIT"));
                    System.out.println(rs.getString("correo"));
                    System.out.println(rs.getString("Telefono"));
                    System.out.println(rs.getString("contacto"));
                    System.out.println(rs.getString("direccion"));
                    System.out.println(" ");
                }
            }

   */

            String deleteQuery = "Delete from cliente where Cod_cliente = 101";
            int rowsDeleted = conn.createStatement().executeUpdate(deleteQuery);
            if (rowsDeleted > 0) {
                System.out.println(rowsDeleted + " rows deleted");
                ResultSet rs = conn.createStatement().executeQuery("select * from cliente");
                while (rs.next()) {
                    System.out.println(rs.getString("Cod_cliente"));
                    System.out.println(rs.getString("nombre_razon_social"));
                    System.out.println(rs.getString("Identificacion_NIT"));
                    System.out.println(rs.getString("correo"));
                    System.out.println(rs.getString("Telefono"));
                    System.out.println(rs.getString("contacto"));
                    System.out.println(rs.getString("direccion"));
                }
            }


        }



                catch (Exception e) {
            System.out.println(e.getMessage());
        }








    }
}