package io.spring.hotelcatalogservice.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HotelCatalogController {


    @Autowired
    RestTemplateBuilder restTemplateBuilder;

    @Qualifier("eurekaClient")
    @Autowired
    EurekaClient eurekaClient;

@GetMapping("/hotelInfo")
public String hotelInfo(){
    RestTemplate restTemplate =  restTemplateBuilder.build();
    InstanceInfo nextServerInfo = eurekaClient.getNextServerFromEureka("HOTEL-INFO-SERVICE", false);
    String baseUrl = nextServerInfo.getHomePageUrl();
    return  restTemplate.getForObject(baseUrl+"/location",String.class);

}

    @GetMapping("/ratingsInfo")
    public String ratingsInfo(){
        RestTemplate restTemplate =  restTemplateBuilder.build();
        InstanceInfo nextServerInfo = eurekaClient.getNextServerFromEureka("RATINGS-INFO-SERVICE", false);
        String baseUrl = nextServerInfo.getHomePageUrl();
        return  restTemplate.getForObject(baseUrl+"/location",String.class);

    }
}
