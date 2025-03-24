/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dch.Cine_Babemba.service;

import com.dch.Cine_Babemba.entity.Category;
import com.dch.Cine_Babemba.repository.CategorieRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC
 */
@Service
@AllArgsConstructor
public class CategorieService {
    private final CategorieRepository categorieRepository;
    
    public Category saveCategorie(Category categorie) {
        return categorieRepository.save(categorie);
    }
    
    public List<Category> getCategories() {
        return categorieRepository.findAll();
    }
    
}
