package com.example.game_store.Repository;

import com.example.game_store.Entity.Categories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriesRepository extends CrudRepository<Categories,Long> {

    List<Categories> findAll();

}
