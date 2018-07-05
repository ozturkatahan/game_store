package com.example.game_store.Controller;

import com.example.game_store.Entity.Language;
import com.example.game_store.Service.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping(value = "/api/langues")
public class LanguageController {

    @Autowired
    LanguageService languageService;


    @RequestMapping (path = "/listLanguage",method = RequestMethod.GET)
    @ResponseBody
    public List<Language> getLanguageAllController() { return languageService.getLanguageAllService(); }

    @RequestMapping(path = "/saveLanguage", method = RequestMethod.POST,consumes = "application/json")
    public @ResponseBody HttpStatus saveLanguageController(@RequestBody Language language){

        try {
            languageService.saveLanguageService(language);
        }
        catch (Exception e){

            System.out.println("Exception occurred");

        }

        return HttpStatus.OK;

    }
}
