package com.example.game_store.Repository;

import com.example.game_store.Entity.Games;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GamesRepository extends CrudRepository<Games, Long> {


    List<Games> findAll();

    Games findDistrictById(@Param("id") Long id);


}
