package com.example.test.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class Weapon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String rarity;

    @Column(nullable = false)
    private Integer damage;

    @Column(nullable = false)
    private Float weight;

    @Column(nullable = false)
    private BigDecimal price;
}
