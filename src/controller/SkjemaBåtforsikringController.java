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
import javafx.scene.image.Image;
import javafx.stage.Stage;
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
       
       int godkjentTeller=0;
       //SJEKKER FORSIKRINGSPREMIE INNPUT (INNPUT NR 1)
          try{
            feilhåndteringBåtforsikringSkjema.sjekkInputForsikringspremie(Forsikringspremie);
            feilmeldingForsikringspremie.setText("OK");
            godkjentTeller++;
        }
        catch(feilhåndteringBåtforsikringSkjema.feilTallInnput ex){
            feilmeldingForsikringspremie.setText(ex.getMessage());
        }
          
      //SJEKKER DATO FOR ØNSKET OPPSTART (INNPUT NR 2)
      try{
          feilhåndteringBåtforsikringSkjema.sjekkInputDato(ØnsketOppstart);
          feilmeldingØnsketOppstart.setText("OK");
          godkjentTeller++;
      }
      catch(feilhåndteringBåtforsikringSkjema.feilDatoInnput ex){
            feilmeldingØnsketOppstart.setText(ex.getMessage());
      }
      //SJEKKER OM FORSIKRINGSBELØP ER I KORREKT FORMAT(INNPUT 3)
     try{
         feilhåndteringBåtforsikringSkjema.sjekkForsikringsbeløp(ForsikringsBeløp);
         feilmeldingForsikringsbeløp.setText("OK");
         godkjentTeller++;
     }
     catch(feilhåndteringBåtforsikringSkjema.feilTallInnput ex){
            feilmeldingForsikringsbeløp.setText(ex.getMessage());
      }
     //SJEKKER OM EIER FELTET KUN INNEHOLDER BOKSTAVER (INNPUT 4)
     try{
         feilhåndteringBåtforsikringSkjema.sjekkEier(Eier);
         feilmeldingEier.setText("OK");
         godkjentTeller++;
     }
     catch(feilhåndteringBåtforsikringSkjema.feilInnputNavn ex){
          feilmeldingEier.setText(ex.getMessage());
     }
     //SJEKKER OM REGISTRERINGSNUMMET ER SKREVET KORREKT (INNPUT 5)
     try{
         feilhåndteringBåtforsikringSkjema.sjekkRegistreringsnummer(Registreringsnummer);
         feilmeldingRegistreringsnummer.setText("OK");
         godkjentTeller++;
     }
     catch(feilhåndteringBåtforsikringSkjema.feilRegistreringsnummer ex){
          feilmeldingRegistreringsnummer.setText(ex.getMessage());
     }
     //SJEKKER BÅTTYPE OG MODELL ER FYLT INN (INNPUT 6)
     try{
         feilhåndteringBåtforsikringSkjema.sjekkBåttypeogModell(BåttypeogModell);
         feilmeldingBåttypeModell.setText("OK");
         godkjentTeller++;
     }
     catch(feilhåndteringBåtforsikringSkjema.feilBåttypeogModell ex){
         feilmeldingBåttypeModell.setText(ex.getMessage());
     }
     //SJEKKER OM LENGDE ER FYLT INN KORREKT (INNPUT 7)
     try{
         feilhåndteringBåtforsikringSkjema.sjekkLengde(Lengde);
         feilmeldingLengde.setText("OK");
         godkjentTeller++;
     }
     catch(feilhåndteringBåtforsikringSkjema.feilLengde ex){
         feilmeldingLengde.setText(ex.getMessage());
     }
     //SJEKKER OM ÅRSMODELL ER FYLT INN KORREKT (INNPUT 8)
     try{
         feilhåndteringBåtforsikringSkjema.sjekkÅrsmodell(Årsmodell);
         feilmeldingÅrsmodell.setText("OK");
         godkjentTeller++;
     }
     catch(feilhåndteringBåtforsikringSkjema.feilÅrsmodell ex){
         feilmeldingÅrsmodell.setText(ex.getMessage());
         godkjentTeller++;
     }
     //SJEKKER OM MOTORTYE OG STYRKE ER FYLT INN KORREKT (INNPUT 9)
     try{
         feilhåndteringBåtforsikringSkjema.sjekkMotortypeOgStyrke(MotortypeOgStyrke);
         feilmeldingMotortypeStyrke.setText("OK");
         godkjentTeller++;
     }
     catch(feilhåndteringBåtforsikringSkjema.feilMotortypeOgStyrke ex){
         feilmeldingMotortypeStyrke.setText(ex.getMessage());
     }
     if(godkjentTeller==9){
         System.out.print("du har nå registrert forsikring");
         //FUNKSJON FOR Å LAGE FORSIKRING HER?
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
        fxmlLoader.setLocation(getClass().getResource("/view/betingelserBåtforsikring.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        
        stage.setTitle("Troll Forsikring");
        stage.getIcons().add(new Image("trollforsikring2019/ikon.png"));
        
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
