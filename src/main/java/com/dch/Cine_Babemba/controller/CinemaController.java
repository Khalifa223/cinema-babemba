/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dch.Cine_Babemba.controller;

import com.dch.Cine_Babemba.entity.Cinema;
import com.dch.Cine_Babemba.service.CinemaService;
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
@RequestMapping("cinema")
@AllArgsConstructor
public class CinemaController {
    private final CinemaService cinemaService;
    
    @PostMapping
    public Cinema saveCinema(@RequestBody Cinema cinema) {
        return cinemaService.saveCinema(cinema);
    }
    
    @GetMapping
    public List<Cinema> getCinemas() {
        return cinemaService.getCinemas();
    }
    
}
