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

/**
 * FXML Controller class
 *
 * @author Rasmus
 */


public class SkjemaBåtforsikringController implements Initializable {
       @FXML
    private Label feilmeldingForsikringspremie;
    
    @FXML
    private Label feilmeldingØnsketOppstart;
    
    @FXML
    private Label feilmeldingForsikringsbeløp;
    @FXML
    private Label feilmeldingEier;
    
    @FXML
    private Label feilmeldingRegistreringsnummer;
    
    @FXML
    private Label feilmeldingBåttypeModell;
    
    @FXML
    private Label feilmeldingLengde;
    
    @FXML
    private Label feilmeldingÅrsmodell;
    
    @FXML
    private Label feilmeldingMotortypeStyrke;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
