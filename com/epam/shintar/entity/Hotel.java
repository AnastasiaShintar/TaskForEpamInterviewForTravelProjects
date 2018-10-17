package com.epam.shintar.entity;

import com.epam.shintar.enumPackage.BreakfastProvision;
import com.epam.shintar.enumPackage.PlaceType;

public class Hotel {

    private String name;
    private PlaceType type;
    private double price;
    private double rating;
    private BreakfastProvision breakfast;

    public Hotel(String name, PlaceType type, double price, double rating, BreakfastProvision breakfast) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.rating = rating;
        this.breakfast = breakfast;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlaceType getType() {
        return type;
    }

    public void setType(PlaceType type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public BreakfastProvision getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(BreakfastProvision breakfast) {
        this.breakfast = breakfast;
    }

    @Override
    public String toString() {
        return  "\"" + name + "\"" +", " + type + ", " + price +"$, " + rating + ", " + breakfast;
    }
}
