package com.example.game_store.Entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "Seller")
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idSeller;
    String sellerName;

    @JsonBackReference
    @OneToMany(mappedBy = "seller")
    List<Games> games;

}
