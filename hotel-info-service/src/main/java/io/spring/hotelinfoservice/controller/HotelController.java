package io.spring.hotelinfoservice.controller;

import io.spring.hotelinfoservice.model.Hotel;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hotel")
public class HotelController {

    @RequestMapping("/{hotelId}")
    public Hotel getHotelInfo(@PathVariable String hotelId){
        return new Hotel(hotelId,"Super 8");

    }
}
