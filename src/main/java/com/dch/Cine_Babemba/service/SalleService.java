/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dch.Cine_Babemba.service;

import com.dch.Cine_Babemba.entity.Salle;
import com.dch.Cine_Babemba.repository.SalleRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC
 */
@Service
@AllArgsConstructor
public class SalleService {
    private final SalleRepository salleRepository;
    
    public Salle saveSalle(Salle salle) {
        return salleRepository.save(salle);
    }
    
    public List<Salle> getSalles() {
        return salleRepository.findAll();
    }
    
}
