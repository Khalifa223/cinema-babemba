/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dch.Cine_Babemba.service;

import com.dch.Cine_Babemba.entity.Film;
import com.dch.Cine_Babemba.repository.FilmRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC
 */
@Service
@AllArgsConstructor
public class FilmService {
    private final FilmRepository filmRepository;
    
    public Film saveFilm(Film film) {
        return filmRepository.save(film);
    }
    
    public List<Film> getFilms() {
        return filmRepository.findAll();
    }
}
