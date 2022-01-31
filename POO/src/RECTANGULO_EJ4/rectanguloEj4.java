
package RECTANGULO_EJ4;

import RECTANGULO_EJ4.entidad.Rectangulo;
import java.util.Scanner;


public class rectanguloEj4 {

    
    public static void main(String[] args) {

        Scanner leer=new Scanner(System.in);
       
        
        Rectangulo rec1= new Rectangulo();
      
         System.out.println("Ingresen la base ");
         
         double auxBase=leer.nextDouble();
         rec1.setBase(auxBase);
         System.out.println("");
        
        System.out.println("Ingresen la base la altura");
        double auxAltura=leer.nextDouble();
        rec1.setAltura(auxAltura);
        
        rec1.crearRectangulo(auxBase,auxAltura);
        
        
        double auxSuperficie=rec1.calcularSuperficie(auxBase, auxAltura);
        System.out.println("la superficie es: " + auxSuperficie);
        
        double auxPerimetro=rec1.calcularPerimetro(auxBase, auxAltura);
        System.out.println("el perimetro es: "+auxPerimetro);
        
        
        rec1.dibujarRectangulo(auxBase, auxAltura);
        
    }
    
}
