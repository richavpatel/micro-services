package io.spring.ratingsinfoservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class RatingsController {

        @Value("${spring.application.name:no name}")
        private String appName;

        @Value("${server.port}")
        private String port;

        @GetMapping("/ratings")
        public String hotel(){
            return "List of ratings";
        }

        @GetMapping("/location")
        public String getHotelServiceLocation(){
            return appName + " : " + port;
        }

}
