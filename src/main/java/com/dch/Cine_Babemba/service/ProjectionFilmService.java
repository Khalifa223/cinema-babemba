/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dch.Cine_Babemba.service;

import com.dch.Cine_Babemba.entity.ProjectionFilm;
import com.dch.Cine_Babemba.repository.ProjectionFilmRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC
 */
@Service
@AllArgsConstructor
public class ProjectionFilmService {
    private final ProjectionFilmRepository projectionFilmRepository;
    
    public ProjectionFilm saveProjectionFilm(ProjectionFilm projectionFilm) {
        return projectionFilmRepository.save(projectionFilm);
    }
    
    public List<ProjectionFilm> getProjectionFilms() {
        return projectionFilmRepository.findAll();
    }
}
