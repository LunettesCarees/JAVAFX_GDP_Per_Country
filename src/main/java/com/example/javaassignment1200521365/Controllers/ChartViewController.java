package com.example.javaassignment1200521365.Controllers;

import com.example.javaassignment1200521365.Models.Country;
import com.example.javaassignment1200521365.Utilities.DBUtility;
import com.example.javaassignment1200521365.Utilities.SceneChanger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;

public class ChartViewController implements Initializable {
    @FXML
    private CategoryAxis categoryAxis;

    @FXML
    private LineChart<String, Integer> lineChart;

    @FXML
    private Label lineChartTitle;

    @FXML
    private NumberAxis numberAxis;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        int count = 0;

        categoryAxis.setLabel("Year");
        numberAxis.setLabel("GDP (millions in USD)");

        ArrayList<Country> countries = DBUtility.retrieveCountriesFromDB();

        for (Country country : countries) {
            // Create 9 random series
            Random random = new Random();
            int r = random.nextInt(countries.size() / 9);
            if (r != 0) {
                continue;
            }
            XYChart.Series<String, Integer> series = new XYChart.Series<>();
            series.setName(country.getCountryName());
            series.getData().add(new XYChart.Data<>("2017", country.getGDP2017()));
            series.getData().add(new XYChart.Data<>("2018", country.getGDP2018()));
            series.getData().add(new XYChart.Data<>("2019", country.getGDP2019()));
            series.getData().add(new XYChart.Data<>("2020", country.getGDP2020()));
            series.getData().add(new XYChart.Data<>("2021", country.getGDP2021()));
            lineChart.getData().addAll(series);
            count++;
            if (count == 8) {
                break;
            }
        }
    }

    @FXML
    void viewTable_onClick(ActionEvent event) throws IOException {
        SceneChanger.changeScenes(event, "Views/table-view.fxml", "Table View");
    }

    public LineChart<String, Integer> getLineChart() {
        return lineChart;
    }
}
