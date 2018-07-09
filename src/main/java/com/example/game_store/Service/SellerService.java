package com.example.game_store.Service;

import com.example.game_store.Entity.Seller;
import com.example.game_store.Repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellerService {

    @Autowired
    SellerRepository sellerRepository;

    public List<Seller> getSellerAllService() {
        return sellerRepository.findAll();

    }


    public void saveSellerService(Seller seller) {

        sellerRepository.save(seller);
    }
}
