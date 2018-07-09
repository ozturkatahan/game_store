package com.example.game_store.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "Categories")
public class Categories {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCategories;
    String nameCategory;

    @JsonBackReference
    @OneToMany(mappedBy = "category")
    List<Games> games;


}
