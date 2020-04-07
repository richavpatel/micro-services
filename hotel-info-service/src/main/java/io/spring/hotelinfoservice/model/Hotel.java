package io.spring.hotelinfoservice.model;

public class Hotel {

    private String hotelId;
    private String name;

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

    public Hotel() {
    }

    public Hotel(String hotelId, String name) {
        this.hotelId = hotelId;
        this.name = name;
    }
}
