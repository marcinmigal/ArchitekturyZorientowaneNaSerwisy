package com.example.user_service.ValueObject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Shop {
    private Long shopId;
    private String shopName;
    private String shopAdress;
    private String shopCode;
}
