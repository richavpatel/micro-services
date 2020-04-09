package io.spring.hotelinfoservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HotelController {

    @Value("${spring.application.name:no name}")
    private String appName;

    @Value("${server.port}")
    private String port;

    @GetMapping("/hotel")
    public String hotel(){
        return "List of hotel";
    }

    @GetMapping("/location")
    public String getHotelServiceLocation(){
        return appName + " : " + port;
    }
}
