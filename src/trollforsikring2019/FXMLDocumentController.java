package trollforsikring2019;

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
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private Button btnRegister;
    
    @FXML
    private Button btnKunde; 
    
    @FXML
    private Button btnSkademeld; 
    
    @FXML
    private Button btnForsk; 
    
    @FXML
    private void forsikringKnapp(ActionEvent event) throws IOException {
        Parent home_page_parent=FXMLLoader.load(getClass().getResource("/view/forsikringnivaa1.fxml"));
        Scene home_page_scene=new Scene(home_page_parent);
        Stage app_stage= (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
        app_stage.show();
    }
    @FXML
    private void KundeKnapp(ActionEvent event) throws IOException {
        Parent home_page_parent=FXMLLoader.load(getClass().getResource("/view/skjemaKunde.fxml"));
        Scene home_page_scene=new Scene(home_page_parent);
        Stage app_stage= (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
        app_stage.show();
    }
    @FXML
    private void SkadeKnapp(ActionEvent event) throws IOException {
        Parent home_page_parent=FXMLLoader.load(getClass().getResource("/view/skademeldingSkjema.fxml"));
        Scene home_page_scene=new Scene(home_page_parent);
        Stage app_stage= (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
        app_stage.show();
    }
    @FXML
    private void registerKnapp(ActionEvent event) throws IOException {
        Parent home_page_parent=FXMLLoader.load(getClass().getResource("/view/register.fxml"));
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
