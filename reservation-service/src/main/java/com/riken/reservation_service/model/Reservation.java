package com.riken.reservation_service.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reservations")
public class Reservation {
    @Id
    private String id;
    private Long hotelId;
    private String customerName;
    private String reservationDate;
    private int numberOfNights;

    public String getId() {
        return id;
    }
    
    public Long getHotelId() {
        return hotelId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getReservationDate() {
        return reservationDate;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setReservationDate(String reservationDate) {
        this.reservationDate = reservationDate;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }
}
