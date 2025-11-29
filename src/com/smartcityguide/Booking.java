package com.smartcityguide;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Booking {
    private String bookingId;
    private String userName;
    private String cityName;
    private String placeName;
    private int peopleCount;
    private PaymentMethod paymentMethod;
    private LocalDateTime bookingTime;

    public Booking(String bookingId, String userName, String cityName, String placeName, int peopleCount,
                   PaymentMethod paymentMethod, LocalDateTime bookingTime) {
        this.bookingId = bookingId;
        this.userName = userName;
        this.cityName = cityName;
        this.placeName = placeName;
        this.peopleCount = peopleCount;
        this.paymentMethod = paymentMethod;
        this.bookingTime = bookingTime;
    }

    public String getBookingId() { return bookingId; }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm");
        return "Booking ID: " + bookingId +
                "\nUser: " + userName +
                "\nCity: " + cityName +
                "\nPlace: " + placeName +
                "\nPeople: " + peopleCount +
                "\nPayment Method: " + paymentMethod +
                "\nTime: " + bookingTime.format(formatter);
    }
}
