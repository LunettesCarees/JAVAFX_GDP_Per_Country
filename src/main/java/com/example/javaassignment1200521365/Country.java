package com.example.javaassignment1200521365;

public class Country {
    private int country_id;
    private String countryName;
    private int GDP_2017;
    private int GDP_2018;
    private int GDP_2019;
    private int GDP_2020;
    private int GDP_2021;

    public Country(int country_id, String countryName, int GDP_2017, int GDP_2018, int GDP_2019, int GDP_2020, int GDP_2021) {
        setCountry_id(country_id);
        setCountryName(countryName);
        setGDP_2017(GDP_2017);
        setGDP_2018(GDP_2018);
        setGDP_2019(GDP_2019);
        setGDP_2020(GDP_2020);
        setGDP_2021(GDP_2021);
    }

    public int getCountry_id() {
        return country_id;
    }

    public void setCountry_id(int country_id) {
        if (country_id < 0){
            throw new IllegalArgumentException("Country ID cannot be negative");
        } else {
            this.country_id = country_id;
        }
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        if (countryName.isEmpty()){
            throw new IllegalArgumentException("Country name cannot be empty");
        } else {
            this.countryName = countryName;
        }
    }

    public int getGDP_2017() {
        return GDP_2017;
    }

    public void setGDP_2017(int GDP_2017) {
        if (GDP_2017 < 0){
            throw new IllegalArgumentException("GDP cannot be negative");
        } else {
            this.GDP_2017 = GDP_2017;
        }
    }

    public int getGDP_2018() {
        return GDP_2018;
    }

    public void setGDP_2018(int GDP_2018) {
        if (GDP_2018 < 0){
            throw new IllegalArgumentException("GDP cannot be negative");
        } else {
            this.GDP_2018 = GDP_2018;
        }
    }

    public int getGDP_2019() {
        return GDP_2019;
    }

    public void setGDP_2019(int GDP_2019) {
        if (GDP_2019 < 0){
            throw new IllegalArgumentException("GDP cannot be negative");
        } else {
            this.GDP_2019 = GDP_2019;
        }
    }

    public int getGDP_2020() {
        return GDP_2020;
    }

    public void setGDP_2020(int GDP_2020) {
        if (GDP_2020 < 0){
            throw new IllegalArgumentException("GDP cannot be negative");
        } else {
            this.GDP_2020 = GDP_2020;
        }
    }

    public int getGDP_2021() {
        return GDP_2021;
    }

    public void setGDP_2021(int GDP_2021) {
        if (GDP_2021 < 0){
            throw new IllegalArgumentException("GDP cannot be negative");
        } else {
            this.GDP_2021 = GDP_2021;
        }
    }

    @Override
    public String toString() {
        return "Country{" +
                "country_id=" + country_id +
                ", countryName='" + countryName + '\'' +
                ", GDP_2017=" + GDP_2017 +
                ", GDP_2018=" + GDP_2018 +
                ", GDP_2019=" + GDP_2019 +
                ", GDP_2020=" + GDP_2020 +
                ", GDP_2021=" + GDP_2021 +
                '}';
    }
}
