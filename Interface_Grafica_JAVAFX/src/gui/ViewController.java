package gui;

import java.util.Locale;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController {

    @FXML
    private TextField txtNumberOne;

    @FXML
    private TextField txtNumberTwo;

    @FXML
    private Label labelResult;

    @FXML
    private Button button;

    @FXML
    public void onButtonSumAction() {
        double numberOne = Double.parseDouble(txtNumberOne.getText());
        double numberTwo = Double.parseDouble(txtNumberTwo.getText());
        double sum = numberOne + numberTwo;
        labelResult.setText(String.format(Locale.US, "%.2f", sum));
    }
}