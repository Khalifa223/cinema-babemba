/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dch.Cine_Babemba.service;

import com.dch.Cine_Babemba.entity.Cinema;
import com.dch.Cine_Babemba.repository.CinemaRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC
 */
@Service
@AllArgsConstructor
public class CinemaService {
    private final CinemaRepository cinemaRepository;
    
    public Cinema saveCinema(Cinema cinema) {
        return cinemaRepository.save(cinema);
    }
    
    public List<Cinema> getCinemas() {
        return cinemaRepository.findAll();
    }
}
