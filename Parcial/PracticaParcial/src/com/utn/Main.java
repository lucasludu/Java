package com.utn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        List<Order> orders = new ArrayList<>();
        List<Product> products = new ArrayList<>();
        List<Client> clients = new ArrayList<>();
        int cantOrder = 0;
        System.out.print("Enter number of Orders ");
        cantOrder = sc.nextInt();

        for (int i = 0; i < cantOrder; i++) {
            String cliName, prodName, phone, address;
            int prodNumber;
            double price, distance;

            System.out.println("Enter Client: ");
            System.out.print("Name: ");
            cliName = sc.next();
            System.out.print("Phone: ");
            phone = sc.next();
            System.out.print("Address: ");
            address = sc.next();
            Client c = new Client(cliName, phone, address);
            clients.add(c);

            System.out.println("Enter product: ");
            System.out.print("Number: ");
            prodNumber = sc.nextInt();
            System.out.print("Name: ");
            prodName = sc.next();
            System.out.print("Price: ");
            price = sc.nextDouble();

            Product p = new Product(prodNumber, prodName, price);
            products.add(p);

            System.out.print("Distance: ");
            distance = sc.nextInt();

            Order order = new Order(c, p, distance);
            orders.add(order);
        }

        orders.stream().forEach(System.out::println);




    }

    private static void cleanScreen (int space) {
        for (int i = 0; i < space; i++) {
            System.out.println("\n");
        }
    }

}
