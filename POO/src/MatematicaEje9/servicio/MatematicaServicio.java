package MatematicaEje9.servicio;

import MatematicaEje9.entidad.Matematica;

public class MatematicaServicio {

    public Matematica numeros() {
        Matematica mat = new Matematica();
       mat.setNum1(Math.random() * 10);
        mat.setNum2(Math.random() * 10);
        System.out.println("El primer numero es: " + mat.getNum1());
    
        System.out.println("El segundo numero es: " +mat.getNum2());
        System.out.println("-----------------------------");
        return mat;
    }

    /*
     Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
valor
     */
    public void devolverMayor(Matematica mat) {
        System.out.println("num1"+ mat.getNum1());
        System.out.println("n2 "+mat.getNum2());
        double mayor=(double)Math.max(mat.getNum2()*10,mat.getNum1()*10);
        System.out.println("el mayor es\n"
                + mayor);
    

    }

    
    /*
     Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
    */
    public void calcularPotencia(Matematica mat){
        double potencia;
        double mayor=Math.max(mat.getNum2(),mat.getNum1());
        mayor=Math.round(mayor);
        double menor= Math.min(mat.getNum1(),mat.getNum2());
        mayor=Math.round(menor);
        potencia=Math.pow(mayor, menor);
        System.out.println("La potencia es :"+potencia);
        
    }
   /*• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número
 */
    public void calcularRaiz(Matematica mat){
      double raiz;
      double menor=Math.min(mat.getNum1(), mat.getNum2());
      menor=Math.abs(menor);
      raiz=Math.sqrt(menor);
        System.out.println("La raiz del numero menor( "+ menor+" )su raiz es : "+raiz);
    }        
}
