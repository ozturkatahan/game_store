package com.example.game_store.Entity;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "Language")
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idLanguage;
    String language;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinTable(name = "language_games")
    Games games;

}
