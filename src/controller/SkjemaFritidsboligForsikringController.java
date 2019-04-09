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
            
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
