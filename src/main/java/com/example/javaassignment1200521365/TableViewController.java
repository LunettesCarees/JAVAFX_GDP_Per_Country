package com.example.javaassignment1200521365;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ResourceBundle;

public class TableViewController implements Initializable {
    @FXML
    private TableView<Country> tableView;

    @FXML
    private TableColumn<Country, Integer> idColumn;

    @FXML
    private TableColumn<Country, String> countryColumn;

    @FXML
    private TableColumn<Country, Integer> GDP2017Column;

    @FXML
    private TableColumn<Country, Integer> GDP2018Column;

    @FXML
    private TableColumn<Country, Integer> GDP2019Column;

    @FXML
    private TableColumn<Country, Integer> GDP2020Column;

    @FXML
    private TableColumn<Country, Integer> GDP2021Column;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    @FXML
    void viewChart_onClick(ActionEvent event) {

    }

}
