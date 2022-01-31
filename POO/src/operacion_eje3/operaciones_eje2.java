package operacion_eje3;

import java.util.Scanner;
import operacion_eje3.entidades.Operacion;

public class operaciones_eje2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Operacion oper1 = new Operacion();
        int sum, auxnum1, auxnum2, mul;
        double div;

        System.out.println("ingrese dos numeros");
        auxnum1 = leer.nextInt();
        oper1.setNum1(auxnum1);
        auxnum2 = leer.nextInt();
        oper1.setNum2(auxnum2);
        oper1.crearOperacion(auxnum1, auxnum2);

        // oper1.crearOperacion()); 
        sum = oper1.sumar(auxnum1, auxnum2);
        System.out.println("la suma es: " + sum);

        mul = oper1.multiplicar(auxnum1, auxnum2);
        System.out.println("la multiplicacion es " + mul);
        
        div=oper1.dividir(auxnum1,auxnum2);
        System.out.println("la division es: "+ div);

    }

}
