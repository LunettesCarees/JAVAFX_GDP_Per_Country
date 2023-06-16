package com.example.javaassignment1200521365;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("chart-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("GDP By Country From 2017 to 2021");
        stage.getIcons().add(new Image("file:C:\\Users\\chen\\Desktop\\Advance Object Oriented Programming - Java\\Assignments\\Java-Assignment1-200521365\\src\\main\\resources\\com\\example\\javaassignment1200521365\\favicon.png"));
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}