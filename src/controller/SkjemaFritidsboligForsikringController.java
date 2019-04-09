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
        try{
            feilhåndteringFritidsboligforsikringSkjema.sjekkInnputTall(forsikringspremie);
            feilmeldingForsikringspremie.setText("OK");;
            godkjentTeller++;
        }
        catch(feilhåndteringFritidsboligforsikringSkjema.feilInnputTall ex){
            feilmeldingForsikringspremie.setText(ex.getMessage());
        }
    }
            
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
