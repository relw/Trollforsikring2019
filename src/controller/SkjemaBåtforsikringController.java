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
       String ForsikringsBeløp=innForsikringsbeløp.getText();
       String Eier= innEier.getText();
       String Registreringsnummer=innRegistreringsnummer.getText();
       String BåttypeogModell=innBåttypeogModell.getText();
       String Lengde=innLengde.getText();
       String Årsmodell=innÅrsmodell.getText();
       String MotortypeOgStyrke=innMotortypeogMotorstyrke.getText();
       
       
       String MotortypeogMotorstyke=innMotortypeogMotorstyrke.getText();
       
       //SJEKKER FORSIKRINGSPREMIE INNPUT (INNPUT NR 1)
          try{
            feilhåndteringBåtforsikringSkjema.sjekkInputForsikringspremie(Forsikringspremie);
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
      //SJEKKER OM FORSIKRINGSBELØP ER I KORREKT FORMAT(INNPUT 3)
     try{
         feilhåndteringBåtforsikringSkjema.sjekkForsikringsbeløp(ForsikringsBeløp);
         feilmeldingForsikringsbeløp.setText("OK");
     }
     catch(feilhåndteringBåtforsikringSkjema.feilTallInnput ex){
            feilmeldingForsikringsbeløp.setText(ex.getMessage());
      }
     //SJEKKER OM EIER FELTET KUN INNEHOLDER BOKSTAVER (INNPUT 4)
     try{
         feilhåndteringBåtforsikringSkjema.sjekkEier(Eier);
         feilmeldingEier.setText("OK");
     }
     catch(feilhåndteringBåtforsikringSkjema.feilInnputNavn ex){
          feilmeldingEier.setText(ex.getMessage());
     }
     //SJEKKER OM REGISTRERINGSNUMMET ER SKREVET KORREKT (INNPUT 5)
     try{
         feilhåndteringBåtforsikringSkjema.sjekkRegistreringsnummer(Registreringsnummer);
         feilmeldingRegistreringsnummer.setText("OK");
     }
     catch(feilhåndteringBåtforsikringSkjema.feilRegistreringsnummer ex){
          feilmeldingRegistreringsnummer.setText(ex.getMessage());
     }
     //SJEKKER BÅTTYPE OG MODELL ER FYLT INN (INNPUT 6)
     try{
         feilhåndteringBåtforsikringSkjema.sjekkBåttypeogModell(BåttypeogModell);
         feilmeldingBåttypeModell.setText("OK");
     }
     catch(feilhåndteringBåtforsikringSkjema.feilBåttypeogModell ex){
         feilmeldingBåttypeModell.setText(ex.getMessage());
     }
     //SJEKKER OM LENGDE ER FYLT INN KORREKT (INNPUT 7)
     try{
         feilhåndteringBåtforsikringSkjema.sjekkLengde(Lengde);
         feilmeldingLengde.setText("OK");
     }
     catch(feilhåndteringBåtforsikringSkjema.feilLengde ex){
         feilmeldingLengde.setText(ex.getMessage());
     }
     //SJEKKER OM ÅRSMODELL ER FYLT INN KORREKT (INNPUT 8)
     try{
         feilhåndteringBåtforsikringSkjema.sjekkÅrsmodell(Årsmodell);
         feilmeldingÅrsmodell.setText("OK");
     }
     catch(feilhåndteringBåtforsikringSkjema.feilÅrsmodell ex){
         feilmeldingÅrsmodell.setText(ex.getMessage());
     }
     try{
         feilhåndteringBåtforsikringSkjema.sjekkMotortypeOgStyrke(MotortypeOgStyrke);
         feilmeldingMotortypeStyrke.setText("OK");
     }
     catch(feilhåndteringBåtforsikringSkjema.feilMotortypeOgStyrke ex){
         feilmeldingMotortypeStyrke.setText(ex.getMessage());
     }
     
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
