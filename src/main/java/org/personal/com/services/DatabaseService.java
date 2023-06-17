package org.personal.com.services;
import java.sql.*;

public class DatabaseService {
    private static DatabaseService database_service;
    private static Statement stmt;

    private DatabaseService() {
    }

    public static DatabaseService getInstance() {
        if(database_service== null){
            database_service = new DatabaseService();
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/?","root","root");

                stmt=con.createStatement();
            }
            catch(Exception e){
                System.out.println("error in execution");
            }
        }
        return database_service;
    }

    public Statement getStmt() {
        return stmt;
    }
}

