package org.example.objects.and.other.topics;

public class SpaceShip {
    private String model;
    private int year;
    private SpaceShipSize SpaceShipSize;

    // -- Constructor Initializing our object
    public  SpaceShip(String model, int year, SpaceShipSize SpaceShipSize) {
        this.model = model;
        this.SpaceShipSize = SpaceShipSize;
        this.year = year;
    }

    // --Setters
    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setModelSize(SpaceShipSize SpaceShipSize) {
        this.SpaceShipSize = SpaceShipSize;
    }

    // -- Getters
    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public SpaceShipSize getModelSize() {
        return SpaceShipSize;
    }

    public void displayInfo() {
        System.out.println(model + " " + year + " " + SpaceShipSize);
    }

}
