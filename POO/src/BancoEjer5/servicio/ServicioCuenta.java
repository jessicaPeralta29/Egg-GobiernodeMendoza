package BancoEjer5.servicio;

import BancoEjer5.entidad.Cuenta;
import java.util.Random;
import java.util.Scanner;

/*• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
 */
public class ServicioCuenta {

    public Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cuenta crearCuenta() {
        Cuenta pers = new Cuenta();
        System.out.println("-------------------------\n"
                + "Bienvenido, crearemos una nueva cuenta\n"
                + "-----------------------------------\n");
        System.out.println("Ingrese su DNI");
        long auxDNI = leer.nextLong();
        pers.setDNI(auxDNI);

        //  System.out.println("Ingrese su numero de cuenta");
        int auxNumCuenta = new Random().nextInt(999999);
        pers.setNumCuenta(auxNumCuenta);

        System.out.println("Ingrese su Saldo");
        double auxSaldoActual = leer.nextDouble();
        pers.setSaldoActual(auxSaldoActual);

        return pers;

    }

    //  metodo ingresar,ingresa donero YLESUMA OTRA double
    private void ingresar(Cuenta pers) {

        System.out.println("ingrese el monto que desea ingresar");
        double ingreso = leer.nextDouble();
        pers.setSaldoActual(pers.getSaldoActual() + ingreso);
        //el set para modificarlo y el get para traer elsaldo anterior
        System.out.println("El ingreso ha sido exitoso, su saldo actual es de: " + pers.getSaldoActual());

    }

    //Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
    //se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
    //pondrá el saldo actual en 0
    private void retirar(Cuenta pers) {
        double retiro;
        System.out.println("Saldo a retirar");
        retiro = leer.nextDouble();

        if (pers.getSaldoActual()<  0 || pers.getSaldoActual() < retiro) {
            pers.setSaldoActual(0);

            System.out.println("No hay sufuciente saldo" + pers.getSaldoActual());
        } else {
            pers.setSaldoActual(pers.getSaldoActual() - retiro);
            System.out.println("Retiro exitoso.Su saldo actual es de: " + pers.getSaldoActual());
        }

    }

    private void extraccionRapida(Cuenta pers) {
        double retiro;
        System.out.println("Saldo a retirar");
        retiro = leer.nextDouble();

        if (pers.getSaldoActual() * 0.20 < retiro) {
            System.out.println("---------------------------------------------");
            System.out.println("Solo se permite el 20%, intentelo nuevamente");
            System.out.println("---------------------------------------------");

        } else {
            pers.setSaldoActual(pers.getSaldoActual() - retiro);
            System.out.println("Retiro exitoso.Su saldo actual es de: " + pers.getSaldoActual());

        }

    }
//Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta

    private void consultarSaldo(Cuenta pers) {
        System.out.println("---------------------------------------------");
        System.out.println("Su saldo actual es de :" + pers.getSaldoActual());
        System.out.println("---------------------------------------------");

    }
    //Método consultarDatos(): permitirá mostrar todos los datos de la cuenta

    public void consultarDatos(Cuenta pers) {
        System.out.println("-------------------------------");
        System.out.println("DNI" + pers.getDNI());
        System.out.println("Numero de cuenta" + pers.getNumCuenta());
        System.out.println("saldo actual " + pers.getSaldoActual());
        System.out.println("--------------------------------");

    }

    public void menuPrincipal() {
        int opc = 0;
        System.out.println("----------BIENVENIDO--------------\n"
                + "INGRESE UNA OPCION \n"
                + "1-INGRESAR DINERO\n"
                + "2-RETIRAR DINERO\n"
                + "3-EXTRACCION RAPIDA\n"
                + "4-CONSULTAR SALDO\n"
                + "5-CONSULTAR DATOS\n"
                + "6-SALIR"
        );

    }

    public int Seleccion() {
        int sel;
        do {
            sel = leer.nextInt();
            if (sel < 1 || sel > 6) {
                System.out.println("ingrese una opcion valida");
            }

        } while (sel < 1 || sel > 6);
        return sel;
    }

    public void ejecutarMenu() {
        Cuenta pers1 = crearCuenta();
        menuPrincipal();
        int opc;

        do {
            opc = Seleccion();
            switch (opc) {
                case 1:
                    ingresar(pers1);
                    break;
                case 2:
                    retirar(pers1);
                    break;
                case 3:
                    extraccionRapida(pers1);
                    break;
                case 4:
                    consultarSaldo(pers1);
                    break;
                case 5:
                    consultarDatos(pers1);
                    break;
                case 6:
                    System.out.println("Hasta luego");
                    break;
            }
            if (opc != 6) {
                System.out.println("---------------------");
                menuPrincipal();
                System.out.println("--------------------");

            }

        } while (opc != 6);
    }
}
