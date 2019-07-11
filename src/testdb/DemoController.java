/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdb;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;


import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import javafx.fxml.FXML;


/**
 * FXML Controller class
 *
 * @author ajeel
 */
public class DemoController implements Initializable {
    @FXML private TextField textfield;
    
    public void handle(ActionEvent event){
        System.out.println(textfield.getText());
        
    
    }
    
    public void enterDataToDB(ActionEvent actionEvent) throws SQLException{
        
        System.out.println(textfield.getText());
        
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:elecom","hr","elecom98");

        Statement st = con.createStatement();   
        String t = "('"+textfield.getText().toString()+"')";

        st.executeQuery("insert into child values "+t);

        con.close();
        
        
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
