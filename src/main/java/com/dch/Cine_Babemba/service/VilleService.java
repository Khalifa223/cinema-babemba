/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dch.Cine_Babemba.service;

import com.dch.Cine_Babemba.entity.Ville;
import com.dch.Cine_Babemba.repository.VilleRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC
 */
@Service
@AllArgsConstructor
public class VilleService {
    private final VilleRepository villeRepository;
    
    public Ville saveVille(Ville ville) {
        return villeRepository.save(ville);
    }
    
    public List<Ville> getVilles() {
        return villeRepository.findAll();
    }
}
