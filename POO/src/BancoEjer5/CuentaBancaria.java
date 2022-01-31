package BancoEjer5;

import BancoEjer5.entidad.Cuenta;
import BancoEjer5.servicio.ServicioCuenta;


public class CuentaBancaria {

    public static void main(String[] args) {
        ServicioCuenta c1 =new ServicioCuenta();
        Cuenta c=new Cuenta();
        c1.ejecutarMenu();
    }
       
}
