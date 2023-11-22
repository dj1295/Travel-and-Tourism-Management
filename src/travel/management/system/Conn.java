/*package travel.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conn {

    Connection c;
    Statement s;

    public Conn () {
        try {
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/tms","root","Srm@12345");
            s = c.createStatement();

        } catch (SQLException e) {
            System.out.println("Something Went Wrong: " + e.getMessage());
        }
    }
}*/
package travel.management.system;
/*
1--> Register the driver
2-->
3--> Creating the Statement
4-->  Ececuting MySQl Query ** using JDBC
5-->
* */

import java.sql.*;
// my sql driver
public class Conn{

   Connection c;
   public Statement s;
    Conn(){
        try{

            Class.forName("com.mysql.cj.jdbc.Driver"); //// check it further
//            Class.forName("com.mysql.jdbc.Driver"); //// check it further
            c =DriverManager.getConnection("jdbc:mysql://localhost:3306/tms","root","Srm@12345");
//            c =DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","MySQL");
            s =c.createStatement();
        }catch(Exception e){
           e.printStackTrace();
        }
    }
}
