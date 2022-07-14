package com.chainsys.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteUpdate {

    public static void main(String[] args) throws SQLException {
        // TODO Auto-generated method stub
              Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "System", "Dharani@109");
               Statement s =con.createStatement();
               s.executeUpdate("insert into hello values(4,'leela')");
               s.executeUpdate("delete from hello where id=4");
               s.executeUpdate("insert into hello values(4,'leela')");
            int result=   s.executeUpdate("update hello set name='murugesan' where id=4");
            System.out.println(result + " Row Affected");
               
    
    }

}
