package operacion_eje3.entidades;
//Crear una clase llamada Operacion que tenga como atributos privados numero1 y
//numero2. A continuación, se deben crear los siguientes métodos:

import java.util.Scanner;

public class Operacion {

    private int num1;
    private int num2;

    // a) Método constructor con todos los atributos pasados por parámetro.
    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

//b) Metodo constructor sin los atributos pasados por parámetro
    public Operacion() {
    }
//c) Métodos get y set

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }
    //d) Método para crearOperacion(): que le pide al usuario los dos números y los
    //guarda en los atributos del objeto.

    public int crearOperacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;

        return (this.num1 + this.num2);
    }

    //e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
    public int sumar(int num1, int num2) {
        int suma;
        suma = num1 + num2;
        return suma;
    }

    //g) Método multiplicar(): primero valida que no se haga una multiplicación por cero,
    //si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el
    //error. Si no, se hace la multiplicación y se devuelve el resultado al main
    public int multiplicar(int num1, int num2) {
        int multi;
        if (num1 == 0 || num2 == 0) {
            multi = 0;
            System.out.println("error");

        } else {
            multi = num1 * num2;
        }
        return multi;

    }

    //h) Método dividir(): primero valida que no se haga una división por cero, si fuera a
//pasar una división por cero, el método devuelve 0 y se le informa al usuario el
//error se le informa al usuario. Si no, se hace la división y se devuelve el resultado
//al main. 
    public double dividir(int num1, int num2) {
        double divis;

        if (num1 == 0 || num2 == 0) {
            divis = 0;
            System.out.println("error");

        } else {
            divis = num1 / num2;
        }
        return divis;

    }

}
