
package CIRCUNSFERENCIA_EJE2;

import CIRCUNSFERENCIA_EJE2.entidad.Circunsferencia;
import java.util.Scanner;


public class circunferencia_eje2 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        Circunsferencia c1= new Circunsferencia();
        System.out.println("Ingrese el radio");
        
        double auxRad=leer.nextDouble();
        c1.setRadio(auxRad);
        
        
        
        System.out.println(c1.toString());
        c1.crearArea(auxRad);
        c1.crearPerimetro(auxRad);
        
        
        
        
    }
    
}
