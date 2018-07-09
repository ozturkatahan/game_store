package com.example.game_store.Repository;

import com.example.game_store.Entity.Language;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LanguageRepository extends CrudRepository<Language, Long> {


    List<Language> findAll();


}
