package com.smartcityguide;

import java.util.ArrayList;
import java.util.List;

public class DataStore {

    public static List<City> loadSampleData() {
        List<City> cities = new ArrayList<>();

        City hyderabad = new City(1, "Hyderabad");
        hyderabad.addPlace(new Place(1, "Charminar", "Historic monument.", PlaceType.ATTRACTION, 4.6, 100));
        hyderabad.addPlace(new Place(2, "Hussain Sagar Lake", "Famous lake.", PlaceType.ATTRACTION, 4.3, 150));
        hyderabad.addPlace(new Place(3, "Paradise Restaurant", "Famous biryani.", PlaceType.RESTAURANT, 4.5, 400));

        City bangalore = new City(2, "Bangalore");
        bangalore.addPlace(new Place(4, "Lalbagh", "Botanical garden.", PlaceType.ATTRACTION, 4.4, 150));
        bangalore.addPlace(new Place(5, "Forum Mall", "Shopping mall.", PlaceType.ATTRACTION, 4.2, 500));
        bangalore.addPlace(new Place(6, "MTR", "Traditional food.", PlaceType.RESTAURANT, 4.6, 300));

        cities.add(hyderabad);
        cities.add(bangalore);
        return cities;
    }
}
