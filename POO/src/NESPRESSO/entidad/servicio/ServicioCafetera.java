    package NESPRESSO.entidad.servicio;

import NESPRESSO.entidad.Cafetera;
import java.util.Scanner;

public class ServicioCafetera {

    private Scanner leer = new Scanner(System.in);

    private Cafetera Menu() {
        Cafetera caffe = new Cafetera();
        System.out.println("-----------------------------");
        System.out.println("--------BIENVENIDO-----------");
        System.out.println("Antes de comenzar debemos llenar la cafetera\n"
                + "ingrese la cantidad de litros a llenar\n"
                + "MAXIMO 10L");

        return caffe;
    }

    private void cantLitros(Cafetera caffe) {
        double litros = leer.nextDouble();
        do{
        if (litros > 0 && litros <= 10) {

            caffe.setCantidadActual(litros);

        } else {
            System.out.println("ingrese la cantidad correcta");
        }
        }while(litros >= 10 && litros < 0);

    }

    private void menuPrincipal() {
        System.out.println("--------------------\n"
                + "Escriba la opcion que desea\n"
                + "1-servir cafe\n"
                + "2-vaciar cafetera\n"
                + "3-agregar cafe\n"
                + "4-salir");

    }

    private void tazaTamaño() {
        System.out.println("-------------------------\n"
                + "Ingrese el tamaño de la taza\n"
                + "1-taza chica\n"
                + "2-taza mediana\n"
                + "3-taza grande");

    }

    //Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
    //máxima. 
    private void llenarCafetera(Cafetera caffe) {
        caffe.setCapacidadMaxima(caffe.getCantidadActual());
        System.out.println("----------------------");
        System.out.println("capacidad: " + caffe.getCantidadActual());
    }

    /*Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza
     */
    private void servirTaza(Cafetera caffe) {
        int chica = 1;
        int mediana = 2;
        int grande = 3;
        System.out.println("Ingrese el tamaño");
        int opc = leer.nextInt();

        if (caffe.getCantidadActual()  > chica) {
            switch (opc) {
                case 1:
                    caffe.setCantidadActual(caffe.getCapacidadMaxima() - chica);
                    System.out.println("Servido");
                    break;
                case 2:
                    caffe.setCantidadActual(caffe.getCapacidadMaxima() - mediana);
                    System.out.println("Servido");
                    break;
                case 3:
                    caffe.setCantidadActual(caffe.getCapacidadMaxima() - grande);
                    System.out.println("Servido");
                    break;

                default:
                    System.out.println("ingrese una opcion valida");
            }

        } else {
            System.out.println("hay insuficiente cafe solo se llenara con: " + caffe.getCantidadActual());
        }
        System.out.println("----------------------");
        System.out.println("capacidad: " + caffe.getCantidadActual());
        System.out.println(".--------------------------");

    }

//Método vaciarCafetera(): pone la cantidad de café actual en cero
    private void vaciarCafetera(Cafetera caffe) {
        caffe.setCantidadActual(0);
        System.out.println("----------------------");
        System.out.println("capacidad: " + caffe.getCantidadActual());
        System.out.println(".--------------------------");
    }

    //• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
//recibe y se añade a la cafetera la cantidad de café indicada  
    private void agregarCafe(Cafetera caffe) {
        System.out.println("-----------------------\n"
                + "ingrese la cantidad de litros a agregar");
        double litros = leer.nextInt();
        double cap;
        caffe.setCantidadActual(caffe.getCantidadActual() + litros);

        if (caffe.getCantidadActual() >= 10) {

            caffe.setCantidadActual(10);
            System.out.println("Se ha llenado con la capacidad maxima" + caffe.getCantidadActual());
        }
        if (caffe.getCantidadActual() < 10) {
            System.out.println("se ha llenado con una capacidad de: " + caffe.getCantidadActual());
        }

    }

    public void ejecutar() {
        Cafetera yerbita = Menu();
        cantLitros(yerbita);
        llenarCafetera(yerbita);
        int opc;

        do {
            menuPrincipal();
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    tazaTamaño();
                    servirTaza(yerbita);
                    break;
                case 2:
                    vaciarCafetera(yerbita);
                    break;
                case 3:
                    agregarCafe(yerbita);
                    break;
                case 4:
                    System.out.println("adios");
                    break;
                default:
                    System.out.println("Ingrese una opc valida");
                    if (opc != 4) {
                        menuPrincipal();
                        opc = leer.nextInt();
                    }
            }
        } while (opc != 4);

    }
}
