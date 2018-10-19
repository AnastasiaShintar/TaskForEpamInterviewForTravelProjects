package com.epam.shintar.entity;

import com.epam.shintar.entity.enumPackage.PlaceType;

public class Hotel {

    private String name;
    private PlaceType type;
    private double price;
    private double rating;
    private boolean isBreakfastIncluded;

    public Hotel(String name, PlaceType type, double price, double rating, boolean isBreakfastIncluded) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.rating = rating;
        this.isBreakfastIncluded = isBreakfastIncluded;
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

    public boolean getBreakfast() {
        return isBreakfastIncluded;
    }

    public void setBreakfast(boolean breakfast) {
        this.isBreakfastIncluded = breakfast;
    }

    @Override
    public String toString() {
        if(isBreakfastIncluded == true) {
            return "\"" + name + "\"" + ", " + type + ", " + price + "$, " + rating + ", breakfast_included";
        }else {
            return "\"" + name + "\"" + ", " + type + ", " + price + "$, " + rating + ", breakfast_not_included";
        }
    }
}
