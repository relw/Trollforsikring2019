/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.kundeLagring;
import model.kunder;
import model.skrivKundeFil;

/**
 *
 * @author Aleksander
 */
public class registerController implements Initializable {

     @FXML
     private Button tilbake; 
     
     @FXML
     private Button lastInn;
     
     @FXML
     private ScrollPane scrollElem; 
      
     
     int teller = 0; 
     @FXML
     private void hentElementer(MouseEvent event){
         
         teller++; 
         if(teller <= 1)
         {
            kundeLagring obj = skrivKundeFil.hentObjekt();
            ArrayList<kunder> array = obj.putKunderIListe();
            
             
            
           
//            scrollContent.setText(skrivKundeFil.lese()); 
//            scrollPane.setContent(scrollContent);
         }
     }
     
     
     @FXML
    private void tilbake(ActionEvent event) throws IOException {
        Parent home_page_parent=FXMLLoader.load(getClass().getResource("/trollforsikring2019/FXMLDocument.fxml"));
        Scene home_page_scene=new Scene(home_page_parent);
        Stage app_stage= (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
        app_stage.show();
    }
    @FXML
    private void lastInnFil(ActionEvent event) throws IOException {
        FileChooser fc = new FileChooser(); 
        File fil = fc.showOpenDialog(null);
        
        FileChooser.ExtensionFilter fileExtensions = new FileChooser.ExtensionFilter("PNG","*.png"); 
        fc.getExtensionFilters().add(fileExtensions);

        
        String filepath = null; 
        if(fil != null){
            filepath = fil.toString();
        
            
            System.out.print(skrivKundeFil.leseValgtFil(filepath));
        }
        else
        {
            
            JOptionPane.showMessageDialog(null,"Ingen fil ble valgt!","Advarsel",JOptionPane.WARNING_MESSAGE);
        }
        
     
    }
 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
       
    }    
    
}
