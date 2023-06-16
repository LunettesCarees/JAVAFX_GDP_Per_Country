module com.example.javaassignment1200521365 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.javaassignment1200521365 to javafx.fxml;
    exports com.example.javaassignment1200521365;
    exports com.example.javaassignment1200521365.Controllers;
    opens com.example.javaassignment1200521365.Controllers to javafx.fxml;
    exports com.example.javaassignment1200521365.Models;
    opens com.example.javaassignment1200521365.Models to javafx.fxml;
    exports com.example.javaassignment1200521365.Utilities;
    opens com.example.javaassignment1200521365.Utilities to javafx.fxml;
}