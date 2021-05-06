package com.utn.video;

import com.utn.client.Client;
import com.utn.movie.Movie;

import java.time.LocalDate;

public class Rent {

    /** Atributes **/
    public static int cont = 0;

    private int id = 0;
    private Client client = null;
    private Movie movie = null;
    private LocalDate rentDate = null;
    private LocalDate returnDate = null;

    /** Constructor **/
    public Rent () {

    }

    public Rent(Client client, Movie movie) {
        this.id = cont++;
        this.client = client;
        this.movie = movie;
        this.rentDate = LocalDate.now();
        this.returnDate = LocalDate.now().plusDays(2);
    }

    /** GETTER **/
    public static int getCont() {
        return cont;
    }

    public int getId() {
        return id;
    }

    public Client getClient() {
        return client;
    }

    public Movie getMovie() {
        return movie;
    }

    public LocalDate getRentDate() {
        return rentDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    /** SETTER **/
    public static void setCont(int cont) {
        Rent.cont = cont;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public void setRentDate(LocalDate rentDate) {
        this.rentDate = rentDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    /** toString **/
    @Override
    public String toString() {
        return
                "Rent { " +
                "ID = "          + id           + "\n" +
                "Client --> "    + client       + "\n" +
                "Movie --> "     + movie        + "\n" +
                "Rent Date = "   + rentDate     + ", " +
                "Return Date = " + returnDate   + " "  +
                '}'  + "\n";
    }

}
