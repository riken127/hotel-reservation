package com.riken.reservation_service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.riken.reservation_service.model.Reservation;

public interface ReservationRepository extends MongoRepository<Reservation, String>{
    
}
