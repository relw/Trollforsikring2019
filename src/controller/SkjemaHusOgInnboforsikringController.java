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
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import model.feilhåndteringHusOgInnboforsikringSkjema;
import model.husoginnboforsikring;
import model.kundeLagring;
import model.kunder;
import model.skrivKundeFil;

public class SkjemaHusOgInnboforsikringController implements Initializable {
    @FXML
    private TextField innForsikringspremie;
    
    @FXML
    private TextField innOppstart;
    
    @FXML
    private TextField innBoligAdresse;
    
    @FXML
    private TextField innForsikringbeløp;
    
    @FXML
    private TextField innByggemateriale;
    
    @FXML
    private TextField innStandard;
    
    @FXML
    private TextField innBoligtype;
    
    @FXML
    private TextField innByggeår;
    
    @FXML
    private TextField innAntallKvadratmeter;
    
    @FXML
    private Label feilmeldingForsikringspremie;
    
    @FXML
    private Label feilmeldingOppstart;
    
    @FXML
    private Label feilmeldingForsikringsbeløp;
    
    @FXML
    private Label feilmeldingBoligAdresse;
    
    @FXML
    private Label feilmeldingByggeår;
    
    @FXML
    private Label feilmeldingBoligtype;
    
    @FXML
    private Label feilmeldingByggemateriale;
    
    @FXML
    private Label feilmeldingStandard;
    
    @FXML
    private Label feilmeldingAntallKvadratmeter;
    
    @FXML
    private TextField innForsikringsbeløpBygning;
    
    @FXML
    private TextField innForsikringsbeløpInnbo;

    @FXML
    private Label feilmeldingForsikringsbeløpBygning;
     
    @FXML
    private Label feilmeldingForsikringsbeløpInnbo;
      
    @FXML
    private ChoiceBox box;
      
    @FXML
    private Label bes;
            
    @FXML
    private Button btnFortsett;
    
    @FXML
    private Button btnReg;
    
