package com.example.shop_services.repository;

import com.example.shop_services.entity.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopRepository extends JpaRepository<Shop, Long> {
    Shop findByShopId(Long shopId);
}
