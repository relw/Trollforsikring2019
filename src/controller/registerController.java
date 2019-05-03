package controller;

import java.io.File;
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
import javafx.scene.control.ScrollPane;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import model.kundeLagring;
import model.kunder;
import model.skrivKundeFil;

public class registerController implements Initializable {

     @FXML
     private Button tilbake;
     
     @FXML
     private Button btnHent;
     
     @FXML
     private ChoiceBox velgKunde;
     
     @FXML
     private Button lastInn;
     
     @FXML
     private ScrollPane scrollElem; 
      
     @FXML
     private Label slettetInfo;
     
     int teller = 0; 
     @FXML
     private void hentElementer(MouseEvent event){    
         teller++; 
         if(teller <= 1)
         {
            kundeLagring obj = skrivKundeFil.hentObjekt();
            ArrayList<kunder> array = obj.putKunderIListe();
            
            
            for(kunder k:array)
            {
                String navn = k.getNavn();
                velgKunde.getItems().add(navn);  
            } 
            
         }
     }
     
    @FXML
    private void slettKunde(ActionEvent event) throws IOException{
       
       try{
           String valgtNavn = (String)velgKunde.getValue();
           kundeLagring obj = skrivKundeFil.hentObjekt();
           ArrayList<kunder> array = obj.putKunderIListe();
        
            for(kunder k : array)
            {
                if(k.getNavn().equals(valgtNavn))
                {
                   array.remove(k);
                   kundeLagring obj2 = new kundeLagring();
                   for(kunder k2: array){
                       obj2.pluss(k2);
                   }
                   skrivKundeFil.skrive(obj2);
                   
                   JOptionPane.showMessageDialog(null, "Kunden er slettet!","Slettet kunde",JOptionPane.INFORMATION_MESSAGE);
                   velgKunde.getItems().remove(valgtNavn);
                   Label label = new Label(); 
                   scrollElem.setContent(label);
                }
            }
       }
       catch(Exception e){
         
       }
        
           
            
    }
    @FXML
    private void slettForsikringOgSkademelding(ActionEvent event) throws IOException{
        
            
    }
    @FXML
    private void endre(ActionEvent event) throws IOException{
         kundeLagring lese = new kundeLagring();
         String valgtNavn = (String)velgKunde.getValue();
           kundeLagring objekt2 = skrivKundeFil.hentObjekt();
           ArrayList<kunder> array2 = objekt2.putKunderIListe();
        
            for(kunder k : array2)
            {
                if(k.getNavn().equals(valgtNavn))
                {
                  kunder endreKunde=new kunder(k.getNavn(),k.getDato(), k.getFakturaAdresse(), k.getForsikringsNummer());
                  lese.pluss(endreKunde);
                  skrivKundeFil.skriveEndreFil(lese);
                }
            }
           
            
            
         kundeLagring endreDenneKunde = skrivKundeFil.leseEndreKunde();
   
        kundeLagring lagring = new kundeLagring();
       
           kundeLagring obj = skrivKundeFil.hentObjekt();
           ArrayList<kunder> array = obj.putKunderIListe();
        
            for(kunder k : array)
            {
                if(k.getNavn().equals(valgtNavn))
                {
                   kunder endreKunde=new kunder(k.getNavn(), k.getDato(), k.getFakturaAdresse(), k.getForsikringsNummer());
                   lagring.pluss(endreKunde); 
                   skrivKundeFil.skriveEndreFil(lagring); 
                }
            }
            
      velgKunde.getItems().remove(valgtNavn);
        Parent home_page_parent=FXMLLoader.load(getClass().getResource("/view/endreKundeSkjema.fxml"));
        Scene home_page_scene=new Scene(home_page_parent);
        Stage app_stage= (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
        app_stage.show();
        
    }
    @FXML
    private void tilbake(ActionEvent event) throws IOException {
        Parent home_page_parent=FXMLLoader.load(getClass().getResource("/trollforsikring2019/FXMLDocument.fxml"));
        Scene home_page_scene=new Scene(home_page_parent);
        Stage app_stage= (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
        app_stage.show();
    }
    @FXML
    private void lastInnFil(ActionEvent event) throws IOException {
        FileChooser fc = new FileChooser(); 
        File fil = fc.showOpenDialog(null);
          
        String filepath = null; 
        if(fil != null){
            filepath = fil.toString();
            
            kundeLagring obj = skrivKundeFil.hentObjekt();
            ArrayList<kunder> array = obj.putKunderIListe(); // Gamle kunder
            
            kundeLagring nyObj = skrivKundeFil.hentValgtObjekt(filepath);
            ArrayList<kunder> nyArray = nyObj.putKunderIListe(); // Kunder fra lest inn fil
            
            ArrayList<kunder> nytt = new ArrayList<>();
            kundeLagring ferdig = new kundeLagring(); 
            for(kunder k:array){
                nytt.add(k);
            }
            for(kunder k2:nyArray){
                nytt.add(k2);
            }
            for(kunder k3:nytt){
                ferdig.pluss(k3);
            }
            skrivKundeFil.skrive(ferdig);
            
            kundeLagring obj4 = skrivKundeFil.hentObjekt();
            ArrayList<kunder> array4 = obj4.putKunderIListe();
            
            
            for(kunder k:array4)
            {
                String navn = k.getNavn();
                velgKunde.getItems().add(navn);  
            } 
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Ingen fil ble valgt!","  Advarsel",JOptionPane.WARNING_MESSAGE);
        }
        
     
    }
    @FXML
    private void lastInfo(ActionEvent event) throws IOException {
        kundeLagring obj = skrivKundeFil.hentObjekt();
        ArrayList<kunder> array = obj.putKunderIListe();
        Label tekst = new Label();
        
        String valgtNavn = (String)velgKunde.getValue();
            for(kunder k : array)
            {
                if(k.getNavn().equals(valgtNavn))
                {
                    tekst.setText(k.toString());
                    scrollElem.setContent(tekst); 
                }
            }
     
    }
 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
       
    }    
    
}
