package org.personal.com;

import org.personal.com.dao.UserDao;
import org.personal.com.dto.UserDto;
import org.personal.com.services.DatabaseService;
import org.personal.com.ui.Login;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;



public class Main {

    public static void main(String[] args) throws SQLException {
        System.out.println("Hello world!");
//        DatabaseService dbsrv = DatabaseService.getInstance();
//        Statement stmt = dbsrv.getStmt();
//        UserDao obj = new UserDao();
//        Boolean stat = obj.authenticate(new UserDto("Manager", "Rudransh", "rud@2002"));
//        System.out.println(stat);
//        Login page1 = new Login();

        UserDao obj = new UserDao();
        UserDto user = new UserDto("", "Rudransh", "");
        //obj.add(user);
        //obj.del(user);
        ResultSet rs = obj.search(user);

        ResultSetMetaData rsmd = rs.getMetaData();
        int columnsNumber = rsmd.getColumnCount();
        while (rs.next()) {
            for (int i = 1; i <= columnsNumber; i++) {
                if (i > 1) System.out.print(",  ");
                String columnValue = rs.getString(i);
                System.out.print(columnValue + " " + rsmd.getColumnName(i));
            }
            System.out.println("");
        }


    }
}