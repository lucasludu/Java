package com.utn.movie;

import java.time.LocalDate;

public class Movie {

    private String title = "";
    private LocalDate release = null;
    private int duration = 0;
    private String audience = "";
    private String country = "";
    private String description = "";
    private int stock = 0;
    private int rents = 0;

    /** Constructor **/
    public Movie () {

    }

    public Movie(String title, LocalDate release, int duration, String audience, String country, String description, int stock, int rents) {
        this.title       = title;
        this.release     = release;
        this.duration    = duration;
        this.audience    = audience;
        this.country     = country;
        this.description = description;
        this.stock       = stock;
        this.rents       = rents;
    }

    /** GETTER **/
    public String getTitle() {
        return title;
    }

    public LocalDate getRelease() {
        return release;
    }

    public int getDuration() {
        return duration;
    }

    public String getAudience() {
        return audience;
    }

    public String getCountry() {
        return country;
    }

    public String getDescription() {
        return description;
    }

    public int getStock() {
        return stock;
    }

    public int getRents() {
        return rents;
    }

    /** SETTER **/
    public void setTitle(String title) {
        this.title = title;
    }

    public void setRelease(LocalDate release) {
        this.release = release;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setAudience(String audience) {
        this.audience = audience;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setRents(int rents) {
        this.rents = rents;
    }

    /** toString **/
    @Override
    public String toString() {
        return
                "Movie { " +
                "Title = '"         + title         + '\''  + ", " +
                "Release = "        + release               + ", " +
                "Duration = "       + duration              + ", " +
                "Audience = '"      + audience      + '\''  + ", " +
                "Country = '"       + country       + '\''  + ", " +
                "Description = '"   + description   + '\''  + ", " +
                "Stock = "          + stock                 + ", " +
                "Rents = "          + rents                 + " "  +
                '}';
    }

}
