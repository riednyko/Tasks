package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestQuery {
    public static void main (String[] args) {
        try {
        	Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5433/postgres"; 
            System.out.println("The driver is connected");
            Connection conn = DriverManager.getConnection(url,"postgres","postgres");
            Statement stmt = conn.createStatement();
            ResultSet rs;
 
            rs = stmt.executeQuery("SELECT title FROM film WHERE rating = 'PG'");
            System.out.println("Column title");
            System.out.println(" ");
            while ( rs.next() ) {
                String lastName = rs.getString("title");
                System.out.println(lastName);
            }
            conn.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }
}