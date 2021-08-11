package travel.management.system;

/**
 *
 * @author DELL
 */
import java.sql.*;
public class connection {
    Connection c;
    Statement s;
    
    public connection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
           c= DriverManager.getConnection("jdbc:mysql://localhost:3306/tms","root","arshad");
            s= c.createStatement();
        }catch(Exception e){
    }
}
}

