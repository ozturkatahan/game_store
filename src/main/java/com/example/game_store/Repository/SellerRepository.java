package com.example.game_store.Repository;

import com.example.game_store.Entity.Seller;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SellerRepository extends CrudRepository<Seller, Long> {
    List<Seller> findAll();

}
