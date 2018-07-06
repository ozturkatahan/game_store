package com.example.game_store.Entity;


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

//   @OneToMany (mappedBy = "seller")
//   List<Games> games;

}
