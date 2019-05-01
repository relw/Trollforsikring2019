/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

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
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.feilhåndteringKundeSkjema;
import model.kundeLagring;
import model.kunder;
import model.skrivKundeFil;


/**
 * FXML Controller class
 *
 * @author martin
 */
public class SkjemaKundeController implements Initializable {
    kundeLagring lagring = new kundeLagring();
    
    @FXML
    private TextField innOpprettetKundeforhold;
    
    @FXML
    private ScrollPane scrollPane; 
    
    @FXML
    private TextField innNavn;
    
    @FXML
    private TextField innForsikringsnummer;
    
    @FXML
    private TextField innFakturaadresse;
    
    @FXML
    private Label feilmeldingOpprettetKundeforhold;
    
    @FXML
    private Label feilmeldingNavn;
    
    @FXML
    private Label feilmeldingFakturaadresse;
    
    @FXML
    private Label feilmeldingForsikringsnummer;
    
    ArrayList<kunder> listeUlagretKunder = new ArrayList<>();
    
    @FXML
    private void registrerKunde(ActionEvent event){
        String opprettetKundeforhold=innOpprettetKundeforhold.getText();
        String navn=innNavn.getText();
        String forsikringsnummer=innForsikringsnummer.getText();
        String fakturaAdresse=innFakturaadresse.getText();
        
        
        int godkjentTeller=0;
        try{
            feilhåndteringKundeSkjema.sjekkKundeForholdDato(opprettetKundeforhold);
            feilmeldingOpprettetKundeforhold.setText("OK");
            godkjentTeller++;
        }
        catch(feilhåndteringKundeSkjema.feilDatoInnput ex){
            feilmeldingOpprettetKundeforhold.setText(ex.getMessage());
        }
        try{
            feilhåndteringKundeSkjema.sjekkNavn(navn);
            feilmeldingNavn.setText("OK");
            godkjentTeller++;
        }
        catch(feilhåndteringKundeSkjema.feilTekstInnput ex){
            feilmeldingNavn.setText(ex.getMessage());
        }
        try{
            feilhåndteringKundeSkjema.sjekkFakturaAdresse(fakturaAdresse);
            feilmeldingFakturaadresse.setText("OK");
            godkjentTeller++;
        }
        catch(feilhåndteringKundeSkjema.feilTekstInnput ex){
            feilmeldingFakturaadresse.setText(ex.getMessage());
        }
        try{
            feilhåndteringKundeSkjema.sjekkForsikringsnummer(forsikringsnummer);
            feilmeldingForsikringsnummer.setText("OK");
            godkjentTeller++;
        }
        catch(feilhåndteringKundeSkjema.feilTallInnput ex){
            feilmeldingForsikringsnummer.setText(ex.getMessage());
        }
        if(godkjentTeller==4){
            System.out.print("Godkjent");
            int intForsikringsnummer = Integer.parseInt(forsikringsnummer);
            
            //Parent home_page_parent=FXMLLoader.load(getClass().getResource("/view/skjemaKunde.fxml"));
            
            
            
//            FileChooser fileChooser = new FileChooser();
//            fileChooser.setTitle("Open Resource File");
//            fileChooser.showOpenDialog(app_stage);

        
            
            kunder nyKunde = new kunder(navn, opprettetKundeforhold, fakturaAdresse, intForsikringsnummer);
            
            
            lagring.pluss(nyKunde); 
            skrivKundeFil.skrive(lagring); 
            //skrive.lese(); 
            
            Label scrollContent = new Label();
            scrollContent.setText(skrivKundeFil.lese()); 
            scrollPane.setContent(scrollContent); 
            
        }
    }
    @FXML
    private void avbryt(ActionEvent event) throws IOException {
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
