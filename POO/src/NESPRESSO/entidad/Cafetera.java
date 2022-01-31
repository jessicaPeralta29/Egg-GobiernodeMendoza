/*
 *Programa Nespresso. Desarrolle una clase Cafetera con los atributos
capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
menos, los siguientes métodos
 */
package NESPRESSO.entidad;

import java.util.Scanner;

public class Cafetera {

    private double capacidadMaxima;
    private double cantidadActual;
    private int tamañoTaza;

    //Constructor predeterminado o vacío
    public Cafetera() {
    }
    Scanner leer = new Scanner(System.in);

    public Cafetera(double cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    //Constructor con la capacidad máxima y la cantidad actual
    public Cafetera(double capacidadMaxima, double cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }
//Métodos getters y setters.

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setTamañoTaza(int tamañoTaza) {
        this.tamañoTaza = tamañoTaza;
    }

    public void setCantidadActual(double cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getTamañoTaza() {
        return tamañoTaza;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }


}
