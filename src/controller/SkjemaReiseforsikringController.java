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
import model.feilhåndteringReiseforsikringSkjema;
import model.reiseforsikring;
import model.kundeLagring;
import model.kunder;
import model.skrivKundeFil;

public class SkjemaReiseforsikringController implements Initializable {
    @FXML
    private TextField innForsikringspremie;
     
    @FXML
    private TextField innØnsketOppstart;
     
    @FXML
    private TextField innForsikringsområde;
     
    @FXML
    private TextField innForsikringsbeløp;
     
    @FXML
    private TextField innForsikringssum;
     
    @FXML
    private Label feilmeldingForsikringspremie;
     
    @FXML
    private Label feilmeldingØnsketOppstart;
      
    @FXML
    private Label feilmeldingForsikringsbeløp;
       
    @FXML
    private Label feilmeldingOmråde;
     
    @FXML
    private Label feilmeldingForsikringssum;
     
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
    private void registrerReiseforsikring(ActionEvent event){
         String forsikringspremie=innForsikringspremie.getText();
         String ønsketOppstart=innØnsketOppstart.getText();
         String forsikringsOmråde=innForsikringsområde.getText();
         String forsikringsbeløp=innForsikringsbeløp.getText();
         String forsikringssum=innForsikringssum.getText();
         int godkjentteller=0;
         try{
             feilhåndteringReiseforsikringSkjema.sjekkForsikringspremie(forsikringspremie);
             feilmeldingForsikringspremie.setText("OK");
             godkjentteller++;
         }
         catch(feilhåndteringReiseforsikringSkjema.feilTallInnput ex){
             feilmeldingForsikringspremie.setText(ex.getMessage());
         }
         try{
             feilhåndteringReiseforsikringSkjema.sjekkInputDato(ønsketOppstart);
             feilmeldingØnsketOppstart.setText("OK");
             godkjentteller++;
         }
         catch(feilhåndteringReiseforsikringSkjema.feilDatoInnput ex){
             feilmeldingØnsketOppstart.setText(ex.getMessage());
         }
         try{
             feilhåndteringReiseforsikringSkjema.sjekkForsikringsbeløp(forsikringsbeløp);
             feilmeldingForsikringsbeløp.setText("OK");
             godkjentteller++;
         }
          catch(feilhåndteringReiseforsikringSkjema.feilTallInnput ex){
             feilmeldingForsikringsbeløp.setText(ex.getMessage());
         }
         try{
             feilhåndteringReiseforsikringSkjema.sjekkForsikringsOmråde(forsikringsOmråde);
             feilmeldingOmråde.setText("OK");
             godkjentteller++;
         }
          catch(feilhåndteringReiseforsikringSkjema.feilOmrådeInnput ex){
             feilmeldingOmråde.setText(ex.getMessage());
          }
         try{
             feilhåndteringReiseforsikringSkjema.sjekkForsikringsSum(forsikringssum);
             feilmeldingForsikringssum.setText("OK");
             godkjentteller++;
         }
         catch(feilhåndteringReiseforsikringSkjema.feilTallInnput ex){
             feilmeldingForsikringssum.setText(ex.getMessage());
        }
         //om alle innputfeltene er godkjent forsetter registreringen
         if(godkjentteller==5){
            System.out.print("GODKJENT");
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
    //metode som fullfører registreringen av reiseforsikring
    @FXML
    private void fullfør(ActionEvent event) throws IOException {
        String valgtNavn = (String)box.getValue();
    
        kundeLagring kundeListe = new kundeLagring();
        kundeListe = skrivKundeFil.hentObjekt();
        ArrayList<kunder> array = new ArrayList<>();
        array = kundeListe.putKunderIListe(); // Har nå et array med kunder
        
        String forsikringspremie=innForsikringspremie.getText();
        String ønsketOppstart=innØnsketOppstart.getText();
        String forsikringsOmråde=innForsikringsområde.getText();
        String forsikringsbeløp=innForsikringsbeløp.getText();
        String forsikringssum=innForsikringssum.getText();
        
        reiseforsikring reiseforsikring=new reiseforsikring(forsikringspremie, ønsketOppstart, forsikringsbeløp, forsikringsOmråde, forsikringssum);
        
        for(kunder k : array)
        {
            if(valgtNavn.equals(k.getNavn()))
            {
                k.setReiseforsikring(reiseforsikring);
                System.out.print(k.toString());
            }
        }
        kundeLagring nyListe = new kundeLagring(); 
        for(kunder k : array)
        {
            nyListe.pluss(k); 
        }
        skrivKundeFil.skrive(nyListe); 
        JOptionPane.showMessageDialog(null,"Reiseforsikring registrert","  Forsikring er registrert",JOptionPane.WARNING_MESSAGE);
    }
    //metode går tilbake til forsikringsnivå 1
    @FXML
    private void avbryt(ActionEvent event) throws IOException {
        Parent home_page_parent=FXMLLoader.load(getClass().getResource("/view/forsikringnivaa1.fxml"));
        Scene home_page_scene=new Scene(home_page_parent);
        Stage app_stage= (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
        app_stage.show();
    }
    //metode som lager ny skjerm med vilkår
     public void visVilkår(ActionEvent event) throws IOException{
        try {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/view/betingelserReiseforsikring.fxml"));
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

