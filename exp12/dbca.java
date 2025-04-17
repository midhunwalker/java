package exp12;
import java.sql.*;


public class dbca {
    public static void main(String[] args) {
        try {
            class.forname("com.mysql.jdbc.driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student? auto reconnect= true & use ssl= false", "root","root");
            System.out.println("connect to database");
            Statement stml =con.createStatement();
            String sql = "INSERT INTO 35Cche(rno, name)VALUES(55:ck aarr)";
            int result = stm
    }

    
}
