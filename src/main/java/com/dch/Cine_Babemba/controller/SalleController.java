/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dch.Cine_Babemba.controller;

import com.dch.Cine_Babemba.entity.Salle;
import com.dch.Cine_Babemba.service.SalleService;
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
@RequestMapping("salle")
@AllArgsConstructor
public class SalleController {
    
    private final SalleService salleService;
    
    @PostMapping
    public Salle saveSalle(@RequestBody Salle salle) {
        return salleService.saveSalle(salle);
    }
    
    @GetMapping
    public List<Salle> getSalles() {
        return salleService.getSalles();
    }
    
}
