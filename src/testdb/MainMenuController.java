/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdb;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXMLLoader;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.scene.Scene;

import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author ajeel
 */


public class MainMenuController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    private Button sc; 
    
    
    public void scheduleChild(ActionEvent actionEvent ){
         Parent mainMenuParent = null;
        try {
            mainMenuParent = FXMLLoader.load(getClass().getResource("Schedule_a_child.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene tabView = new Scene(mainMenuParent);

        Stage win = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        win.setScene(tabView);
        win.show();
        
        
   
    }
    
    
    
    public void editChildProfile(ActionEvent actionEvent ){
         Parent mainMenuParent = null;
        try {
            mainMenuParent = FXMLLoader.load(getClass().getResource("edit_child_profile.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene tabView = new Scene(mainMenuParent);

        Stage win = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        win.setScene(tabView);
        win.show();
        
        
    }
    
    
    
    public void seeGuardians(ActionEvent actionEvent ){
         Parent mainMenuParent = null;
        try {
            mainMenuParent = FXMLLoader.load(getClass().getResource("guardian_lists.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene tabView = new Scene(mainMenuParent);

        Stage win = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        win.setScene(tabView);
        win.show();
        
        
    }
    
    
    public void searchChildProfile(ActionEvent actionEvent ){
         Parent mainMenuParent = null;
        try {
            mainMenuParent = FXMLLoader.load(getClass().getResource("search_child.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene tabView = new Scene(mainMenuParent);

        Stage win = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        win.setScene(tabView);
        win.show();
        
        
    }
    
    
    public void hire_employee(ActionEvent actionEvent ){
         Parent mainMenuParent = null;
        try {
            mainMenuParent = FXMLLoader.load(getClass().getResource("new_employee.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene tabView = new Scene(mainMenuParent);

        Stage win = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        win.setScene(tabView);
        win.show();
        
        
    }
    
    
    
    public void editEmpProfile(ActionEvent actionEvent ){
         Parent mainMenuParent = null;
        try {
            mainMenuParent = FXMLLoader.load(getClass().getResource("edit_emp_profile.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene tabView = new Scene(mainMenuParent);

        Stage win = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        win.setScene(tabView);
        win.show();
        
        
    }
    
    
    
    public void searchEmp(ActionEvent actionEvent ){
         Parent mainMenuParent = null;
        try {
            mainMenuParent = FXMLLoader.load(getClass().getResource("search_emp.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene tabView = new Scene(mainMenuParent);

        Stage win = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        win.setScene(tabView);
        win.show();
        
        
    }
    
    
    
    public void inventory_list(ActionEvent actionEvent ){
         Parent mainMenuParent = null;
        try {
            mainMenuParent = FXMLLoader.load(getClass().getResource("inv_list.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene tabView = new Scene(mainMenuParent);

        Stage win = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        win.setScene(tabView);
        win.show();
        
        
    }
    
    public void enter_Inv_Ttem(ActionEvent actionEvent ){
         Parent mainMenuParent = null;
        try {
            mainMenuParent = FXMLLoader.load(getClass().getResource("enter_inv_item.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene tabView = new Scene(mainMenuParent);

        Stage win = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        win.setScene(tabView);
        win.show();
        
        
    }
    
    
    
    
    
    
    
    
    
    public void backToLogin(ActionEvent actionEvent){
         Parent mainMenuParent = null;
        try {
            mainMenuParent = FXMLLoader.load(getClass().getResource("Login.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene tabView = new Scene(mainMenuParent);

        Stage win = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        win.setScene(tabView);
        win.show();
        
        
        
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
