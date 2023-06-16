package com.example.javaassignment1200521365;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class ChartViewController {

    @FXML
    void viewTable_onClick(ActionEvent event) throws IOException {
        SceneChanger.changeScenes(event, "table-view.fxml", "Table View");
    }

}
