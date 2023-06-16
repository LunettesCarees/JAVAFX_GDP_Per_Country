package com.example.javaassignment1200521365.Utilities;

import com.example.javaassignment1200521365.Models.Country;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DBUtility {
    private static String user = "Guanzhou200521365";
    private static String pass = "qKp95QTdut";

    private static String connectURL = "jdbc:mysql://172.31.22.43:3306/" + user;

    public static ArrayList<Country> retrieveCountriesFromDB() {
        ArrayList<Country> countries = new ArrayList<>();

        String sql = "SELECT * FROM country;";

        try (
                Connection conn = DriverManager.getConnection(connectURL, user, pass);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
                ){
            while (resultSet.next()){
                int countryId = resultSet.getInt(1);
                String countryName = resultSet.getString(2);
                int GDP_2017 = resultSet.getInt(3);
                int GDP_2018 = resultSet.getInt(4);
                int GDP_2019 = resultSet.getInt(5);
                int GDP_2020 = resultSet.getInt(6);
                int GDP_2021 = resultSet.getInt(7);

                Country newCountry = new Country(countryId, countryName, GDP_2017, GDP_2018, GDP_2019, GDP_2020, GDP_2021);
                countries.add(newCountry);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return countries;
    }

}
