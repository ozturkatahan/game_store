package com.example.game_store.Service;

import com.example.game_store.Entity.Language;
import com.example.game_store.Repository.LanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageService {
    @Autowired
    LanguageRepository languageRepository;


    public List<Language> getLanguageAllService() {
        return languageRepository.findAll();

    }


    public void saveLanguageService(Language language) {

        languageRepository.save(language);
    }
}
