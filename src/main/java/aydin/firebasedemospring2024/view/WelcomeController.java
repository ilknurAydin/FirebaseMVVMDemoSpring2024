package aydin.firebasedemospring2024.view;

import java.io.IOException;

import aydin.firebasedemospring2024.view.DemoApp;
import javafx.fxml.FXML;

public class WelcomeController {

    @FXML
    private void switchToDataAccess() throws IOException {
        DemoApp.setRoot("/files/dataAccess");
    }
}
