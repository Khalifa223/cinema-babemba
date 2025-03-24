/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dch.Cine_Babemba.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.util.Collection;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author PC
 */
@Entity
@Table(name = "projection_films")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProjectionFilm {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate dateProjection;
    private double prix;
    @OneToMany(mappedBy = "projectionFilm")
    private Collection<Ticket> tickets;
    @ManyToOne
    private Salle salle;
    @ManyToOne
    private Film film;
    @ManyToOne
    private Seance seance;
    
}
