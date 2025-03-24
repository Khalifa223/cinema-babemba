/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dch.Cine_Babemba.controller;

import com.dch.Cine_Babemba.entity.ProjectionFilm;
import com.dch.Cine_Babemba.service.ProjectionFilmService;
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
@RequestMapping("projection")
@AllArgsConstructor
public class ProjectionFilmController {
    
    private final ProjectionFilmService projectionFilmService;
    
    @PostMapping
    public ProjectionFilm savePlace(@RequestBody ProjectionFilm projectionFilm) {
        return projectionFilmService.saveProjectionFilm(projectionFilm);
    }
    
    @GetMapping
    public List<ProjectionFilm> getPlaces() {
        return projectionFilmService.getProjectionFilms();
    }
}
