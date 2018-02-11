package com.sda.javaFX.controller;

import com.sda.javaFX.model.Person;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;


public class Controller {

    @FXML
    private TableView<Person> personTableView;
    @FXML
    private TableColumn<Person,String>firstNameColumn;
    @FXML
    private TableColumn<Person,String>lastNameColumn;

    @FXML
    private Label firstNameLabel;
    @FXML
    private Label LastNameLabel;
    @FXML
    private Label cityLabel;
    @FXML
    private Label zipCodelabel;
    @FXML
    private Label streetLabel;
    @FXML
    private Label birtdayLabel;


}
