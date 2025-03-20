package com.riken.reservation_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.riken.reservation_service.model.Reservation;
import com.riken.reservation_service.repository.ReservationRepository;

@Service
public class ReservationService {
    @Autowired
    private ReservationRepository reservationRepository;

    private static final String HOTEL_SERVICE_URL = "http://hotel-service/hotels/";

    @Autowired
    private RestTemplate restTemplate;

    public Reservation createReservation(Reservation reservation) {
        try {
            restTemplate.getForObject(HOTEL_SERVICE_URL + reservation.getHotelId(), Object.class);
        } catch (HttpClientErrorException.NotFound e ) {
            throw new RuntimeException("Hotel not found.");
        }

        return reservationRepository.save(reservation);
    }
}
