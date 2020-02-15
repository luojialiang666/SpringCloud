package com.bdqn.service;

import org.springframework.stereotype.Service;

@Service
public class ItemService {

    public String getItemById(String id){
        return "(server02)您要购买的商品的编号是：" + id;
    }
}
