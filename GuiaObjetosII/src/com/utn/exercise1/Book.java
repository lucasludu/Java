package com.utn.exercise1;

import java.util.Arrays;
import com.utn.exercise1.Author;

public class Book {

    private String title;
    private double price;
    private int stock;
    private Author[] author;

    public Book() {

    }

    public Book(String title, double price, int stock, Author[] author) {
        this.title = title;
        this.price = price;
        this.stock = stock;
        this.author = author;
    }

    /** GETTER **/
    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public Author[] getAuthor() {
        return author;
    }

    /** SETTER **/
    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    /** toString **/
    @Override
    public String toString() {
        return "Book { " +
                "title = '" + title + '\'' +
                ", price = " + price +
                ", stock = " + stock +
                ",\nAuthor = " + Arrays.toString(author) + " " +
                '}';
    }

    public String getMessage() {
        StringBuilder nameC = new StringBuilder();
        for(Author authors : author) {
            if(authors != null) {
                nameC.append(authors.getName());
                nameC.append(" ");
                nameC.append(authors.getSurName());
                nameC.append(",");
            }
        }
        return String.format("The book, %s of %s is sold to $%s.", this.title, nameC, this.price);
    }

}
