package com.example.game_store;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Language")
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idLanguage;
    String language;

}
