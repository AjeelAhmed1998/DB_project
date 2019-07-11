package testdb_connection;

/**
 * @author ajeel
 */
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;


import java.sql.*;

public class DB {

    public  void insert(String table,String args ) throws SQLException {
        System.out.println(args);
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("this is p");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:elecom","hr","elecom98");
        String sem = "select seq01.nextval from "+table;
        Statement st = con.createStatement();
        //ResultSet rs = st.executeQuery(sem);
        //rs.next();
        //System.out.println(rs.getString(1));
        System.out.println(table);  
        System.out.println(args);
        String query = String.format("insert into %s values(%s)",table,args);
        st.executeQuery(query);

        con.close();


    }




}