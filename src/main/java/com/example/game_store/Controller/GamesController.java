package com.example.game_store.Controller;

import com.example.game_store.Entity.Games;
import com.example.game_store.Service.GamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@ResponseBody
@RequestMapping(value = "/api/games")
public class GamesController {
    @Autowired
    GamesService gamesService;

    @RequestMapping(path = "/listGames", method = RequestMethod.GET)
    @ResponseBody
    public List<Games> getGamesAllController() {
        return gamesService.getGamesAllService();
    }

    @RequestMapping(path = "/saveGames", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody
    HttpStatus saveGamesController(@RequestBody Games games) {


        try {
            gamesService.saveGamesService(games);
        } catch (Exception e) {
            System.out.println("Exception occurred");
        }
        return HttpStatus.OK;
    }


    @RequestMapping(path = "/findGamesById/{id}", method = RequestMethod.GET)
    public @ResponseBody
    Games getFindGamesWithId(@PathVariable Long id) {
        return gamesService.findGames(id);
    }

    @RequestMapping(path = "/deleteGamesById/{id}", method = RequestMethod.DELETE)
    public @ResponseBody
    HttpStatus deleteGamesWithId(@PathVariable Long id) {

        try {
            gamesService.deleteGames(id);
        } catch (Exception e) {
            System.out.println("Exception occurred");
        }
        return HttpStatus.OK;
    }

}
