package cadenaEje8;

import cadenaEje8.ENTIDAD.Cadena;
import cadenaEje8.SERVICIO.CadenaServicio;
import java.util.Scanner;

/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
•
• 
•
• Método compararLongitud(Sqtring frase), deberá comparar la longitud de la frase
que compone la clase con otra nueva frase ingresada por el usuario.
• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y
• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.

mostrar la frase resultante.
• Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no
 */
public class STRING {

    public static void main(String[] args) {
        Cadena frase = new Cadena();
        CadenaServicio c = new CadenaServicio(frase);
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        c.CrearCadena();

        int vocal = c.mostrarVocales();
        System.out.println("La canti vocal " + vocal);
        c.invertirFrase();
        System.out.println("ingrese una letra a buscar");
        c.vecesRepetido(leer.next());
        //System.out.println(auxInvertido+"."); 
        System.out.println("Ingrese una nueva frase y comparamos la longitud");
        c.compararLongitud(leer.next());

        System.out.println("Uniremos frases, inserte una nueva");
        String fraseUnida = c.unirFrases(leer.next());
        System.out.println(fraseUnida);
        
        System.out.println("Ingrese un caracter para reemplazar la A");
        c.reemplazarA(leer.next());

        System.out.println("ingrese una letra a buscar");
         c.contiene(leer.next());
    }

}
