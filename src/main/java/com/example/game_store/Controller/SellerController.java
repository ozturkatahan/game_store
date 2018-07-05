package com.example.game_store.Controller;

import com.example.game_store.Entity.Seller;
import com.example.game_store.Service.SellerService;
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
@RequestMapping(value = "/api/seller")
public class SellerController {

    @Autowired
    SellerService sellerService;


    @RequestMapping(path = "/listSeller",method = RequestMethod.GET)
    @ResponseBody
    public List<Seller> getSellerAllController() { return sellerService.getSellerAllService(); }

    @RequestMapping(path = "/saveSeller", method = RequestMethod.POST,consumes = "application/json")
    public @ResponseBody
    HttpStatus saveSellerController(@RequestBody Seller seller){

        try {
            sellerService.saveSellerService(seller);
        }
        catch (Exception e){

            System.out.println("Exception occurred");

        }

        return HttpStatus.OK;

    }
}
