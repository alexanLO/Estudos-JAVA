package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

public class ViewController {

    @FXML
    private Button button;

    @FXML
    public void onButtonAction(){
        Alerts.showAlert("WARRING", null, "Você precisa Ler antes de clickar no botão", AlertType.WARNING);
    }
}