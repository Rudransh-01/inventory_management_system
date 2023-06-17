package org.personal.com.dao;

import org.personal.com.dto.UserDto;
import org.personal.com.services.DatabaseService;

import java.sql.Statement;
import java.sql.ResultSet;

public class UserDao {
    public boolean add(UserDto user){
        DatabaseService dbs = DatabaseService.getInstance();
        Statement stmt = dbs.getStmt();
        String sql = "insert into inventory.users values ( '" + user.getUsertype() + "' , '" + user.getUsername() + "' , '" + user.getPassword()+ "');";
        try{
            stmt.execute(sql);
            return true;
        }
        catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public boolean del(UserDto user){
        DatabaseService dbs = DatabaseService.getInstance();
        Statement stmt = dbs.getStmt();
        String sql = "delete from inventory.users where user_name = '"+ user.getUsername() + "';" ;
        try{
            stmt.execute(sql);
            return true;
        }
        catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public ResultSet search(UserDto user){
        DatabaseService dbs = DatabaseService.getInstance();
        Statement stmt = dbs.getStmt();
        String sql = "select * from inventory.users where user_name = '"+ user.getUsername() + "';" ;
        try{
            ResultSet rs = stmt.executeQuery(sql);
            return rs;
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public boolean authenticate(UserDto user){
        DatabaseService dbs = DatabaseService.getInstance();
        Statement stmt = dbs.getStmt();
        String sql = "select * from inventory.users where user_type = '" + user.getUsertype() + "' and user_name = '" + user.getUsername() + "' and password = '" + user.getPassword()+ "';";
        try{
            ResultSet rs = stmt.executeQuery(sql);
            return rs.next();
        }
        catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
