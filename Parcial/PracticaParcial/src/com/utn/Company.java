package com.utn;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Company {

    private List<Client> clients = new ArrayList<>();
    private List<Product> products = new ArrayList<>();
    private List<Order> orders = new ArrayList<>();

    public Company () {

    }

    public Company(List<Client> clients, List<Product> products, List<Order> orders) {
        this.clients = clients;
        this.products = products;
        this.orders = orders;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return
                "Company { "    +
                "Clients --> "  + clients   + "\n" +
                "Products --> " + products  + "\n" +
                "Orders --> "   + orders    + " "  +
                '}';
    }

    /*****************************************************************************************************/

                            // METHOD
    /** Client Method **/

    public void addClient (Client newClient) {
        this.clients.add(newClient);
    }

    public void showClient () {
        if (this.clients != null) {
            this.clients.stream().forEach(System.out::println);
        } else {
            throw new RuntimeException("The list is empty.");
        }
    }

    public Client searchClient (String clientName) {
        Optional<Client> opCli = this.clients.stream().filter((Client c)->c.getName().
                equalsIgnoreCase(clientName)).findFirst();
        return opCli.isPresent() ? opCli.get() : null;
    }

    /** Product Method **/

    public void addProduct (Product newProduct) {
        this.products.add(newProduct);
    }

    public void showProduct () {
        if (this.products != null) {
            this.products.stream().forEach(System.out::println);
        } else {
            throw new RuntimeException("The list is empty.");
        }
    }

    public Product searchProduct (String productName) {
        Optional<Product> opProd = this.products.stream().filter((Product p)->p.getName().
                                   equalsIgnoreCase(productName)).findFirst();
        return opProd.isPresent() ? opProd.get() : null;
    }

    /** Order Method **/

    public void addOrder (Order newOrder) {
        this.orders.add(newOrder);
    }

    public void showOrder () {
        if (this.orders != null) {
            this.orders.stream().forEach(System.out::println);
        } else {
            throw new RuntimeException("The list is empty.");
        }
    }

    public void registrerOrderBusiness (Client client, Product product, double distance) {
        Order newOrder = new Order(client, product, distance);
        if (client instanceof Business) {
            double newDeliveryPrice = newOrder.getDeliveryPrice() / 1.15;
            newOrder.setDeliveryPrice(newDeliveryPrice);
            ((Business) client).getOrders().add(newOrder);
        }
        this.orders.add(newOrder);
    }

    public void registrerOrderParticular (Client client, Product product, double distance) {
        Order newOrder = new Order(client, product, distance);
        if (client instanceof Particular) {
            ((Particular) client).getOrders().add(newOrder);
        }
        this.orders.add(newOrder);
    }

    public void createNewOrder (String clientName, String productName, double distance) {
        Client client = searchClient(clientName);
        Product product = searchProduct(productName);
        if (client instanceof Business) {
            registrerOrderBusiness(client, product, distance);
        } else {
            registrerOrderParticular(client, product, distance);
        }
    }

}
