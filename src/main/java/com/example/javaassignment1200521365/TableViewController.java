package com.example.javaassignment1200521365;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
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
//        DBUtility.retrieveCountriesFromDB();
        idColumn.setCellValueFactory(new PropertyValueFactory<>("countryId"));
        countryColumn.setCellValueFactory(new PropertyValueFactory<>("countryName"));
        GDP2017Column.setCellValueFactory(new PropertyValueFactory<>("GDP2017"));
        GDP2018Column.setCellValueFactory(new PropertyValueFactory<>("GDP2018"));
        GDP2019Column.setCellValueFactory(new PropertyValueFactory<>("GDP2019"));
        GDP2020Column.setCellValueFactory(new PropertyValueFactory<>("GDP2020"));
        GDP2021Column.setCellValueFactory(new PropertyValueFactory<>("GDP2021"));

        tableView.getItems().addAll(DBUtility.retrieveCountriesFromDB());
    }

    @FXML
    void viewChart_onClick(ActionEvent event) throws IOException {
        SceneChanger.changeScenes(event, "chart-view.fxml", "Chart View");
    }

}
