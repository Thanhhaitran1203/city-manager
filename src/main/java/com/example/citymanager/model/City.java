package com.example.citymanager.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;
    private int area;
    private int population;
    private int gdp;
    private String description;
}
