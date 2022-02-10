package gui;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;
import models.entities.Person;

public class ViewController implements Initializable {

    @FXML
    private ComboBox<Person> comboBoxPerson;

    private ObservableList<Person> obsList;

    @FXML
    private Button button;

    @FXML  
    public void onButtonAction(){
        for (Person person : obsList) {
            System.out.println(person);
        }
    }


    @FXML
    public void onComboBoxPersonAction(){
        Person person = comboBoxPerson.getSelectionModel().getSelectedItem();
        System.out.println(person);
    }

    @Override
    public void initialize(URL arg0, ResourceBundle rb) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(1, "Maria", "maria@gmail.com"));
        persons.add(new Person(1, "Bob", "bob@gmail.com"));
        persons.add(new Person(1, "Joana", "joana@gmail.com"));
        persons.add(new Person(1, "Raissa", "Raissa@gmail.com"));

        obsList = FXCollections.observableList(persons);
        comboBoxPerson.setItems(obsList);
        

        Callback<ListView<Person>, ListCell<Person>> factory = lv -> new ListCell<Person>() {
            @Override
            protected void updateItem(Person item, boolean empty) {
            super.updateItem(item, empty);
            setText(empty ? "" : item.getName());
            }
            };
            comboBoxPerson.setCellFactory(factory);
            comboBoxPerson.setButtonCell(factory.call(null));
    }

}