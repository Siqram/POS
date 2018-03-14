import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class TableLayoutController implements Initializable {

    @FXML
    Circle tableTwoStatus;
    
    @FXML
    VBox vboxmenu;
    
    @FXML
    private void openTableSettings(ActionEvent e) throws IOException {
        vboxmenu.setVisible(true);
    }
    
    @FXML
    private void aaaaaaaa(ActionEvent e) throws IOException {
        vboxmenu.setVisible(false);
        tableOneStatus.setFill(Color.RED);
    }
    
    @FXML
    private void tableSetUnavail(ActionEvent event) throws IOException {
        tableTwoStatus.setFill(Color.RED);
    }
    
    @FXML
    private void tableSetAvail(ActionEvent event) throws IOException {
        tableTwoStatus.setFill(Color.LIME);
    }
    
    @FXML
    private void tableSetPending(ActionEvent event) throws IOException {
        tableTwoStatus.setFill(Color.YELLOW);
    }
    
    @FXML
    private void takeSeatOrder(ActionEvent e) throws IOException {
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
