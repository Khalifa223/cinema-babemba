/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dch.Cine_Babemba.service;

import com.dch.Cine_Babemba.entity.Seance;
import com.dch.Cine_Babemba.repository.SeanceRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC
 */
@Service
@AllArgsConstructor
public class SeanceService {
    private final SeanceRepository seanceRepository;
    
    public Seance saveSeance(Seance seance) {
        return seanceRepository.save(seance);
    }
    
    public List<Seance> getSeances() {
        return seanceRepository.findAll();
    }
}