    //metode som sjekker innputfeltene
    @FXML
    private void registrerHusOgInnboForsikring(ActionEvent event){
        String forsikringsPremie=innForsikringspremie.getText();
        String oppstart=innOppstart.getText();
        String boligAdresse=innBoligAdresse.getText();
        String forsikringsBeløp=innForsikringbeløp.getText();
        String byggemateriale=innByggemateriale.getText();
        String standard=innStandard.getText();
        String boligtype=innBoligtype.getText();
        String byggeår=innByggeår.getText();
        String kvm=innAntallKvadratmeter.getText();
        String forsikringsbeløpBygning=innForsikringsbeløpBygning.getText();
        String forsikringsbeløpInnbo=innForsikringsbeløpInnbo.getText();
        //SJEKKER OM SKJEMAET ER FYLLT INN KORREKT
        int godkjentteller=0;
        //SJEKKER INNPUT 1 FORSIKRINGSPREMIE
        try{
            feilhåndteringHusOgInnboforsikringSkjema.sjekkForsikringspremie(forsikringsPremie);
            feilmeldingForsikringspremie.setText("OK");
            godkjentteller++;
        }
        catch(feilhåndteringHusOgInnboforsikringSkjema.feilTallInnput ex){
            feilmeldingForsikringspremie.setText(ex.getMessage());
        }
        //SJEKKER INNPUT 2 OPPSTARTSDATO
        try{
            feilhåndteringHusOgInnboforsikringSkjema.sjekkInputDato(oppstart);
            feilmeldingOppstart.setText("OK");
            godkjentteller++;
        }
        catch(feilhåndteringHusOgInnboforsikringSkjema.feilDatoInnput ex){
            feilmeldingOppstart.setText(ex.getMessage());
        }
        //SJEKKER INNPUT 3 FORSIKRINGSBELØP
        try{
            feilhåndteringHusOgInnboforsikringSkjema.sjekkForsikringsBeløp(forsikringsBeløp);
            feilmeldingForsikringsbeløp.setText("OK");
            godkjentteller++;
        }
        catch(feilhåndteringHusOgInnboforsikringSkjema.feilTallInnput ex){
            feilmeldingForsikringsbeløp.setText(ex.getMessage());
        }
        //SJEKKET INNPUT 4 ADRESSE
        try{
            feilhåndteringHusOgInnboforsikringSkjema.sjekkAdresse(boligAdresse);
            feilmeldingBoligAdresse.setText("OK");
            godkjentteller++;
            
        }
        catch(feilhåndteringHusOgInnboforsikringSkjema.feilTekstInnput ex){
            feilmeldingBoligAdresse.setText(ex.getMessage());
        }
        //SJEKKER INNPUT 5 BYGGEÅR
        try{
            feilhåndteringHusOgInnboforsikringSkjema.sjekkByggeår(byggeår);
            feilmeldingByggeår.setText("OK");
            godkjentteller++;
        }
        catch(feilhåndteringHusOgInnboforsikringSkjema.feilTallInnput ex){
            feilmeldingByggeår.setText(ex.getMessage());
        }
         //SJEKKER INNPUT 6 BOLIGTYPE
         try{
             feilhåndteringHusOgInnboforsikringSkjema.sjekkBoligtype(boligtype);
            feilmeldingBoligtype.setText("OK");
            godkjentteller++;
         }
         catch(feilhåndteringHusOgInnboforsikringSkjema.feilTekstInnput ex){
              feilmeldingBoligtype.setText(ex.getMessage());
        }
          //SJEKKER INNPUT 7 BYGGEMATERIALE
        try{
             feilhåndteringHusOgInnboforsikringSkjema.sjekkByggemateriale(byggemateriale);
            feilmeldingByggemateriale.setText("OK");
            godkjentteller++;
         }
        catch(feilhåndteringHusOgInnboforsikringSkjema.feilTekstInnput ex){
              feilmeldingByggemateriale.setText(ex.getMessage());
        }
           //SJEKKER INNPUT 8 STANDARD
        try{
             feilhåndteringHusOgInnboforsikringSkjema.sjekkStandard(standard);
            feilmeldingStandard.setText("OK");
            godkjentteller++;
         }
        catch(feilhåndteringHusOgInnboforsikringSkjema.feilTekstInnput ex){
              feilmeldingStandard.setText(ex.getMessage());
        }
           //SJEKKER INNPUT 9 KVM
        try{
             feilhåndteringHusOgInnboforsikringSkjema.sjekkKvm(kvm);
            feilmeldingAntallKvadratmeter.setText("OK");
            godkjentteller++;
         }
        catch(feilhåndteringHusOgInnboforsikringSkjema.feilTallInnput ex){
              feilmeldingAntallKvadratmeter.setText(ex.getMessage());
        }
        //SJEKKER INNPUT 10 FORSIKRINGSBELØP BYGNING
        try{
             feilhåndteringHusOgInnboforsikringSkjema.sjekkForsikringsbeløpBygning(forsikringsbeløpBygning);
            feilmeldingForsikringsbeløpBygning.setText("OK");
            godkjentteller++;
         }
        catch(feilhåndteringHusOgInnboforsikringSkjema.feilTallInnput ex){
              feilmeldingForsikringsbeløpBygning.setText(ex.getMessage());
        }
        //SJEKKER INNPUT 11 FORSIKRINGSBELØP INNBO
        try{
             feilhåndteringHusOgInnboforsikringSkjema.sjekkForsikringsbeløpInnbo(forsikringsbeløpInnbo);
            feilmeldingForsikringsbeløpInnbo.setText("OK");
            godkjentteller++;
         }
        catch(feilhåndteringHusOgInnboforsikringSkjema.feilTallInnput ex){
              feilmeldingForsikringsbeløpInnbo.setText(ex.getMessage());
        }
        //om alle innputfeltene er godkjent fortsetter registreringen
        if(godkjentteller==11){
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
    //metoden som fullfører registreringen av forsikring hus og innbo
    @FXML
    private void fullfør(ActionEvent event) throws IOException {
        String valgtNavn = (String)box.getValue();
      
        kundeLagring kundeListe = new kundeLagring();
        kundeListe = skrivKundeFil.hentObjekt();
        ArrayList<kunder> array = new ArrayList<>();
        array = kundeListe.putKunderIListe(); // Har nå et array med kunder
        
        String forsikringsPremie=innForsikringspremie.getText();
        String oppstart=innOppstart.getText();
        String boligAdresse=innBoligAdresse.getText();
        String forsikringsBeløp=innForsikringbeløp.getText();
        String byggemateriale=innByggemateriale.getText();
        String standard=innStandard.getText();
        String boligtype=innBoligtype.getText();
        String byggeår=innByggeår.getText();
        String kvm=innAntallKvadratmeter.getText();
        String forsikringsbeløpBygning=innForsikringsbeløpBygning.getText();
        String forsikringsbeløpInnbo=innForsikringsbeløpInnbo.getText();
        
        husoginnboforsikring husoginnboforsikring=new husoginnboforsikring(forsikringsPremie, oppstart, forsikringsBeløp, boligAdresse, boligtype, standard, byggemateriale, byggeår, kvm, forsikringsbeløpBygning, forsikringsbeløpInnbo);
        
        for(kunder k : array)
        {
            if(valgtNavn.equals(k.getNavn()))
            {
                k.setHusoginnboforsikring(husoginnboforsikring);
                System.out.print(k.toString());
            }
        }
        kundeLagring nyListe = new kundeLagring(); 
        for(kunder k : array)
        {
            nyListe.pluss(k); 
        }
        skrivKundeFil.skrive(nyListe); 
        JOptionPane.showMessageDialog(null,"Hus- og Innboforsikring registrert","  Forsikring er registrert",JOptionPane.WARNING_MESSAGE);
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
        fxmlLoader.setLocation(getClass().getResource("/view/betingelserHusOgInnboforsikring.fxml"));
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
