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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.feilhåndteringReiseforsikringSkjema;

/**
 * FXML Controller class
 *
 * @author Rasmus
 */
public class SkjemaReiseforsikringController implements Initializable {
     @FXML
     private TextField innForsikringspremie;
     
     @FXML
     private TextField innØnsketOppstart;
     
     @FXML
     private TextField innForsikringsområde;
     
     @FXML
     private TextField innForsikringsbeløp;
     
     @FXML
     private TextField innForsikringssum;
     
     @FXML
     private Label feilmeldingForsikringspremie;
     
      @FXML
     private Label feilmeldingØnsketOppstart;
      
       @FXML
     private Label feilmeldingForsikringsbeløp;
       
     @FXML
     private Label feilmeldingOmråde;
     
     @FXML
     private Label feilmeldingForsikringssum;
     
     
     @FXML
     private void registrerReiseforsikring(ActionEvent event){
         String forsikringspremie=innForsikringspremie.getText();
         String ønsketOppstart=innØnsketOppstart.getText();
         String forsikringsOmråde=innForsikringsområde.getText();
         String forsikringsbeløp=innForsikringsbeløp.getText();
         String forsikringssum=innForsikringssum.getText();
         int godkjentteller=0;
         try{
             feilhåndteringReiseforsikringSkjema.sjekkForsikringspremie(forsikringspremie);
             feilmeldingForsikringspremie.setText("OK");
             godkjentteller++;
         }
         catch(feilhåndteringReiseforsikringSkjema.feilTallInnput ex){
             feilmeldingForsikringspremie.setText(ex.getMessage());
         }
         try{
             feilhåndteringReiseforsikringSkjema.sjekkInputDato(ønsketOppstart);
             feilmeldingØnsketOppstart.setText("OK");
             godkjentteller++;
         }
         catch(feilhåndteringReiseforsikringSkjema.feilDatoInnput ex){
             feilmeldingØnsketOppstart.setText(ex.getMessage());
         }
         try{
             feilhåndteringReiseforsikringSkjema.sjekkForsikringsbeløp(forsikringsbeløp);
             feilmeldingForsikringsbeløp.setText("OK");
             godkjentteller++;
         }
          catch(feilhåndteringReiseforsikringSkjema.feilTallInnput ex){
             feilmeldingForsikringsbeløp.setText(ex.getMessage());
         }
         try{
             feilhåndteringReiseforsikringSkjema.sjekkForsikringsOmråde(forsikringsOmråde);
             feilmeldingOmråde.setText("OK");
             godkjentteller++;
         }
          catch(feilhåndteringReiseforsikringSkjema.feilOmrådeInnput ex){
             feilmeldingOmråde.setText(ex.getMessage());
     }
         try{
             feilhåndteringReiseforsikringSkjema.sjekkForsikringsSum(forsikringssum);
             feilmeldingForsikringssum.setText("OK");
             godkjentteller++;
         }
         catch(feilhåndteringReiseforsikringSkjema.feilTallInnput ex){
             feilmeldingForsikringssum.setText(ex.getMessage());
     }
         if(godkjentteller==5){
             System.out.print("GODKJENT");
         }
  }
     
     @FXML
    private void avbryt(ActionEvent event) throws IOException {
        Parent home_page_parent=FXMLLoader.load(getClass().getResource("/view/forsikringnivaa1.fxml"));
        Scene home_page_scene=new Scene(home_page_parent);
        Stage app_stage= (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
        app_stage.show();
    }
     public void visVilkår(ActionEvent event) throws IOException{
        try {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/view/betingelserReiseforsikring.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Forsikring vilkår reiseforsikring");
        stage.setScene(scene);
        stage.show();
    } catch (IOException e) {
      
    }
     }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

