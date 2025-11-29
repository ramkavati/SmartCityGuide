package com.smartcityguide;

import java.util.ArrayList;
import java.util.List;

public class City {
    private int id;
    private String name;
    private List<Place> places = new ArrayList<>();

    public City(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addPlace(Place place) { places.add(place); }
    public int getId() { return id; }
    public String getName() { return name; }
    public List<Place> getPlaces() { return places; }

    @Override
    public String toString() {
        return "[" + id + "] " + name + " (Total places: " + places.size() + ")";
    }
}
