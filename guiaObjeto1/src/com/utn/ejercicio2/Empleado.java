package com.utn.ejercicio2;

public class Empleado {

    private int dni;
    private String nombre;
    private String apellido;
    private double salario;

    public Empleado (int dni, String nombre, String apellido, double salario) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", salario=" + salario +
                '}';
    }

    public double getSalarioAnual() {
        return this.salario * 12;
    }

    public double getAumento(double porcentaje) {
        return this.salario = this.salario + (this.salario * porcentaje / 100);
    }

}
