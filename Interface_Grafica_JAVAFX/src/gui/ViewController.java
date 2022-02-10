package gui;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController implements Initializable{

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

    @Override
    public void initialize(URL arg0, ResourceBundle rb) {
        Constraints.setTextFieldDouble(txtNumberOne);
        Constraints.setTextFieldDouble(txtNumberTwo);
        Constraints.setTextFieldMaxLength(txtNumberOne, 12);
        Constraints.setTextFieldMaxLength(txtNumberTwo, 12);
        
    }

}