package com.example.game_store.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

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
    @JoinColumn(name = "seller")
    Seller seller;

    @ManyToOne
    @JoinColumn(name = "category")
    Categories category;

    @OneToMany(mappedBy = "games")
        List<Language> language;






}
