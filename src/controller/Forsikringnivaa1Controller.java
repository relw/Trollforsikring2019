/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Rasmus
 */
public class Forsikringnivaa1Controller implements Initializable {

    @FXML
    private Button btnTilbake; 
    
    public void nyBåtforsikringSkjema(ActionEvent event) throws IOException{
        Parent home_page_parent=FXMLLoader.load(getClass().getResource("/view/skjemaBåtforsikring.fxml"));
        Scene home_page_scene=new Scene(home_page_parent);
        Stage app_stage= (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
        app_stage.show();

    }
    public void NyFritidsboligforsikringSkjema(ActionEvent event){
//        Parent home_page_parent=FXMLLoader.load(getClass().getResource("/view/skjemaFritidsboligForsikring.fxml"));
//        Scene home_page_scene=new Scene(home_page_parent);
//        Stage app_stage= (Stage) ((Node) event.getSource()).getScene().getWindow();
//        app_stage.setScene(home_page_scene);
//        app_stage.show();
    }
    public void nyHusogInnboforsikringSkjema(ActionEvent event){
        //
    }
    public void nyReiseforsikringSkjema(ActionEvent event){
        
    }
    
    @FXML 
    public void tilbake(ActionEvent event) throws IOException{
        Parent home_page_parent=FXMLLoader.load(getClass().getResource("/trollforsikring2019/FXMLDocument.fxml"));
        Scene home_page_scene=new Scene(home_page_parent);
        Stage app_stage= (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
        app_stage.show();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
