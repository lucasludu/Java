package com.utn;

import com.utn.client.Client;
import com.utn.movie.Audience;
import com.utn.movie.Genere;
import com.utn.movie.Movie;
import com.utn.video.VideoStore;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Movie hp = new Movie("Harry Potter"       , LocalDate.of(2001, Month.AUGUST   , 13), 250, Genere.ADVENTURE, "ING", Audience.PG, 30 , 5);
        Movie mk = new Movie("Mortal Kombat"      , LocalDate.of(1992, Month.SEPTEMBER, 2) , 150, Genere.ACTION   , "USA", Audience.PG, 25 , 15);
        Movie tn = new Movie("The Noun"           , LocalDate.of(2018, Month.JANUARY  , 25), 135, Genere.HORROR   , "AUS", Audience.PG, 150, 50);
        Movie ib = new Movie("Inglorius Bastards" , LocalDate.of(2001, Month.AUGUST   , 13), 300, Genere.ACTION   , "USA", Audience.PG, 30 , 5);

        VideoStore cuevana = new VideoStore();

        cuevana.addMovie(hp);
        cuevana.addMovie(mk);
        cuevana.addMovie(tn);
        cuevana.addMovie(ib);

        /** QUANTITY STOCK AND RENT MOVIE **/
        System.out.println("Mortal Kombat Movie: ");
        System.out.println("Stock: " + mk.getStock() + " " + "Rent: " + mk.getRents());

        cleanScreen(1);

        Client JS = new Client("John Salchichon", 2165464, "Rivadavia 454");
        Client FR = new Client("Fernando Robles", 6516547, "Belgrano 454");
        Client CF = new Client("Carlos Figueroa", 8465156, "Azcuenaga 454");
        Client DB = new Client("Daiana Bilheres", 4984651, "Independencia 454");

        cuevana.addClient(JS);
        cuevana.addClient(FR);
        cuevana.addClient(CF);
        cuevana.addClient(DB);

        cuevana.createNewRent("John Salchichon", "Mortal Kombat");
        cuevana.createNewRent("Fernando Robles", "Inglorius Bastards");
        cuevana.createNewRent("Fernando Robles", "Mortal Kombat");
        cuevana.createNewRent("Carlos Figueroa", "The Noun");
        cuevana.createNewRent("Daiana Bilheres", "Harry Potter");
        cuevana.createNewRent("Daiana Bilheres", "Mortal Kombat");

        cuevana.showRent();

        cleanScreen(1);

        /** QUANTITY STOCK AND RENT MOVIE **/
        System.out.println("Mortal Kombat Movie: ");
        System.out.println("Stock: " + mk.getStock() + " " + "Rent: " + mk.getRents());

        cuevana.returnRent("Fernando Robles", "Mortal Kombat");
        System.out.println("Stock: " + mk.getStock() + " " + "Rent: " + mk.getRents());

        cleanScreen(1);

        /** ORDER THE QUANTITY OF STOCK FILMS **/

        System.out.println("Movies order by stock:");
        /*
        System.out.println(cuevana.sortStockMovies());*/
        cuevana.showMostRentMovies();

        cleanScreen(1);

        List<Movie> movies = new ArrayList<>();
        movies.add(hp);
        movies.add(mk);
        movies.add(tn);
        movies.add(ib);

        cuevana.showMaxDuration();

        cleanScreen(1);

        cuevana.deleteRent(2);
        cuevana.showRent();

    }

    private static void cleanScreen (int space) {
        for (int i = 0; i < space; i++) {
            System.out.println("\n");
        }
    }

}
