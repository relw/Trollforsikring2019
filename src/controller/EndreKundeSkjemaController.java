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
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import model.kundeLagring;
import model.kunder;
import model.skrivKundeFil;

public class EndreKundeSkjemaController implements Initializable {
@FXML
    private TextField innOpprettetKundeforhold;
    
    @FXML
    private TextField innNavn;
    
    @FXML
    private TextField innForsikringsnummer;
    
    @FXML
    private TextField innFakturaadresse;
     @FXML
    private void avbryt(ActionEvent event) throws IOException {
        Parent home_page_parent=FXMLLoader.load(getClass().getResource("/view/register.fxml"));
        Scene home_page_scene=new Scene(home_page_parent);
        Stage app_stage= (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
        app_stage.show();
    }
    @FXML
    private void registrerKunde(ActionEvent event) throws IOException {
       String opprettetKundeforhold=innOpprettetKundeforhold.getText();
       String navn=innNavn.getText();
       String forsikringsnummer=innForsikringsnummer.getText();
       String fakturaAdresse=innFakturaadresse.getText();
       
        kundeLagring lagring = new kundeLagring();
    
        
          kundeLagring endreDenneKunde = skrivKundeFil.leseEndreKunde();
          ArrayList<kunder> array = endreDenneKunde.putKunderIListe(); 
          
          kundeLagring gammel = skrivKundeFil.hentObjekt();
          ArrayList<kunder> liste = gammel.putKunderIListe(); 
                for(kunder k:array)
                {
                    k.setNavn(navn);
                    k.setDato(opprettetKundeforhold);
                    k.setFakturaAdresse(fakturaAdresse);
                    k.setForsikringsnummer(forsikringsnummer);
                    
                    lagring.pluss(k);
                }
                 for(kunder k:liste)   // Fjerner endret kunde 
                 {
                     if(!k.getNavn().equals(navn)){
                         lagring.pluss(k); 
                     }
                 }
               
                   skrivKundeFil.skrive(lagring); 
                   JOptionPane.showMessageDialog(null, "Kunden er endret!","Endret kunde",JOptionPane.INFORMATION_MESSAGE);
                    Parent home_page_parent=FXMLLoader.load(getClass().getResource("/view/register.fxml"));
                    Scene home_page_scene=new Scene(home_page_parent);
                    Stage app_stage= (Stage) ((Node) event.getSource()).getScene().getWindow();
                    app_stage.setScene(home_page_scene);
                    app_stage.show();
   
}
    @Override
    public void initialize(URL url, ResourceBundle rb) {
                 String navn=null;
                 String dato=null;
                 String forsikringsnummer=null;
                 String fakturaadresse=null;
    
                kundeLagring obj = skrivKundeFil.leseEndreKunde();
                ArrayList<kunder> array = obj.putKunderIListe();
                for(kunder k : array)
                 {
                 navn=k.getNavn();
                 dato=k.getDato();
                 forsikringsnummer=k.getForsikringsNummer();
                 fakturaadresse=k.getFakturaAdresse();
               
                }
     
                innNavn.setText(navn);
                innForsikringsnummer.setText(forsikringsnummer);
                innFakturaadresse.setText(fakturaadresse);
                innOpprettetKundeforhold.setText(dato);
        
    }    
    
}
