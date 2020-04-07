package io.spring.hotelcatalogservice.controller;

import io.spring.hotelcatalogservice.model.CatalogItem;
import io.spring.hotelcatalogservice.model.Hotel;
import io.spring.hotelcatalogservice.model.Rating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class HotelCatalogController {


    @Autowired
    RestTemplate restTemplate;

/*   http://localhost:8081/catalog/123      from hotel catalog
     http://localhost:8082/hotel/1          from hotel Info
     http://localhost:8083/ratings/1        from ratings Info    */

/*    @GetMapping("/{userId}")
    List<CatalogItem> getCatalog(String userId) {
        //We need first ratings
        List<Rating> ratings = Arrays.asList(
                new Rating("1", 4),
                new Rating("2", 40),
                new Rating("3", 41)
        );
        return ratings.stream().map(rating -> {
            Hotel hotel = restTemplate.getForObject("http://localhost:8082/hotel/" + rating.getHotelId(), Hotel.class);
            return new CatalogItem(hotel.getName(), "Catalog descSuper", rating.getRating());
        })
                .collect(Collectors.toList());
}*/
@GetMapping
public String hi(){
    return "fg";
}
}
