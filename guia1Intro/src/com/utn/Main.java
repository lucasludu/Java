package com.utn;

import java.io.PrintStream;
import java.util.Scanner;
import java.util.Random;


public class Main {

    private static PrintStream salida = System.out;
    private static Scanner scanner = new Scanner(System.in);
    private static Random scannerR = new Random();

    public static void main(String[] args) {
        Scanner menuExercise = new Scanner(System.in);
	    int exercise = 1;
        while (exercise != 0) {
            salida.println("Ingrese el ejercicio a realizar | Cero para salir.");
            exercise = menuExercise.nextInt();
            switch (exercise) {
                case 0:
                    salida.println("Ejecución Finalizada.");
                    break;
                case 1:
                    ejercicio1();
                    break;
                case 2:
                    ejercicio2();
                    break;
                case 3:
                    ejercicio3();
                    break;
                case 4:
                    ejercicio4();
                    break;
                case 5:
                    ejercicio5();
                    break;
                case 6:
                    ejercicio6();
                    break;
                case 7:
                    ejercicio7();
                    break;
                case 8:
                    ejercicio8();
                    break;
                case 9:
                    ejercicio9();
                    break;
                case 10:
                    ejercicio10();
                    break;
                case 11:
                    ejercicio11();
                    break;
                case 12:
                    ejercicio12();
                    break;
                case 13:
                    ejercicio13();
                    break;
                case 14:
                    ejercicio14();
                    break;
                case 15:
                    ejercicio15();
                    break;
                case 16:
                    ejercicio16();
                    break;
                case 17:
                    ejercicio17();
                    break;
                case 18:
                    ejercicio18();
                    break;
            }
        }
    }

    // EJERCICIO 1: DARLE VALORES A LAS VARIABLES (INT - DOUBLE - CHAR) Y NUMERO ASCII DEL CARACTER.

    private static void ejercicio1() {
        int N = 3;
        double A = 6.75;
        char C = 'L';
        salida.println(String.format("N = %s | A = %s | C = %s = %s", N, A, C, Integer.valueOf(C)));
    }

    // EJERCICIO 2: HACER DOS OPERACIONES CON DOS VARIABLES ENTERAS Y DOS VARIABLES FLOTANTE.

    private static void ejercicio2() {
        int x = 2;
        int y = 5;
        double m = 12.52;
        double n = 23.32;
        salida.println(String.format("x * m = %s | y / n = %s", x*m, y/n));
    }

    // EJERCICIO 3: SUMARLE 77, RESTAR 3 Y MULTIPLICAR 2 A LA VARIABLE INT

    private static void  ejercicio3() {
        int N = 4;
        salida.println("N = "+N);
        salida.println(String.format("N+77 = %s", N+77));
        salida.println(String.format("N-3 = %s", N-3));
        salida.println(String.format("N*2 = %s", N*2));
    }

    // EJERCICIO 4: INTERCAMBIAR LOS VALORES A LAS 4 VARIABLES INT

    private static void ejercicio4() {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        b = c;
        salida.println(String.format("A = %s | B = %s | C = %s | D = %s", a, b, c, d));
        c = a;
        salida.println(String.format("A = %s | B = %s | C = %s | D = %s", a, b, c, d));
        a = d;
        salida.println(String.format("A = %s | B = %s | C = %s | D = %s", a, b, c, d));
        d = b;
        salida.println(String.format("A = %s | B = %s | C = %s | D = %s", a, b, c, d));
    }

    // EJERCICIO 5: DETERMINAR SI EL NUMERO ES PAR/IMPAR.

    private static void ejercicio5() {
        salida.println("Ingrese Numero: ");
        int N = scanner.nextInt();
        String paridad = "PAR";
        if(N % 2 != 0) {
            paridad = "IMPAR";
        }
        salida.println(String.format("%s es un numero %s", N, paridad));
    }

    // EJERCICIO 6: DETERMINAR SI EL NUMERO ES POSITIVO/NEGATIVO.

    private static void ejercicio6() {
        salida.println("Ingrese Numero: ");
        int N = scanner.nextInt();
        String signo = "NEGATIVO";
        if(N > 0) {
            signo = "POSITIVO";
        }
        salida.println(String.format("%s es un numero %s", N, signo));
    }

    // EJERCICIO 7: DETERMINAR SI EL NUMERO ES POSITIVO / PAR / MULTIPLO DE 5 DE 10 Y SI ES MAYOR A 100

    private static void ejercicio7() {
        salida.println("Ingrse Numero: ");
        int N = scanner.nextInt();
        String signo = (N > 0) ? "POSITIVO" : "NEGATIVO";
        String paridad = (N % 2 == 0) ? "PAR" : "IMPAR";
        String multiplo5 = (N % 5 == 0) ? "MULTIPLO DE 5" : "NO ES MULTIPLO DE 5";
        String multiplo10 = (N % 10 == 0) ? "MULTIPLO DE 10" : "NO ES MULTIPLO DE 10";
        String mayor100 = (N > 100) ? "ES MAYOR A 100" : "ES MENOR A 100";
        salida.println(String.format("%s es un numero %s | %s | %s | %s | %s", N, signo, paridad, multiplo5, multiplo10, mayor100));
    }

    // EJERCICIO 8: INGRESAR TU NOMBRE Y AGREGARLE BUENOS DIAS.

