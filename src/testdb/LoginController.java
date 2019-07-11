/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdb;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author ajeel
 */
public class LoginController{
    
    @FXML
    private Label label;
    private Button login;
    
    public void onClick(ActionEvent actionEvent) {
        System.out.println("CL");
        Parent mainMenuParent = null;
        try {
            mainMenuParent = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene tabView = new Scene(mainMenuParent);

        Stage win = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        win.setScene(tabView);
        win.show();
    }
    
    
    
    public void demo(ActionEvent actionEvent) {
        System.out.println("CL");
        Parent mainMenuParent = null;
        try {
            mainMenuParent = FXMLLoader.load(getClass().getResource("demo.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene tabView = new Scene(mainMenuParent);

        Stage win = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        win.setScene(tabView);
        win.show();
    }
    
    
    
    
    
    
    
 
    
}
