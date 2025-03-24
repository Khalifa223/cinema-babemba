/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dch.Cine_Babemba.controller;

import com.dch.Cine_Babemba.entity.Place;
import com.dch.Cine_Babemba.service.PlaceService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author PC
 */
@RestController
@RequestMapping("place")
@AllArgsConstructor
public class PlaceController {
    private final PlaceService placeService;
    
    @PostMapping
    public Place savePlace(@RequestBody Place place) {
        return placeService.savePlace(place);
    }
    
    @GetMapping
    public List<Place> getPlaces() {
        return placeService.getPlaces();
    }
    
}
