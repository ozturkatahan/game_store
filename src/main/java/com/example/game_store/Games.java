package com.example.game_store;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Games")
public class Games {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    String name;
    String category;

}
