package com.ajwalker.databases;

import static com.ajwalker.utility.Constants.*;

import java.sql.*;
import java.util.Optional;
import java.util.PrimitiveIterator;

public class DatabaseHelper {
    private Connection connection;
    private static DatabaseHelper instance;
    private DatabaseHelper() {}

    public static DatabaseHelper getInstance() {
        if (instance == null) {
            instance = new DatabaseHelper();
        }
        return instance;
    }

    public boolean openConnection() {
        try {
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://"+ DB_HOSTNAME + ":"+ DB_PORT + "/"+ DB_NAME, DB_USERNAME,DB_PASSWORD
            );
            return true;
        }catch(SQLException e) {
            System.out.println("Database connection failed"+e.getMessage());
            return false;
        }
    }
    public void closeConnection() {
        try {
            if (!connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            System.out.println("Database connection failed"+e.getMessage());
        }
    }
    public boolean executeUpdate(String sql) {
        try {
            if (openConnection()) {
                connection.prepareStatement(sql).executeUpdate();
                closeConnection();
                return true;
            }
            else{
                System.out.println("Database connection failed");
                return false;
            }
        }
        catch(SQLException e) {
            System.out.println("Database execute failed"+e.getMessage());
            return false;
        }
    }
    public Optional<ResultSet> executeQuery(String sql) {
        try {
            if (openConnection()) {
                ResultSet rs = connection.prepareStatement(sql).executeQuery();
                closeConnection();
                return Optional.of(rs);
            }
            else{
                System.out.println("Database connection failed");
                return Optional.empty();
            }
        }catch(SQLException e) {
            System.out.println("Database execute failed"+e.getMessage());
            return Optional.empty();
        }
    }
}
