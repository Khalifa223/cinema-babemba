/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dch.Cine_Babemba.service;

import com.dch.Cine_Babemba.entity.Place;
import com.dch.Cine_Babemba.repository.PlaceRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC
 */
@Service
@AllArgsConstructor
public class PlaceService {
    private final PlaceRepository placeRepository;
    
    public Place savePlace(Place place) {
        return placeRepository.save(place);
    }
    
    public List<Place> getPlaces() {
        return placeRepository.findAll();
    }
}
