package com.example.banquing;

import java.sql.Connection;
import java.sql.DriverManager;

public final class DatabaseConnection {

    private static Connection connection;

    public static Connection getConnection(){
        if(connection == null)
            initConnection();

        return connection;
    }

    private static void initConnection(){
        try {
            String url = "jdbc:mysql://localhost:3307/banquing";
            String user = "root";
            String passwd = "lemeilleur";

            // connexion à la BD
            connection = DriverManager.getConnection(url, user, passwd);
            System.out.println("Connexion effective !");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
