package com.example.user_service.service;

import com.example.user_service.ValueObject.Shop;
import com.example.user_service.ValueObject.ResponseTemplateVO;
import com.example.user_service.entity.User;
import com.example.user_service.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;


    public User saveUser(User user) {
        log.info("Inside saveUser of UserService");
        return userRepository.save(user);
    }

    public ResponseTemplateVO getUserWithShop(Long userId) {
        log.info("Inside getUserWithShop of UserService");
        ResponseTemplateVO vo = new ResponseTemplateVO();
        User user = userRepository.findByUserId(userId);

        Shop shop =
                restTemplate.getForObject("http://SHOP-SERVICE/shops" + user.getShopId(),
                        Shop.class);

        vo.setUser(user);
        vo.setShop(shop);

        return vo;
    }
}
