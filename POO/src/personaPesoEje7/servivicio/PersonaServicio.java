/*
 Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
 */
 /*Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, la
función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25
(incluidos), significa que el peso está por debajo de su peso ideal y la función
devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25
significa que la persona tiene sobrepeso, y la función devuelve un 1. Se recomienda
hacer uso de constantes para devolver estos valores
 */
package personaPesoEje7.servivicio;

import java.util.Scanner;
import personaPesoEje7.entidad.Persona;

public class PersonaServicio {

    private final int IMC_BAJO = -1;
    private final int IMC_IDEAL = 0;
    private final int IMC_SOBRE = 1;
    public Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        Persona Pers = new Persona();
        System.out.println("-----------BIENVENIDO-----------");
        System.out.println("Ingrese los datos solicitados a continuacion");

        System.out.println("ingrese su nombre");
        String auxNombre = leer.next();
        Pers.setNombre(auxNombre);

        System.out.println("Ingrese su edad");
        int auxEdad = leer.nextInt();
        Pers.setEdad(auxEdad);
        char sexo;
        do {
            System.out.println("Ingrese su sexo.Mujer,Hombre u otro");
            sexo = Character.toUpperCase(leer.next().charAt(0));

        } while (sexo != 'M' && sexo != 'H' && sexo != 'o');

        System.out.println("Ingrese su peso");
        double auxPeso = leer.nextDouble();
        Pers.setPeso(auxPeso);

        System.out.println("Ingrese su altura");
        double auxAltura = leer.nextDouble();
        Pers.setAltura(auxAltura);

        return Pers;
    }

    public int calcularIMC(Persona Pers) {

        double peso = Pers.getPeso();
        double altura = Pers.getAltura();
        double indice = peso / (Math.pow(altura, 2));
        // indice = Pers.getPeso() / (Math.pow(Pers.getAltura(), 2));

        if (indice < 20) {
            return IMC_BAJO;
        } else if (indice > 25) {
            return IMC_SOBRE;

        } else {
            return IMC_IDEAL;

        }
    }

    //Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano 
    public boolean esMayorDeEdad(Persona Pers) {
        boolean mayor;
        return mayor = Pers.getEdad() >= 18;
    }

    public Persona[] crearPersonas(int canti) {
        Persona[] personas = new Persona[canti];

        for (int i = 0; i < personas.length; i++) {
            personas[i] = crearPersona();
        }
        return personas;
    }

    public void porcentajesPeso(Persona[] personas) {
        int contadorSobre = 0;
        int contadorIdeal = 0;
        int contadorBajo = 0;
        int contadorPers = personas.length;

        for (Persona persona : personas) {
            switch (calcularIMC(persona)) {
                case -1:
                    System.out.println(persona.getNombre() + " esta por debajo del peso ideal");
                    contadorBajo++;
                    break;
                case 0:
                    System.out.println(persona.getNombre() + " esta en el peso ideal");
                    contadorIdeal++;
                    break;
                case 1:
                    System.out.println(persona.getNombre() + " esta por sobre el peso ideal");
                    contadorSobre++;
                    break;
            }

        }

        //cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, porencima
      
        System.out.println("Porcentaje de las personas con el peso ideal es: " + ((contadorIdeal*100)/contadorPers));
        System.out.println("Porcentaje de las personas por debajo del peso ideal: " + ((contadorBajo*100)/contadorPers));
        System.out.println("Porcentaje de las personas con sobrepeso es de : " + ((contadorSobre*100)/contadorPers));
       

    }
    
  public void porcentajesEdad(Persona[] personas)   {
     int contMayor=0;
     int contadorPersonas=personas.length;
     
     
      for (Persona persona : personas) {
          if (esMayorDeEdad(persona)) {
              contMayor++;
              System.out.println(persona.getNombre()+" es mayor de edad");
          }
          
      }
      
      System.out.println("Hay " +((contMayor*100)/contadorPersonas) + " mayores de edad");
      System.out.println("Hay " +(((contadorPersonas-contMayor)*100)/contadorPersonas) + "menores de edad");
      
  }
}
