package io.spring.hotelcatalogservice.model;

public class Hotel {
    public String hotelId;
    public String name;
    public String description;

    public Hotel() {
    }

    public Hotel(String hotelId, String name, String description) {
        this.hotelId = hotelId;
        this.name = name;
        this.description = description;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
