package travel.management.system;

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
}
