package com.smartcityguide;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BookingService {

    private List<Booking> bookings = new ArrayList<>();

    public Booking createBooking(String userName, String cityName, String placeName, int peopleCount,
                                 PaymentMethod paymentMethod) {

        String bookingId = "BK-" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();
        Booking booking = new Booking(bookingId, userName, cityName, placeName, peopleCount, paymentMethod,
                LocalDateTime.now());
        bookings.add(booking);
        return booking;
    }

    public List<Booking> getAllBookings() { return bookings; }
    public boolean hasBookings() { return !bookings.isEmpty(); }
}
