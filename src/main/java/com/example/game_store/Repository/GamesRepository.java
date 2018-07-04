package com.example.game_store.Repository;

import com.example.game_store.Games;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface GamesRepository extends CrudRepository<Games,Long> {


    List<Games> findAll();
    Games findDistrictById(@Param("id") Long id);



}
