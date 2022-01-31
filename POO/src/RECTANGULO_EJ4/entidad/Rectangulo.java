
package RECTANGULO_EJ4.entidad;
//Crear una clase Rectángulo que modele rectángulos por medio de un atributo
//privado base y un atributo privado altura.
public class Rectangulo {
    
    
    private double base;
    private double altura;
    
  /*La clase incluirá un método para crear el
rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
método para calcular la superficie del rectángulo y un método para calcular el
perímetro del rectángulo. Por último, tendremos un método que dibujará el
rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.  
 */
    
    
//constructores
    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
    
    public double crearRectangulo(double base,double altura){
      this.base = base;
      this.altura = altura;
   
     return(this.base + this.altura);   
    }
    //También incluirá un método para calcular la superficie del rectángulo Superficie = base * altura
    public double calcularSuperficie(double base,double altura){
       double superficie ;
       
        superficie = base * altura;
        
        return superficie;
    }
    
  //un método para calcular el perímetro del rectángulo
    
    
    public double calcularPerimetro(double base,double altura){
        double perimetro = (base + altura) * 2;
       return perimetro;
    }
    //ndremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura
    
    public void dibujarRectangulo(double base,double altura){
        
        
     // linea superior
        for (int s = 0; s < base; s++) {
            System.out.print("* ");

        }

        System.out.println("");
        //centro

        for (int a = 0; a < base - 2; a++) {
            System.out.print("* ");
            for (int m = 0; m < altura - 2; m++) {
                System.out.print(" ");
            }
            System.out.println("* ");
        }

        //linea inferior
        for (int i = 0; i < base; i++) {
            System.out.print("* ");
        
        }
        
        System.out.println("");
        
    }
    
    
    
}
