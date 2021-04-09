package com.utn;

import com.utn.exercise1.Cylinder;

import com.utn.exercise2.Person;
import com.utn.exercise2.Staff;
import com.utn.exercise2.Student;

import com.utn.exercise3.Circle;
import com.utn.exercise3.Figure;
import com.utn.exercise3.Rectangle;
import com.utn.exercise3.Square;

import java.io.PrintStream;
import java.util.Scanner;
import java.util.Random;


public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static Random scR = new Random();
    private static PrintStream write = System.out;

    public static void main(String[] args) {
        int exercise = -1;
        while (exercise != 0) {
            menu();
            write.println("Enter exercise to run | Zero to exit.");
            exercise = sc.nextInt();
            cleanScreen(1);
            switch (exercise) {

                case 0:
                    write.println("End the Program.");
                    break;

                case 1:
                    write.println("\t\t------------ Exercise 1 ------------\n");
                    Cylinder cylinderOne = new Cylinder();
                    write.println(cylinderOne);
                    write.println("Radio: " + cylinderOne.getR());
                    write.println("Height: " + cylinderOne.getHeight());
                    write.println("Area: " + cylinderOne.getCylinderArea());
                    write.println("Volume: " + cylinderOne.getCylinderVolume() + "\n");

                    Cylinder cylinderTwo = new Cylinder(2.75, 10.5);
                    write.println(cylinderTwo);
                    write.println("Radio: " + cylinderTwo.getR());
                    write.println("Height: " + cylinderTwo.getHeight());
                    write.println("Area: " + cylinderTwo.getCylinderArea());
                    write.println("Volume: " + cylinderTwo.getCylinderVolume() + "\n");
                    break;

                case 2:
                    write.println("\t\t------------ Exercise 2 ------------\n");
                    Student student1 = new Student(346454, "Daiana", "Bilhere", "daiana@gmail.com", "Independencia 200", 2019,4500, "Hoteleria");
                    Student student2 = new Student(345646, "Carlitos", "Figueroa", "carlos@hotmail.com", "Rivadavia 1230", 2019, 3000, "T.S.P");
                    Student student3 = new Student(354789, "Fernando", "Robles", "ferRobles@gmail.com", "La Pampa 500", 2019, 3500, "T.S.P");
                    Student student4 = new Student(348975, "Lucas", "Ludu", "lucasLudu@hotmail.com", "H.Yrigoyen 1231", 2019, 4000, "T.S.P");

                    Staff staff1 = new Staff(465464, "Victoria", "Genga", "vicky@gmail.com", "San Juan 4564", 25000, 'M');
                    Staff staff2 = new Staff(456465, "Claribel", "Ortega", "clarii@hotmail.com", "Rivadavia 1200", 35750, 'N');
                    Staff staff3 = new Staff(456456, "Damian", "Anchelo", "anchelo@gmail.com", "Larrea 13400", 76000, 'N');
                    Staff staff4 = new Staff(466531, "Amto", "Vaccari", "amto@gmail.com", "Cordoba 4000", 34000, 'M');

                    Person[] institution = new Person[10];
                    institution[0] = student1;
                    institution[1] = student2;
                    institution[2] = student3;
                    institution[3] = student4;
                    institution[4] = staff1;
                    institution[5] = staff2;
                    institution[6] = staff3;
                    institution[7] = staff4;

                    int std = 0;
                    int stf = 0;

                    for (Person persona : institution) {
                        if(persona != null) {
                            if(persona instanceof Student) std++;
                            if(persona instanceof Staff) stf++;
                        }
                    }

                    write.println("There are " + std + " student in the institution.");
                    write.println("There are " + stf + " staff membrers in the institution.");

                    double total = 0;

                    for(Person persona : institution) {
                        if(persona != null) {
                            if(persona instanceof Student) {
                                total += ((Student) persona).getQuota();
                            }
                        }
                    }

                    write.println("Total quotas: " + total + ".");
                    break;

                case 3:
                    write.println("\t\t------------ Exercise 3 ------------\n");
                    Figure circle = new Circle("Yellow", 2.5);
                    Figure rectangle = new Rectangle("Green", 4, 10);
                    Figure square = new Square("Light Blue", 3.75);

                    write.println(circle);
                    write.println(rectangle);
                    write.println(square);

                    Figure[] figure = new Figure[3];
                    figure[0] = circle;
                    figure[1] = rectangle;
                    figure[2] = square;
                    for (Figure F : figure) {
                        if(F != null) {
                            write.println("The Area of the " + F.getClass().getSimpleName() + " Figure is: " + F.calculateArea());
                            write.println("The perimeter of the " + F.getClass().getSimpleName() + " Figure is: " + F.calculatePerimeter());
                        }
                    }
                    break;

                default:
                    write.println("Non-existent exercise.");
                    break;
            }
            cleanScreen(2);
        }
    }

    public static void menu() {
        write.println("[ 00 ] - Exit the program.");
        write.println("[ 01 ] - Circle / Cylinder.");
        write.println("[ 02 ] - Person / Student / Staff.");
        write.println("[ 03 ] - Figure / Circle / Rectangle / Square.");
    }

    public static void cleanScreen(int space) {
        for (int i = 0; i <= space; i++) {
            write.println("\n");
        }
    }
}
