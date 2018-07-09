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

    public Categories getCategoriesAllService(Long id) {
        return categoriesRepository.findOne(id);

    }

    public List<Categories> getCategoriesAll() {
        return (List<Categories>) categoriesRepository.findAll();

    }


    public void saveCategoriesService(Categories language) {
        categoriesRepository.save(language);
    }
}
