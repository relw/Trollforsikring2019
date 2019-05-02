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
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Forsikringnivaa1Controller implements Initializable {

    @FXML
    private Button btnTilbake; 
    
    //metode som går til båtforsikring skjema
    @FXML
    public void nyBåtforsikringSkjema(ActionEvent event) throws IOException{
        Parent home_page_parent=FXMLLoader.load(getClass().getResource("/view/skjemaBaatforsikring.fxml"));
        Scene home_page_scene=new Scene(home_page_parent);
        Stage app_stage= (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
        app_stage.show();

    }
    //metode som går til fritidsboligforsikring skjema
    @FXML
    public void NyFritidsboligforsikringSkjema(ActionEvent event) throws IOException{
        Parent home_page_parent=FXMLLoader.load(getClass().getResource("/view/skjemaFritidsboligForsikring.fxml"));
        Scene home_page_scene=new Scene(home_page_parent);
        Stage app_stage= (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
        app_stage.show();
    }
    //metode som går til hus- og innnboforsikring skjema
    @FXML
    public void nyHusogInnboforsikringSkjema(ActionEvent event) throws IOException{
        Parent home_page_parent=FXMLLoader.load(getClass().getResource("/view/skjemaHusOgInnboforsikring.fxml"));
        Scene home_page_scene=new Scene(home_page_parent);
        Stage app_stage= (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
        app_stage.show();
    }
    //metode som går til reiseforsikring skjema
    @FXML
    public void nyReiseforsikringSkjema(ActionEvent event) throws IOException{
        Parent home_page_parent=FXMLLoader.load(getClass().getResource("/view/skjemaReiseforsikring.fxml"));
        Scene home_page_scene=new Scene(home_page_parent);
        Stage app_stage= (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
        app_stage.show();
    }
    //metode som går tilbake til førstesiden
    @FXML 
    public void tilbake(ActionEvent event) throws IOException{
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
