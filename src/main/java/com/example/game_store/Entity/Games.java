package com.example.game_store.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
//

    @ManyToOne
    Seller seller;

    @ManyToOne
    Categories category;

    @JsonBackReference
    @OneToMany(mappedBy = "games")
    List<Language> language;


}
