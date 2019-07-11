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
public class NewChildProfileController implements Initializable {

    
    @FXML
    private TextField g_name;
    @FXML
    private TextField g_cnic;
    @FXML
    private TextField g_age;
    @FXML
    private TextField g_address;
    @FXML
    private TextField g_phone;

    @FXML
    private TextField c_a1;
    @FXML
    private TextField c_a2;
    @FXML
    private TextField c_a3;
    @FXML
    private TextField c_d1;
    @FXML
    private TextField c_d2;
    @FXML
    private TextField c_d3;
    @FXML
    private TextField c_bform;
    @FXML
    private TextField c_name;
    @FXML
    private TextField c_age;
    @FXML
    private TextField c_g_cnic;
    @FXML
    private TextField c_gender;
    private Button backToMM_button;

    private String gu_name, gu_cnic, gu_age, gu_gender,
            gu_address, gu_phone,
            ca1, ca2, ca3, cd1, cd2, cd3, cbfom, cname, cage, cg_cnic, cgender;

    public void click(ActionEvent actionEvent) {
        Parent backtoMM_parent = null;

        try {
            backtoMM_parent = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));

        } catch (IOException ex) {
            Logger.getLogger(Schedule_a_childController.class.getName()).log(Level.SEVERE, null, ex);
        }

        Scene mm = new Scene(backtoMM_parent);

        Stage win = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        win.setScene(mm);
        win.show();

    }

    public void register(ActionEvent actionEvent) throws SQLException {

        childInsert();
        Parent backtoMM_parent = null;

        try {
            backtoMM_parent = FXMLLoader.load(getClass().getResource("existingChildProfile.fxml"));

        } catch (IOException ex) {
            Logger.getLogger(Schedule_a_childController.class.getName()).log(Level.SEVERE, null, ex);
        }

        Scene mm = new Scene(backtoMM_parent);

        Stage win = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        win.setScene(mm);
        win.show();

    }

    public void childInsert() throws SQLException {
        //guardian
        gu_name = g_name.getText();
        gu_cnic = g_cnic.getText();
        gu_age = g_age.getText();
        gu_address = g_address.getText();
        gu_phone = g_phone.getText();
        //child
        cname = c_name.getText();
        cage = c_age.getText();
        cg_cnic = c_g_cnic.getText();
        cgender = c_gender.getText();
        cbfom = c_bform.getText();
        //disease 
        cd1 = c_d1.getText();
        cd2 = c_d2.getText();
        cd3 = c_d3.getText();
        //allergy 
        ca1 = c_a1.getText();
        ca2 = c_a2.getText();
        ca3 = c_a3.getText();

        String sq = ",";
        String Q = "'";
        DB dbObject = new DB();
        dbObject.insert("guardian", Q + gu_name + Q + sq + Q + gu_cnic + Q + sq + Q + gu_age + Q + sq + Q + gu_address + Q + sq + Q + gu_phone + Q);
       
        dbObject.insert("child", Q + cname + Q + sq + Q + cg_cnic + Q + sq + Q + cage + Q + sq + Q + cgender + Q + sq + Q + cbfom + Q);
         dbObject.insert("allergies", Q + c_bform + Q + sq + Q + ca1 + Q);
        dbObject.insert("allergies", Q + c_bform + Q + sq + Q + ca2 + Q);
        dbObject.insert("allergies", Q + c_bform + Q + sq + Q + ca3 + Q);
        dbObject.insert("disease", Q + c_bform + Q + sq + Q + cd1 + Q);
        dbObject.insert("disease", Q + c_bform + Q + sq + Q + cd2 + Q);
        dbObject.insert("disease", Q + c_bform + Q + sq + Q + cd3 + Q);

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
