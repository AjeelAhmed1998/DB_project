/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdb;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ajeel
 */


public class Schedule_a_childController implements Initializable {
    
    private Button backToMM_button; 
    
    
    private Button NewChildProfileButton; 
    
    
    
    
    public void createNewChildProfile(ActionEvent actionEvent){
        
        Parent backtoMM_parent = null; 
        
        try{
            backtoMM_parent = FXMLLoader.load(getClass().getResource("newChildProfile.fxml"));
            
        } catch (IOException ex) {
            Logger.getLogger(Schedule_a_childController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Scene mm = new Scene(backtoMM_parent);
        
        Stage win = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        
        win.setScene(mm);
        win.show();
                
        
        
        
        
    }
    
    
    
     
    public void createExistingChild(ActionEvent actionEvent){
        
        Parent backtoMM_parent = null; 
        
        try{
            backtoMM_parent = FXMLLoader.load(getClass().getResource("existingChildProfile.fxml"));
            
        } catch (IOException ex) {
            Logger.getLogger(Schedule_a_childController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Scene mm = new Scene(backtoMM_parent);
        
        Stage win = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        
        win.setScene(mm);
        win.show();
                
        
        
        
        
    }
    
    
    
    
    public void click(ActionEvent actionEvent){
        Parent backtoMM_parent = null; 
        
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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
