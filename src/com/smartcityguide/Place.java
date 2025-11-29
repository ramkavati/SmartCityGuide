package com.smartcityguide;

public class Place {
    private int id;
    private String name;
    private String description;
    private PlaceType type;
    private double rating;
    private double averageCost;

    public Place(int id, String name, String description, PlaceType type, double rating, double averageCost) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.type = type;
        this.rating = rating;
        this.averageCost = averageCost;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public PlaceType getType() { return type; }
    public double getRating() { return rating; }
    public double getAverageCost() { return averageCost; }
    public String getDescription() { return description; }

    @Override
    public String toString() {
        return "[" + id + "] " + name +
                " | Type: " + type +
                " | Rating: " + rating +
                " | Avg Cost: ₹" + averageCost +
                "\n    " + description;
    }
}
