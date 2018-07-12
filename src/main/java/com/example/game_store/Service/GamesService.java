package com.example.game_store.Service;


import com.example.game_store.Entity.Games;
import com.example.game_store.Repository.GamesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GamesService {

    @Autowired
    GamesRepository gamesRepository;


    public List<Games> getGamesAllService() {
        return gamesRepository.findAll();

    }

    public Games findGames(Long id) {
        return gamesRepository.findDistrictById(id);
    }

    public void deleteGames(Games games) {
        gamesRepository.delete(games);
    }


    public void saveGamesService(Games games) {

        gamesRepository.save(games);
    }


}
