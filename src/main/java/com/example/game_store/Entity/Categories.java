package com.example.game_store.Entity;

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

//        @OneToMany(mappedBy = "category")
//        List<Games> games;


}
