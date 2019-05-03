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
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import model.feilmeldingSkademeldingSkjema;
import model.kundeLagring;
import model.kunder;
import model.skademeldinger;
import model.skrivKundeFil;

public class SkademeldingSkjemaController implements Initializable {
    
    @FXML
    private Label feilmeldingDatoSkade; 
    
    @FXML
    private Label feilmeldingSkadenummer;
    
    @FXML
    private Label feilmeldingBeskrivelseSkade;
    
    @FXML
    private Label feilmeldingTypeSkade;
    
    @FXML
    private Label feilmeldingKontaktinfoVitner;
            
    @FXML
    private Label feilmeldingTakseringsSkade;
            
    @FXML
    private Label feilmeldingUtbetalteErstatninger;
            
    @FXML
    private TextField innDatoSkade;
    
    @FXML
    private TextField innSkadenummer;
    
    @FXML
    private TextField innBeskrivelseSkade;
    
    @FXML
    private TextField innTypeSkade;
    
    @FXML
    private TextField innKontaktinfoVitner;
    
    @FXML
    private TextField innTakseringSkade;
    
    @FXML
    private TextField innUtbetalteErstatninger;
    
    @FXML
    private ChoiceBox box;
      
    @FXML
    private Label bes;
            
    @FXML
    private Button btnFortsett;
    
    @FXML
    private Button btnReg;
    
    //metode som sjekker innput feltene
    @FXML 
    private void registrerSkademelding(ActionEvent event){
       String DatoSkade=innDatoSkade.getText();
       String Skadenummer=innSkadenummer.getText();
       String TypeSkade=innTypeSkade.getText();
       String BeskrivelseSkade=innBeskrivelseSkade.getText();
       String KontaktinfoVitner=innKontaktinfoVitner.getText();
       String TakseringSkade=innTakseringSkade.getText();
       String UtbetalteErstatninger=innUtbetalteErstatninger.getText();
       
       
       int godkjentTeller=0;
       //SJEKKER SKADE DATO INNPUT (INNPUT NR 1)
          try{
            feilmeldingSkademeldingSkjema.sjekkDatoForSkade(DatoSkade);
            feilmeldingDatoSkade.setText("OK");
            godkjentTeller++;
        }
        catch(feilmeldingSkademeldingSkjema.feilDatoInnput ex){
            feilmeldingDatoSkade.setText(ex.getMessage());
        }
          
      //SJEKKER SKADENUMMER (INNPUT NR 2)
      try{
          feilmeldingSkademeldingSkjema.sjekkSkadenummer(Skadenummer);
          feilmeldingSkadenummer.setText("OK");
          godkjentTeller++;
      }
      catch(feilmeldingSkademeldingSkjema.feilTallInnput ex){
           feilmeldingSkadenummer.setText(ex.getMessage());
      }
      //SJEKKER BESKRIVELSE AV SKADE (INNPUT 3)
     try{
         feilmeldingSkademeldingSkjema.sjekkBeskrivelseAvSkade(BeskrivelseSkade);
         feilmeldingBeskrivelseSkade.setText("OK");
         godkjentTeller++;
     }
     catch(feilmeldingSkademeldingSkjema.feilTekstInnput ex){
            feilmeldingBeskrivelseSkade.setText(ex.getMessage());
      }
     //SJEKKER TYPE SKADE (INNPUT 4)
     try{
         feilmeldingSkademeldingSkjema.sjekkTypeSkade(TypeSkade);
         feilmeldingTypeSkade.setText("OK");
         godkjentTeller++;
     }
     catch(feilmeldingSkademeldingSkjema.feilTekstInnput ex){
          feilmeldingTypeSkade.setText(ex.getMessage());
     }
    //SJEKKER KONTAKTINFO FRA VITNER (INNPUT 5)
     try{
         feilmeldingSkademeldingSkjema.sjekkKontaktinformasjonVitner(KontaktinfoVitner);
         feilmeldingKontaktinfoVitner.setText("OK");
         godkjentTeller++;
     }
     catch(feilmeldingSkademeldingSkjema.feilTekstInnput ex){
          feilmeldingKontaktinfoVitner.setText(ex.getMessage());
     }
     //SJEKKER TAKSERING AV SKADE (INNPUT 6)
     try{
         feilmeldingSkademeldingSkjema.sjekkTakseringsbeløpAvSkaden(TakseringSkade);
         feilmeldingTakseringsSkade.setText("OK");
         godkjentTeller++;
     }
     catch(feilmeldingSkademeldingSkjema.feilTallInnput ex){
         feilmeldingTakseringsSkade.setText(ex.getMessage());
     }
     //SJEKKER UTBETALTE ERSTATNINGER (INNPUT 7)
     try{
         feilmeldingSkademeldingSkjema.sjekkUbetalteErstatninger(UtbetalteErstatninger);
         feilmeldingUtbetalteErstatninger.setText("OK");
         godkjentTeller++;
     }
     catch(feilmeldingSkademeldingSkjema.feilTallInnput ex){
         feilmeldingUtbetalteErstatninger.setText(ex.getMessage());
     }
     //om alle innputfeltene er godkjent fortsetter metoden for å skrive 
     if(godkjentTeller==7){
         //System.out.print("GODKJENT");
             kundeLagring kundeListe = new kundeLagring();
             
            kundeListe = skrivKundeFil.hentObjekt();
            ArrayList<kunder> array = new ArrayList<>();
            array = kundeListe.putKunderIListe(); // Har nå et array med kunder
          
            for(kunder k:array)
            {
                String navn = k.getNavn();
                box.getItems().add(navn);  
            }
            box.setVisible(true); 
            bes.setVisible(true); 
            btnReg.setVisible(true);
            btnFortsett.setVisible(false); 
     }
    }
    //metode som fullfører registrereringen av skademelding
    @FXML
    private void fullfør(ActionEvent event) throws IOException {
        String valgtNavn = (String)box.getValue();
   
        kundeLagring kundeListe = new kundeLagring();
        kundeListe = skrivKundeFil.hentObjekt();
        ArrayList<kunder> array = new ArrayList<>();
        array = kundeListe.putKunderIListe(); // Har nå et array med kunder
        
        String DatoSkade=innDatoSkade.getText();
        String Skadenummer=innSkadenummer.getText();
        String TypeSkade=innTypeSkade.getText();
        String BeskrivelseSkade=innBeskrivelseSkade.getText();
        String KontaktinfoVitner=innKontaktinfoVitner.getText();
        String TakseringSkade=innTakseringSkade.getText();
        String UtbetalteErstatninger=innUtbetalteErstatninger.getText();
        
       skademeldinger skademelding=new skademeldinger(DatoSkade, TypeSkade, BeskrivelseSkade, KontaktinfoVitner, Skadenummer
        ,TakseringSkade, UtbetalteErstatninger);
        
        for(kunder k : array)
        {
            if(valgtNavn.equals(k.getNavn()))
            {
                //SETT SKADEMELDING INN I ARRAY TIL KUNDE SKADEMELDING ARRAY
                k.setSkademelding(skademelding);
                System.out.print(k.toString());
            }
        }
        kundeLagring nyListe = new kundeLagring(); 
        for(kunder k : array)
        {
            nyListe.pluss(k); 
        }
        skrivKundeFil.skrive(nyListe); 
        JOptionPane.showMessageDialog(null,"Skademelding registrert","  Skademelding er registrert",JOptionPane.WARNING_MESSAGE);
    }
    
    //metoden som går tilbake til førstesiden
    @FXML 
    public void avbryt(ActionEvent event) throws IOException{
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
