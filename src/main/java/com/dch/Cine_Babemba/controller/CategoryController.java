/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dch.Cine_Babemba.controller;

import com.dch.Cine_Babemba.entity.Category;
import com.dch.Cine_Babemba.service.CategorieService;
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
@RequestMapping("categorie")
@AllArgsConstructor
public class CategoryController {
    private final CategorieService categorieService;
    
    @PostMapping
    public Category saveCategorie(@RequestBody Category categorie) {
        return categorieService.saveCategorie(categorie);
    }
    
    @GetMapping
    public List<Category> getCategories() {
        return categorieService.getCategories();
    }
}
