package com.edwin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {

    @GetMapping("/say")
    public String sayHello(){
        return "Hello edwin 哈哈！！";
    }

    @GetMapping("/info")
    public Map<String,Object> getInfo(){
        Map<String,Object> map = new HashMap();
        map.put("name","危存盛");
        map.put("age",26);
        return map;
    }
}
