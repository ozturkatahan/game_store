package com.example.game_store;

import lombok.Data;

import javax.persistence.*;
import java.util.Locale;

@Data
@Entity
@Table(name = "Games")
public class Games {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    String name;
    double gameSize;
    int ageLimit;


    @ManyToOne
    Seller seller;

    @ManyToOne
    Categories category;

    @ManyToOne
    Language language;






}
