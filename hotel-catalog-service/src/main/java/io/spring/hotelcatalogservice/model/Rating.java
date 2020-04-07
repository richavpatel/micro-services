package io.spring.hotelcatalogservice.model;

public class Rating {

    private String hotelId;
    private int rating;

    public Rating() {
    }

    public Rating(String hotelId, int rating) {
        this.hotelId = hotelId;
        this.rating = rating;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelID(String hotelID) {
        this.hotelId = hotelId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

}
