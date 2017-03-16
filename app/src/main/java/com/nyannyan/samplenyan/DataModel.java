package com.nyannyan.samplenyan;

/**
 * Created by Johan on 16/3/2017.
 * This is data model for getter and setter for mapping the list
 */
public class DataModel {
    private String name, number;
    private int year;

    public DataModel() {
    }

    public DataModel(String name, String number, int year) {
        this.name = name;
        this.number = number;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}