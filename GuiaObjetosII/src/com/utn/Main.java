package com.utn;

import java.io.PrintStream;
import java.util.Scanner;

import com.utn.exercise1.Book;
import com.utn.exercise1.Author;

import com.utn.exercise2.Bill;
import com.utn.exercise2.Client;
import com.utn.exercise2.itemSales;

import com.utn.exercise3.Account;
import com.utn.exercise3.Titular;

public class Main {

    private static PrintStream read = System.out;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
	    int exercise = 1;
	    while (exercise != 0) {
	        menu();
	        read.println("Enter Exercise Number | ' 0 ' to Exit.");
	        exercise = sc.nextInt();
	        switch (exercise) {

                case 0:
                    read.println("End of program execution.");
                    break;

                case 1:
                    // A - B
                    Author CFigue = new Author("Carlitos", "Figueroa", "carlitos_mdq@gmail.com", 'M');
                    CFigue.getAuthor();
                    read.println("\n");
                    // C - D
                    Author[] autor = new Author[3];
                    autor[0] = CFigue;
                    Book EJava = new Book("Effective Java", 100, 5, autor);
                    read.println(EJava + "\n");
                    // E - F
                    EJava.setPrice(500);
                    EJava.setStock(EJava.getStock() + 50);
                    read.println(EJava + "\n");
                    // G
                    read.println(EJava.getMessage() + "\n");
                    // H
                    Author FRobles = new Author("Fernando", "Robles", "ferRobles@gmail.com", 'M');
                    autor[1] = FRobles;
                    Book BJava = new Book("Effective Java", 435, 200, autor);
                    read.println(BJava + "\n");
                    read.println(BJava.getMessage() + "\n");
                    break;

                case 2:
                    // A - B
                    Client client = new Client("Vicky", "victoria@gmail.com", 30);
                    client.getClient();
                    read.println("\n");
                    // C
                    itemSales item0 = new itemSales("Pen", "Blue", 24, 5);
                    itemSales item1 = new itemSales("Rules", "20 cm", 30.75, 3);
                    itemSales item2 = new itemSales("File", "Black", 150.75, 2);
                    itemSales[] items = new itemSales[3];
                    items[0] = item0;
                    items[1] = item1;
                    items[2] = item2;
                    Bill factura = new Bill(client, items);
                    read.println(factura);
                    break;

                case 3:
                    // A
                    Titular TitDai = new Titular("Daiana", 'F');
                    read.println(TitDai + "\n");
                    // B
                    Account cuenta = new Account(10000, TitDai);
                    read.println(cuenta + "\n");
                    // C
                    cuenta.getDeposit(2500);
                    read.println("Balance: " + cuenta.getBalance());
                    cuenta.getExtraction(1000);
                    read.println("Balance: " + cuenta.getBalance());
                    // D
                    cuenta.getExtraction(15000);
                    read.println("Balance: " + cuenta.getBalance() + "\n");
                    // E
                    read.println("Operaciones Realizadas: ");
                    for(String ops : cuenta.getOperations()) {
                        if(ops != null) {
                            read.println(ops);
                        }
                    }
                    break;

                default:
                    read.println("Non-existent exercise.");
                    break;

            }
            limpiarPantalla();
        }
    }

    public static void menu() {
        read.println(" [ 00 ] - Exit the Program.");
        read.println(" [ 01 ] - Book - Author.");
        read.println(" [ 02 ] - Client - Bill - Sales.");
        read.println(" [ 03 ] - Titular - Account.");
    }

    public static void limpiarPantalla() {         // se dejan 60 espacios creando una especie de cls de la consola
        for (int i = 0; i < 3; i++) {
            read.println("\n");
        }
    }

}
