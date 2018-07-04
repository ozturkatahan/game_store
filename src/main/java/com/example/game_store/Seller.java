package com.example.game_store;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "Seller")
public class Seller {

    private Long idSeller;
    String sellerName;

}
