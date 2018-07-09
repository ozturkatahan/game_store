package com.example.game_store.Entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
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


    @ManyToOne
    Games games;

}
