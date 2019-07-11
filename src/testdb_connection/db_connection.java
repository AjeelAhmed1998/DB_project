package testdb_connection;


import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

public class db_connection {

    public static void main(String[] args) throws SQLException {

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:elecom","hr","elecom98");

        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery("select * from employees");

        while(rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+ " " + rs.getString(3));
        }

        con.close();

    }
    
    
    
    private void childInsert() throws SQLException{
        
    }


}
