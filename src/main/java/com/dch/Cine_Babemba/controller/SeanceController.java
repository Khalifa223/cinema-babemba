/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dch.Cine_Babemba.controller;

import com.dch.Cine_Babemba.entity.Seance;
import com.dch.Cine_Babemba.service.SeanceService;
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
@RequestMapping("seance")
@AllArgsConstructor
public class SeanceController {
    
    private final SeanceService seanceService;
    
    @PostMapping
    public Seance saveSalle(@RequestBody Seance seance) {
        return seanceService.saveSeance(seance);
    }
    
    @GetMapping
    public List<Seance> getSalles() {
        return seanceService.getSeances();
    }
    
}
