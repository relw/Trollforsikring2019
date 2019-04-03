/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.feilhåndteringBåtforsikringSkjema;

/**
 * FXML Controller class
 *
 * @author Rasmus
 */


public class SkjemaBåtforsikringController implements Initializable {
    
    @FXML
    private Label feilmeldingForsikringspremie;
    
    @FXML
    private Label feilmeldingØnsketOppstart;
    
    @FXML
    private Label feilmeldingForsikringsbeløp;
    
    @FXML
    private Label feilmeldingEier;
    
    @FXML
    private Label feilmeldingRegistreringsnummer;
    
    @FXML
    private Label feilmeldingBåttypeModell;
    
    @FXML
    private Label feilmeldingLengde;
    
    @FXML
    private Label feilmeldingÅrsmodell;
    
    @FXML
    private Label feilmeldingMotortypeStyrke;
    
    @FXML
    private TextField innForsikringspremie;
    
    @FXML
    private TextField innØnsketOppstart;
    
    @FXML
    private TextField innEier;
    
    @FXML
    private TextField innForsikringsbeløp;
    
    @FXML
    private TextField innLengde;
    
    @FXML
    private TextField innÅrsmodell;
    
    @FXML
    private TextField innBåttypeogModell;
    
    @FXML
    private TextField innRegistreringsnummer;
    
    @FXML
    private TextField innMotortypeogMotorstyrke;
   
    
    @FXML 
    private void registrerBåtForsikring(ActionEvent event){
       String Forsikringspremie=innForsikringspremie.getText();
       String ØnsketOppstart=innØnsketOppstart.getText();
       String Eier= innEier.getText();
       String ForsikringsBeløp=innForsikringsbeløp.getText();
       String Lengde=innLengde.getText();
       String Årsmodell=innÅrsmodell.getText();
       String BåttypeogModell=innBåttypeogModell.getText();
       String Registreringsnummer=innRegistreringsnummer.getText();
       String MotortypeogMotorstyke=innMotortypeogMotorstyrke.getText();
       
       //SJEKKER FORSIKRINGSPREMIE INNPUT (INNPUT NR 1)
          try{
            feilhåndteringBåtforsikringSkjema.sjekkInputTall(Forsikringspremie);
            feilmeldingForsikringspremie.setText("OK");
            
        }
        catch(feilhåndteringBåtforsikringSkjema.feilTallInnput ex){
            feilmeldingForsikringspremie.setText(ex.getMessage());
        }
          
      //SJEKKER DATO FOR ØNSKET OPPSTART (INNPUT NR 2)
      try{
          feilhåndteringBåtforsikringSkjema.sjekkInputDato(ØnsketOppstart);
          feilmeldingØnsketOppstart.setText("OK");
      }
      catch(feilhåndteringBåtforsikringSkjema.feilDatoInnput ex){
            feilmeldingØnsketOppstart.setText(ex.getMessage());
      }
      //SJEKKER OM FORSIKRINGSBELØP ER I KORREKT FORMAT(INPUT 3)
     
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
