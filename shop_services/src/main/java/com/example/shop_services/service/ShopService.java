package com.example.shop_services.service;

import com.example.shop_services.entity.Shop;
import com.example.shop_services.repository.ShopRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ShopService {

    @Autowired
    private ShopRepository shopRepository;

    public Shop saveShop(Shop shop) {
        log.info("Inside saveShop of ShopService");
        return shopRepository.save(shop);
    }

    public Shop findShopById(Long shopId) {
        log.info("Inside saveShop of ShopService");
        return shopRepository.findByShopId(shopId);
    }
}
