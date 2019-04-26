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
import model.feilhåndteringFritidsboligforsikringSkjema;

public class SkjemaFritidsboligForsikringController implements Initializable {

    @FXML
    private Label feilmeldingForsikringspremie;
    
    @FXML
    private Label feilmeldingØnsketOppstart;
    
    @FXML
    private Label feilmeldingForsikringsbeløp;
    
    @FXML
    private Label feilmeldingAdresse;
            
    @FXML
    private Label feilmeldingByggeår;
            
    @FXML
    private Label feilmeldingBoligtype;
            
    @FXML
    private Label feilmeldingByggemateriale;
            
    @FXML
    private Label feilmeldingStandard;
            
    @FXML
    private Label feilmeldingKvm;
            
    @FXML
    private Label feilmeldingForsikringsbeløpBygning;
            
    @FXML
    private Label feilmeldingForsikringsbeløpInnbo;
            
    @FXML
    private TextField innForsikringspremie;
    
    @FXML
    private TextField innØnsketOppstart;
    
    @FXML
    private TextField innAdresse;
    
    @FXML
    private TextField innForsikringsbeløp;
    
    @FXML
    private TextField innByggemateriale;
    
    @FXML
    private TextField innStandard;
    
    @FXML
    private TextField innBoligtype;
    
    @FXML
    private TextField innByggeår;
    
    @FXML
    private TextField innKvm;
    
    @FXML
    private TextField innForsikringsbeløpBygning;
    
    @FXML
    private TextField innForsikringsbeløpInnbo;
    
    @FXML 
    private void registrerFritidsboligForsikring(ActionEvent event){
        String forsikringspremie=innForsikringspremie.getText();
        String ønsketOppstart=innØnsketOppstart.getText();
        String adresse=innAdresse.getText();
        String forsikringsbeløp=innForsikringsbeløp.getText();
        String byggemateriale=innByggemateriale.getText();
        String standard=innStandard.getText();
        String boligtype=innBoligtype.getText();
        String byggeår=innByggeår.getText();
        String kvm=innKvm.getText();
        String forsikringsbeløpBygning=innForsikringsbeløpBygning.getText();
        String forsikringsbeløpInnbo=innForsikringsbeløpInnbo.getText();
        
        int godkjentTeller=0;
        //SJEKKER INNPUT 1 FORSIKRINGSPREMIE
        try{
            feilhåndteringFritidsboligforsikringSkjema.sjekkInnputTall(forsikringspremie);
            feilmeldingForsikringspremie.setText("OK");;
            godkjentTeller++;
        }
        catch(feilhåndteringFritidsboligforsikringSkjema.feilTallInnput ex){
            feilmeldingForsikringspremie.setText(ex.getMessage());
        }
        //SJEKKER INPUT 2 ØNSKET OPPSTARTSDATO
        try{
            feilhåndteringFritidsboligforsikringSkjema.sjekkInputDato(ønsketOppstart);
            feilmeldingØnsketOppstart.setText("OK");
        }
        catch(feilhåndteringFritidsboligforsikringSkjema.feilDatoInnput ex){
            feilmeldingØnsketOppstart.setText(ex.getMessage());
        }
        //SJEKKER INNPUT 3 ADRESSE
        try{
            feilhåndteringFritidsboligforsikringSkjema.sjekkAdresse(adresse);
            feilmeldingAdresse.setText("OK");
        }
        catch(feilhåndteringFritidsboligforsikringSkjema.feilAdresseInnput ex){
            feilmeldingAdresse.setText(ex.getMessage());
        }
        //SJEKKER INNPUT 4 FORSIKRINGSBELØP
        try{
            feilhåndteringFritidsboligforsikringSkjema.sjekkInnputTall(forsikringsbeløp);
            feilmeldingForsikringsbeløp.setText("OK");;
            godkjentTeller++;
        }
        catch(feilhåndteringFritidsboligforsikringSkjema.feilTallInnput ex){
            feilmeldingForsikringsbeløp.setText(ex.getMessage());
        }
        //SJEKKER INNPUT 5 BYGGEMATERIALE
        try{
            feilhåndteringFritidsboligforsikringSkjema.sjekkByggemateriale(byggemateriale);
            feilmeldingByggemateriale.setText("OK");;
            godkjentTeller++;
        }
        catch(feilhåndteringFritidsboligforsikringSkjema.tomtTekstfelt ex){
            feilmeldingByggemateriale.setText(ex.getMessage());
        }
        //SJEKKER INNPUT 6 STANDARD
       try{
            feilhåndteringFritidsboligforsikringSkjema.sjekkStandard(standard);
            feilmeldingStandard.setText("OK");;
            godkjentTeller++;
        }
        catch(feilhåndteringFritidsboligforsikringSkjema.tomtTekstfelt ex){
            feilmeldingStandard.setText(ex.getMessage());
        }
        //SJEKKER INNPUT 7 BOLIGTYPE
        try{
            feilhåndteringFritidsboligforsikringSkjema.sjekkBoligtype(boligtype);
            feilmeldingBoligtype.setText("OK");;
            godkjentTeller++;
        }
        catch(feilhåndteringFritidsboligforsikringSkjema.tomtTekstfelt ex){
            feilmeldingBoligtype.setText(ex.getMessage());
        }
        //SJEKKER INNPUT 8 BYGGEÅR
        try{
            feilhåndteringFritidsboligforsikringSkjema.sjekkByggeår(byggeår);
            feilmeldingByggeår.setText("OK");;
            godkjentTeller++;
        }
        catch(feilhåndteringFritidsboligforsikringSkjema.feilByggeårInnput ex){
            feilmeldingByggeår.setText(ex.getMessage());
        }
        //SJEKKER INNPUT 9 KVM
        try{
            feilhåndteringFritidsboligforsikringSkjema.sjekkKvm(kvm);
            feilmeldingKvm.setText("OK");;
            godkjentTeller++;
        }
        catch(feilhåndteringFritidsboligforsikringSkjema.feilTallInnput ex){
            feilmeldingKvm.setText(ex.getMessage());
        }
        //SJEKKER INNPUT 10 FORSIKRINGSBELØP BYGNING
        try{
            feilhåndteringFritidsboligforsikringSkjema.sjekkInnputTall(forsikringsbeløpBygning);
            feilmeldingForsikringsbeløpBygning.setText("OK");;
            godkjentTeller++;
        }
        catch(feilhåndteringFritidsboligforsikringSkjema.feilTallInnput ex){
           feilmeldingForsikringsbeløpBygning.setText(ex.getMessage());
        }
        //SJEKKER INNPUT 10 FORSIKRINGSBELØP INNBO
        try{
            feilhåndteringFritidsboligforsikringSkjema.sjekkInnputTall(forsikringsbeløpInnbo);
            feilmeldingForsikringsbeløpInnbo.setText("OK");;
            godkjentTeller++;
        }
        catch(feilhåndteringFritidsboligforsikringSkjema.feilTallInnput ex){
           feilmeldingForsikringsbeløpInnbo.setText(ex.getMessage());
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
        fxmlLoader.setLocation(getClass().getResource("/view/betingelserFritidsboligforsikring.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Forsikring vilkår fritidsboligforsikring");
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
