package com.example.shop_services.controller;

import com.example.shop_services.entity.Shop;

import com.example.shop_services.service.ShopService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shops")
@Slf4j
public class ShopController {

    @Autowired
    private ShopService shopService;

    @PostMapping("/")
    public Shop saveDepartment(@RequestBody Shop shop){
        log.info("Inside saveShop method of ShopController");
        return shopService.saveShop(shop);
    }

    @GetMapping("/{id}")
    public Shop findShopById(@PathVariable("id") Long shopId){
        log.info("Inside findShopById method of ShopController");
        return shopService.findShopById(shopId);
    }
}
