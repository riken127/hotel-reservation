package com.riken.hotel_service.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;

import com.riken.hotel_service.model.Hotel;
import com.riken.hotel_service.repository.HotelRepository;

@Service
@EnableCaching
public class HotelService {
    @Autowired
    private HotelRepository hotelRepository;

    @Cacheable(value = "hotels", key = "#id")
    public Optional<Hotel> getHotel(Long id) {
        return hotelRepository.findById(id);
    }

    public Hotel saveHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    public void deleteHotel(Long id) {
        hotelRepository.deleteById(id);
    }
}
