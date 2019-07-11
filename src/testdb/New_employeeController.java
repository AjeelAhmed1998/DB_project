/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdb;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import testdb_connection.DB;

/**
 * FXML Controller class
 *
 * @author ajeel
 */
public class New_employeeController implements Initializable {
    
    
    private Button backToMM_button; 
    public DB dbObject = new DB();
    @FXML private TextField ct_name;
    @FXML private TextField ct_cnic;
    @FXML private TextField ct_age;
    @FXML private TextField ct_salary;
    @FXML private TextField ct_addr;
    @FXML private TextField ct_phone;
    @FXML private TextField ct_user;
    @FXML private TextField ct_pass;
    
    private String name,cnic,age,salary,addr,phone,user,pass;
    
    public void click(ActionEvent actionEvent) throws SQLException{
        Parent backtoMM_parent = null; 
        System.out.println("Ct insert NOt Called");
        
        System.out.println("Ct insert Called");
        try{
            backtoMM_parent = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
            
        } catch (IOException ex) {
            Logger.getLogger(Schedule_a_childController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Scene mm = new Scene(backtoMM_parent);
        
        Stage win = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        
        win.setScene(mm);
        win.show();
        
        
        
        
                
        
        
    }
    
    
    public void registerCaretaker(ActionEvent actionEvent) throws SQLException{
        ctInsert();
        System.out.println("hello");
    }
    
    private void ctInsert() throws SQLException{
        System.out.println("Ct Insert Started");
        name = ct_name.getText();
        System.out.println(name);
        cnic = ct_cnic.getText();
        age = ct_age.getText();
        salary=ct_salary.getText();
        addr=ct_addr.getText();
        phone = ct_phone.getText();
        user=ct_user.getText();
        pass=ct_pass.getText();
        System.out.println("Values initialized.");
        
        
        String sq = ",";
        String Q="'";
        dbObject.insert("caretaker", Q+name+Q+sq+Q+ cnic+Q+sq+Q+age+Q+sq+Q+salary+Q+sq+Q+addr+Q+sq+Q+phone+Q+sq+Q+user+Q+sq+Q+pass+Q);
        System.out.println("Values Added.");
    }


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
