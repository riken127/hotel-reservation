package com.riken.hotel_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.riken.hotel_service.model.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Long> {
    
}
