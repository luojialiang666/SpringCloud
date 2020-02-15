package com.bdqn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.websocket.server.PathParam;

@RestController
public class UserController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/buy/{id}")
    public String getItem(@PathVariable("id") String id){
        String str = restTemplate.getForObject("http://EUREKA-SERVER01/item/" + id, String.class);
        return str;
    }

}
