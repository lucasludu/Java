package com.utn;

import com.utn.ejercicio1.Rectangle;
import com.utn.ejercicio2.Empleado;
import com.utn.ejercicio3.Venta;
import com.utn.ejercicio4.Banco;
import com.utn.ejercicio5.Hora;

import java.io.PrintStream;
import java.util.Scanner;
import java.util.Random;

public class Main {

    private static PrintStream salida = System.out;
    private static Scanner scanner = new Scanner(System.in);
    private static Random scannerR = new Random();

    public static void main(String[] args) {

	    int ejercicio = 1;

	    do {
	        menu();
            salida.println("Ingrese Numero de Ejercicio | 0 para salir.");
            ejercicio = scanner.nextInt();

            switch (ejercicio) {

                case 0:

                    salida.println("Ejecución Finalizada.");
                    break;

                case 1:

                    salida.println("Ejercicio 1 - RECTANGULO");

                    salida.println("Ingrese Ancho: ");
                    double broad = scanner.nextDouble();
                    salida.println("Ingrese Largo: ");
                    double high = scanner.nextDouble();
                    Rectangle rectangulo = new Rectangle(broad, high);
                    salida.println(rectangulo);

                    salida.println(rectangulo.getPerimetro() + " " + "mts");
                    salida.println(rectangulo.getArea() + " " + "m2");

                    rectangulo.setBroad(5);
                    rectangulo.setHigh(10);
                    salida.println(rectangulo);

                    salida.println(rectangulo.getPerimetro() + " " + "mts");
                    salida.println(rectangulo.getArea() + " " + "m2");

                    Rectangle newRectangulo = new Rectangle();
                    salida.println(newRectangulo);
                    break;

                case 2:

                    salida.println("Ejercicio 2 - EMPLEADO");
                    Empleado CF = new Empleado(36445644, "Carlitos", "Figueroa", 70000);
                    Empleado FR = new Empleado(30876567, "Fernando", "Robles", 85000);
                    salida.println(CF);
                    salida.println(FR);

                    salida.println("El salario anual de FR:" + " " + FR.getSalarioAnual());

                    salida.println("Ingrese el aumento del salario: ");
                    double porc = scanner.nextDouble();
                    salida.println(String.format("El salario de Carlitos aumento un %s y es de: %s", porc, CF.getAumento(porc)));
                    break;

                case 3:

                    salida.println("Ejercicio 3 - VENTA");
                    Venta itemVenta = new Venta(1, "Fotocopia", 200, 3.75);
                    salida.println(itemVenta);
                    break;

                case 4:

                    salida.println("Ejercicio 4 - BANCO");
                    Banco cuenta = new Banco(1, "Anchelo", 15000);

                    salida.println(cuenta);

                    salida.println(String.format("Deposito 2500 --> Monto: %s", cuenta.getCredito(2500)));
                    salida.println(String.format("Compra 1500 --> Monto: %s", cuenta.getDebito(1500)));
                    salida.println(String.format("Compra 30000 --> Monto: %s", cuenta.getDebito(30000)));

                    salida.println(cuenta);
                    break;

                case 5:

                    salida.println("Ejercicio 5 - HORA");
                    Hora hora = new Hora(23, 59, 59);
                    salida.println(hora.getHora());

                    hora.sumarSegundo();
                    salida.println(hora.getHora());

                    hora.retrocederSegundo();
                    salida.println(hora.getHora());
                    break;

                default:

                    salida.println("Ejercicio Invalido");
                    break;

            }
            salida.println("Desea realizar otro ejercicio? Presione 0 para salir");
        } while (ejercicio != 0);
    }

    public static void menu() {
        salida.println("[ 01 ] - Objeto Rectangulo.");
        salida.println("[ 02 ] - Objeto Empleado.");
        salida.println("[ 03 ] - Objeto Venta.");
        salida.println("[ 04 ] - Objeto Banco.");
        salida.println("[ 05 ] - Objeto Hora.");
    }

}
