package com.example.datastructureproject;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;

// First screen of this system
public class StartScreenController {

    @FXML
    private Button startButton;

    @FXML
    void onStartButtonClick(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("showBonus.fxml")));
        stage.setTitle("Bonus Screen");
        stage.setScene(new Scene(root));
        stage.show();
    }
}