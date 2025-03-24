/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dch.Cine_Babemba.controller;

import com.dch.Cine_Babemba.entity.Ville;
import com.dch.Cine_Babemba.service.VilleService;
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
@RequestMapping("ville")
@AllArgsConstructor
public class VilleController {
    private final VilleService villeService;
    
    @PostMapping
    public Ville saveVille(@RequestBody Ville ville) {
        return villeService.saveVille(ville);
    }
    
    @GetMapping
    public List<Ville> getVilles() {
        return villeService.getVilles();
    }
}
