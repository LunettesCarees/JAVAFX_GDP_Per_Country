package com.example.javaassignment1200521365;

public class Country {
    private int countryId;
    private String countryName;
    private int GDP2017;
    private int GDP2018;
    private int GDP2019;
    private int GDP2020;
    private int GDP2021;

    public Country(int countryId, String countryName, int GDP2017, int GDP2018, int GDP2019, int GDP2020, int GDP2021) {
        setCountryId(countryId);
        setCountryName(countryName);
        setGDP2017(GDP2017);
        setGDP2018(GDP2018);
        setGDP2019(GDP2019);
        setGDP2020(GDP2020);
        setGDP2021(GDP2021);
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        if (countryId < 0){
            throw new IllegalArgumentException("Country ID cannot be negative");
        } else {
            this.countryId = countryId;
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

    public int getGDP2017() {
        return GDP2017;
    }

    public void setGDP2017(int GDP2017) {
        if (GDP2017 < 0){
            throw new IllegalArgumentException("GDP cannot be negative");
        } else {
            this.GDP2017 = GDP2017;
        }
    }

    public int getGDP2018() {
        return GDP2018;
    }

    public void setGDP2018(int GDP2018) {
        if (GDP2018 < 0){
            throw new IllegalArgumentException("GDP cannot be negative");
        } else {
            this.GDP2018 = GDP2018;
        }
    }

    public int getGDP2019() {
        return GDP2019;
    }

    public void setGDP2019(int GDP2019) {
        if (GDP2019 < 0){
            throw new IllegalArgumentException("GDP cannot be negative");
        } else {
            this.GDP2019 = GDP2019;
        }
    }

    public int getGDP2020() {
        return GDP2020;
    }

    public void setGDP2020(int GDP2020) {
        if (GDP2020 < 0){
            throw new IllegalArgumentException("GDP cannot be negative");
        } else {
            this.GDP2020 = GDP2020;
        }
    }

    public int getGDP2021() {
        return GDP2021;
    }

    public void setGDP2021(int GDP2021) {
        if (GDP2021 < 0){
            throw new IllegalArgumentException("GDP cannot be negative");
        } else {
            this.GDP2021 = GDP2021;
        }
    }

    @Override
    public String toString() {
        return "Country{" +
                "country_id=" + countryId +
                ", countryName='" + countryName + '\'' +
                ", GDP_2017=" + GDP2017 +
                ", GDP_2018=" + GDP2018 +
                ", GDP_2019=" + GDP2019 +
                ", GDP_2020=" + GDP2020 +
                ", GDP_2021=" + GDP2021 +
                '}';
    }
}
