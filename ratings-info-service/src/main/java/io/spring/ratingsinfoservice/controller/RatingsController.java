package io.spring.ratingsinfoservice.controller;

import io.spring.ratingsinfoservice.model.Rating;
import io.spring.ratingsinfoservice.model.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratings")
public class RatingsController {

    @RequestMapping("/{hotelId}")
    public Rating getHotelRating(@PathVariable String hotelId){
        return  new Rating(hotelId, 4);
    }

    //userRating method
}
