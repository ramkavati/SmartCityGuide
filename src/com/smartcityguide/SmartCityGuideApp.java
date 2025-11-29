package com.smartcityguide;

import java.util.List;
import java.util.Scanner;

public class SmartCityGuideApp {

    private List<City> cities;
    private BookingService bookingService;
    private Scanner scanner;

    public SmartCityGuideApp() {
        this.cities = DataStore.loadSampleData();
        this.bookingService = new BookingService();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("=== SMART CITY GUIDE ===");
        boolean exit = false;
        while (!exit) {
            System.out.println("\n1. View cities\n2. Exit");
            int choice = readIntInput("Choice: ");
            switch (choice) {
                case 1 -> listCities();
                case 2 -> exit = true;
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    private void listCities() {
        System.out.println("\nCities:");
        for (City city : cities) System.out.println(city);
    }

    private int readIntInput(String m) {
        while (true) {
            try {
                System.out.print(m);
                return Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Enter a number.");
            }
        }
    }

    public static void main(String[] args) {
        new SmartCityGuideApp().start();
    }
}
