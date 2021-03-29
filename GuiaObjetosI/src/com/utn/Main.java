package com.utn;

import com.utn.exercise1.Rectangle;
import com.utn.exercise2.Employee;
import com.utn.exercise3.Sales;
import com.utn.exercise4.Account;
import com.utn.exercise5.Hour;
import com.utn.exercise6.Bank;

import javax.swing.plaf.ActionMapUIResource;
import java.io.PrintStream;
import java.util.Scanner;

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
                    read.println("\t\tInitialize default rectangle object.");
                    Rectangle rectD = new Rectangle();
                    read.println(rectD + "\n");

                    read.println("\t\tInitialize rectangle object with parameter.");
                    Rectangle rectP = new Rectangle(3, 5);
                    read.println(rectP + "\n");

                    read.println("\t\tRectangle object copy.");
                    Rectangle rectC = new Rectangle(rectD);
                    read.println(rectC + "\n");
                    read.println("\t\tModify Width and Lenght.");
                    rectD.setLenght(4);
                    rectD.setWidth(1.25);
                    read.println(rectD);

                    read.println("\n\t\tArea and Perimeter.");
                    read.println("Perimeter RectP: " + rectP.getPerimeter() + "Area RectP: " + rectP.getArea());
                    read.println("Perimeter RectD: " + rectD.getPerimeter() + "Area RectD: " + rectD.getArea() + "\n");
                    break;

                case 2:
                    read.println("\t\tDefault Constructor.");
                    Employee empleyeeD = new Employee();
                    read.println(empleyeeD + "\n");

                    read.println("\t\tConstructor by Parameter.");
                    Employee employeeP = new Employee(34864675, "Carlitos", "Figueroa", 150000);
                    read.println(employeeP + "\n");

                    read.println("\t\tAnual Salary and Increase Salary.");
                    read.println("Increase Salary: " + employeeP.getIncrementSalary(50));
                    read.println("Anual Salary: " + employeeP.getAnualSalary());

                    read.println("\t\tConstructor by Copy.");
                    Employee employeeC = new Employee(empleyeeD);
                    read.println(employeeC + "\n");

                    employeeC.setName("Genga");
                    read.println(employeeC + "\n");
                    break;

                case 3:
                    read.println("\t\tDefault Constructor.");
                    Sales saleD = new Sales();
                    read.println(saleD + "\n");

                    read.println("\t\tConstructor by Parameter.");
                    Sales saleP = new Sales("Lapiz", 2, 15.75);
                    read.println(saleP + "\n");

                    read.println("\t\tConstructor by Copy.");
                    Sales saleC = new Sales(saleD);
                    read.println(saleC);

                    read.println("\t\tModify");
                    saleC.setCuantity(20);
                    read.println(saleC + "\n");
                    break;

                case 4:
                    read.println("Cliente: ");
                    Account account = new Account("Fernando", 15000);
                    read.println(account + "\n");

                    account.getCredit(2500);
                    read.println("Balance: " + account.getBalance());
                    account.getDebit(1500);
                    read.println("Balance: " + account.getBalance());
                    account.getDebit(30000);
                    read.println("Balance: " + account.getBalance());
                    break;

                case 5:
                    read.println("Time: ");
                    Hour time = new Hour(23, 59, 59);
                    read.println(time.getHour());

                    read.println("Increment Time: ");
                    time.incrementSecond();
                    read.println(time.getHour());

                    read.println("Decrement Time: ");
                    time.decrementSecond();
                    read.println(time.getHour() + "\n");
                    break;

                case 6:
                    read.println("\t\tDefoult Constructor.");
                    Bank accountD = new Bank();
                    read.println(accountD + "\n");

                    read.println("\t\tObject with parameter.");
                    Bank accountP = new Bank("Damian Ancheluchi", "456FWEG8797VGES", 2.25, 70000);
                    read.println(accountP + "\n");

                    read.println("\t\tObject bu copy.");
                    Bank accountC = new Bank(accountP);
                    read.println(accountC + "\n");

                    accountP.entry(4000);
                    read.println("A deposit is made to the account Account2 of $4000");
                    read.println(accountP + "\n");

                    accountP.refund(2500);
                    read.println("$2500 is reimbursed to the account.");
                    read.println(accountP + "\n");

                    accountP.transfer(accountC, 6000);
                    read.println("$6000 is transfered from the accountP to the copy account");
                    read.println(accountC + "\n");
                    read.println("Balance Account2 = $" + accountP.getBalance() + ". Balance Copy Account = $" + accountC.getBalance() + "\n");
                    break;

                default:
                    read.println("Non-existent exercise.");
                    break;

            }
        }
    }

    public static void menu() {
        read.println(" [ 00 ] - EXIT THE PROGRAM.");
        read.println(" [ 01 ] - Rectangle.");
        read.println(" [ 02 ] - Employee.");
        read.println(" [ 03 ] - Sales.");
        read.println(" [ 04 ] - Account.");
        read.println(" [ 05 ] - Hour.");
        read.println(" [ 06 ] - Bank.");
    }

}
