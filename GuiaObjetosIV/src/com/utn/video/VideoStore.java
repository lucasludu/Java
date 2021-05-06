package com.utn.video;

import com.utn.client.Client;
import com.utn.movie.Movie;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class VideoStore {

    /** Atributes **/
    List<Client> clients = new ArrayList<>();
    List<Movie> movies   = new ArrayList<>();
    List<Rent> rents     = new ArrayList<>();

    /** Constructor **/
    public VideoStore () {

    }

    public VideoStore(List<Client> clients, List<Movie> movies, List<Rent> rents) {
        this.clients = clients;
        this.movies  = movies;
        this.rents   = rents;
    }

    /** GETTER **/
    public List<Client> getClients() {
        return clients;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public List<Rent> getRents() {
        return rents;
    }

    /** SETTER **/
    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public void setRents(List<Rent> rents) {
        this.rents = rents;
    }

    /** toString **/
    @Override
    public String toString() {
        return
                "VideoStore { " +
                "Clients = "  + clients + "\n" +
                "Movies --> " + movies  + "\n" +
                "Rents --> "  + rents   + " "  +
                '}';
    }

    /******************************************************************************************************************/

                                    /*********************
                                        Search Methods
                                     *********************/

    public Client searchClients (String name) {
        Optional<Client> opCli = this.clients.stream().filter((Client c)->c.getName().
                                 equalsIgnoreCase(name)).findFirst();
        return opCli.isPresent() ? opCli.get() : null;
    }

    public Movie searchMovie (String title) {
        Optional<Movie> opMovie = this.movies.stream().filter((Movie m)->m.getTitle().
                                  equalsIgnoreCase(title)).findFirst();
        return opMovie.isPresent() ? opMovie.get() : null;
    }

    public List<Rent> searchClientsRents (String clientName) {
        Client c = searchClients(clientName);
        return this.rents.stream().filter((Rent r)->r.getClient().equals(c)).collect(Collectors.toList());
    }

                        /** ADD NEW RENT **/


    public void createNewRent (String clientName, String title) {
        Client c = searchClients(clientName);
        Movie m = searchMovie(title);

        if (c != null) {
            if (m != null && m.getStock() > 0) {
                Rent newRent = new Rent(c, m);
                c.getRent().add(newRent);
                this.rents.add(newRent);
                m.setRents(m.getRents() + 1);
                m.setStock(m.getStock() - 1);
            } else {
                throw new RuntimeException("The movie doesn´t exist");
            }
        } else {
            System.out.println("The name ingressed doesn´t exist. We´ve created a new Client with this name " + clientName);
            Client newClient = new Client();
            newClient.setName(clientName);
            this.clients.add(newClient);
        }
    }

                    /** RETURN RENT **/

    public void returnRent (String name, String title) {
        Client c = searchClients(name);
        Movie m = searchMovie(title);
        if (c != null && m != null && m.getStock() != 0) {
            m.setStock(m.getStock() + 1);
            m.setRents(m.getRents() - 1);
            System.out.println("The movie was returned");
        } else {
            System.out.println("Error");
        }
    }

                    /** Add and Show Rent **/

    public void addRent (Rent newRent) {
        rents.add(newRent);
    }

    public void showRent () {
        if (rents != null) {
            rents.stream().forEach(System.out::println);
        } else {
            throw new RuntimeException("The movie list is Empty.");
        }
    }

                    /** Delete Rent **/

    public void deleteRent (int id) {
        this.rents.removeIf((Rent r)->r.getId() == id);
    }


                   /** Add ando Show Movies **/

    public void addMovie (Movie newMovie) {
        this.movies.add(newMovie);
    }

    public void showMovies () {
        if (movies != null) {
            movies.stream().forEach(System.out::println);
        } else {
            throw new RuntimeException("The movie list is empty.");
        }
    }

                    /** Add and Show Clients **/

    public void addClient (Client client) {
        this.clients.add(client);
    }

    public void showClients () {
        if (this.clients != null) {
            clients.stream().forEach(System.out::println);
        } else {
            throw new RuntimeException("The client lists is empty");
        }
    }


    public List<Rent> rentsToDay () {
        if (rents != null) {
            return rents.stream().filter((Rent r)->r.getRentDate().equals(LocalDate.now())).
                   collect(Collectors.toList());
        }
        throw new RuntimeException("Empty List");
    }


                /************************
                    SORT STOCK MOVIES
                 ****************************/

    public List<Movie> sortStockMovies () {
        List<Movie> sortDateR = movies;
        return sortDateR.stream().sorted((Movie m1, Movie m2)->m2.getStock() - m1.getStock()).
               collect(Collectors.toList());
    }

    public void showMostRentMovies() {
        List<Movie> sortedMovies = sortStockMovies();
        sortedMovies.stream().forEach(System.out::println);
    }

    public List<Movie> sortMaxDuration () {
        List<Movie> sortMovie = movies;
        return sortMovie.stream().sorted((Movie m1, Movie m2)->m2.getDuration() - m1.getDuration()).
               collect(Collectors.toList());
    }

    public void showMaxDuration() {
        List<Movie> maxDur = sortMaxDuration();
        maxDur.stream().forEach(System.out::println);
    }





}
