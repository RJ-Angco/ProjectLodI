package com.example.bryannovicio.projectlodi_final;

/**
 * Created by it.temp on 5/30/2018.
 */

public class RestaurantBean {
    private String name;
    private int imageID;
    private double minPrice;
    private double maxPrice;

    public RestaurantBean(String name, int imageID, double minPrice, double maxPrice) {
        this.name = name;
        this.imageID = imageID;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(double minPrice) {
        this.minPrice = minPrice;
    }

    public double getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(double maxPrice) {
        this.maxPrice = maxPrice;
    }
}
