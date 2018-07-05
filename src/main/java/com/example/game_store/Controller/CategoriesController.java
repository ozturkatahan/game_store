package com.example.game_store.Controller;

import com.example.game_store.Entity.Categories;
import com.example.game_store.Service.CategoriesService;
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
@RequestMapping(value = "/api/categories")
public class CategoriesController {

    @Autowired
    CategoriesService categoriesService;

    @RequestMapping(path = "/listLanguage",method = RequestMethod.GET)
    @ResponseBody
    public List<Categories> getLanguageAllController() { return categoriesService.getCategoriesAllService(); }

    @RequestMapping(path = "/saveLanguage", method = RequestMethod.POST,consumes = "application/json")
    public @ResponseBody
    HttpStatus saveCategoriesController(@RequestBody Categories categories){

        try {
            categoriesService.saveCategoriesService(categories);
        }
        catch (Exception e){

            System.out.println("Exception occurred");

        }

        return HttpStatus.OK;

    }
}
