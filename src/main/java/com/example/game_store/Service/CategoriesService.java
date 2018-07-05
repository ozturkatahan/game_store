package com.example.game_store.Service;

import com.example.game_store.Entity.Categories;
import com.example.game_store.Repository.CategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriesService {

    @Autowired
    CategoriesRepository categoriesRepository;

    public List<Categories> getCategoriesAllService() {
        return categoriesRepository.findAll();

    }


    public void saveCategoriesService (Categories language){
        categoriesRepository.save(language);
    }
}