    private static void ejercicio8() {
        salida.println("Ingrese nombre: ");
        String nombre = scanner.nextLine();
        salida.println(String.format("Buenos dias sr/a %s", nombre));
    }

    // EJERCICIO 9: INGRESAR UN NUMERO INT Y DUBPLICARLE/TRIPLICARLE SU VALOR.

    private static void ejercicio9() {
        salida.println("Ingrese Numero: ");
        int N = scanner.nextInt();
        int N1 = N * 2;
        int N2 = N * 3;
        salida.println(String.format("El doble de %s es %s y su triple %s", N, N1, N2));
    }

    // EJERCICIO 10: PASAR LA TEMPERATURA DE G.F A G.C.

    private static void ejercicio10() {
        salida.println("Ingerese Temperatura en G.F: ");
        double GF = scanner.nextDouble();
        double GC = (GF -32) * 5/9;
        salida.println(String.format("GF: %s | GC: %s", GF, GC));
    }

    // EJERCICIO 11: CALCULAR EL PERIMETRO Y AREA DE LA CIRCUNFERENCIA INGRESANDO UN DETERMINADO RADIO.

    private static void ejercicio11() {
        salida.println("Ingrese el Radio de la circunferencia: ");
        double R = scanner.nextDouble();
        double P = 2 * Math.PI * R;
        double A = Math.PI * Math.pow(R, 2);
        salida.println(String.format("R: %s | P: %s | A: %s", R, P, A));
    }

    // EJERCICIO 12: PASAR LA VELOCIDAD DE KM/HR A MS/SG.

    private static void ejercicio12() {
        salida.println("Ingrese la velocidad en Km/Hr: ");
        double kmHr = scanner.nextDouble();
        double msSg = kmHr * 1000 / 3600;
        salida.println(String.format("kmHr: %s | msSg: %s", kmHr, msSg));
    }

    // EJERCICIO 13: CALCULAR LA HIPOTENUSA DE UN TRIANGULO RECTANGULO.

    private static void ejercicio13() {
        salida.println("Cateto Menor: ");
        double catMenor = scanner.nextDouble();
        salida.println("Cateto Mayor: ");
        double catMayor = scanner.nextDouble();
        double hipotenusa = Math.hypot(catMenor, catMayor);
        salida.println(String.format("Cateto Menor: %s | Cateto Mayor: %s | Hipotenusa: %s", catMenor, catMayor, hipotenusa));
    }

    // EJERCICIO 14: CALCULAR EL VOLUMEN DE LA ESFERA INGRESANDO UN RADIO.

    private static void ejercicio14() {
        salida.println("Ingrese Radio de la esferea: ");
        double R = scanner.nextDouble();
        double volumen = 4 * Math.PI * Math.pow(R, 3) / 3;
        salida.println(String.format("R: %s mts | V: %s mts3", R, volumen));
    }

    // EJERCICIO 15: CALCULAR EL PERIMETRO Y AREA DE UN TRIANGULO CON LOS LADOS.

    private static void ejercicio15() {
        salida.println("Ingrese primer lado");
        double lado1 = scanner.nextDouble();
        salida.println("Ingrese segundo lado");
        double lado2 = scanner.nextDouble();
        salida.println("Ingrese tercer lado");
        double lado3 = scanner.nextDouble();
        double P = (lado1 + lado2 + lado3) / 2;
        double A = P * ((P - lado1) + (P - lado2) + (P - lado3));
        salida.println(String.format("Lado 1: %s | Lado 2: %s | Lado 3: %s", lado1, lado2, lado3));
        salida.println(String.format("P: %s | A: %s", P, A));
    }

    // EJERCICIO 16: PASAR UNA VARIABLE ENTERA DE 3 DIGITOS A UN ARREGLO.

    private static void ejercicio16() {
        salida.println("Ingrese Numero de 3 digitos: ");
        int N = scanner.nextInt();
        String number = String.valueOf(N);
        char[] digits = number.toCharArray();
        salida.println(digits[0]+" "+digits[1]+" "+digits[2]);
    }

    // EJERCICICO 17: PASAR UNA VARIABLE ENTERA DE 5 DIGTOS A UN ARREGLO MOSTRANDO LAS POSICIONES INPARES.

    private static void ejercicio17() {
        salida.println("Ingrese Numero de 5 cifras: ");
        int N = scanner.nextInt();
        int[] digitos = new int[5];
        int cont = 0;
        while (N > 0) {
            digitos[cont] = N % 10;
            N = N / 10;
            cont++;
        }
        for (int i = digitos.length - 1; i >= 0; i--) {
            if(digitos[i] % 2 != 0) {
                salida.println(digitos[i]);
            }
        }
    }

    // EJERCICIO 18: MOSTRAR LAS HR/MIN/SEG Y DETERMINAR SI ES LA HORA VALIDA O NO.

    private static void ejercicio18() {
        salida.println("Ingrese Hora: ");
        int H = scanner.nextInt();
        salida.println("Ingrese Minuto: ");
        int M = scanner.nextInt();
        salida.println("Ingrese Segundo: ");
        int S = scanner.nextInt();
        boolean formate = false;
        if(H >= 0 && H < 24) {
            if(M >= 0 && M <= 60) {
                if(S >= 0 && S <= 60) {
                    formate = true;
                }
            }
        }
        if(formate) {
            salida.println(String.format("%s:%s:%s", H,M,S));
        } else {
            salida.println("Hora Incorrecta.");
        }
    }

}
