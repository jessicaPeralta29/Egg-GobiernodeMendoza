package cadenaEje8.SERVICIO;

/*
   Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
Método invertirFrase(), deberá invertir la frase ingresada y mostrar la frase invertida
por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".

 */
import cadenaEje8.ENTIDAD.Cadena;
import java.util.Scanner;

public class CadenaServicio {

    private Cadena c;
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public CadenaServicio(Cadena c) {
        this.c = c;
    }

    public void CrearCadena() {
        Cadena palabra = new Cadena();
        System.out.println("ingrese una frase o cadena");
        String AuxFrase = leer.next();
        AuxFrase.toUpperCase();
        c.setFrase(AuxFrase);

        c.setLongitud(c.getFrase().length());

    }

    public int mostrarVocales() {

        int contadorVocales = 0;

        for (int i = 0; i < c.getLongitud(); i++) {

            switch (c.getFrase().toUpperCase().substring(i, i + 1)) {
                case "A":
                    contadorVocales++;
                    break;
                case "E":
                    contadorVocales++;
                    break;
                case "I":
                    contadorVocales++;
                    break;
                case "O":
                    contadorVocales++;
                    break;
                case "U":
                    contadorVocales++;
                    break;

            }

        }
        return contadorVocales;
    }

    public void invertirFrase() {
        String cadenaInvertida = "";
        String cadena = c.getFrase();
        System.out.println(cadena);
        for (int i = c.getLongitud() - 1; i >= 0; i--) {

            cadenaInvertida += String.valueOf(cadena.charAt(i));
        }
        System.out.println("La frase invertida es:");
        System.out.println(cadenaInvertida);

    }

    /* Método vecesRepetido(String letra), deberá recibir por parámetro un carácter
ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la
frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
     */
    public void vecesRepetido(String letra) {
        int repetido = 0;
        
        System.out.println("La letra a buscar  es " + letra);
        letra.toUpperCase();

        for (int i = 0; i < c.getLongitud() - 1; i++) {

            if (letra.equals(c.getFrase().substring(i, i + 1))) {
                repetido++;
            }
        }
        System.out.println("El caracter buscado: " + letra + " se ha encontrado " + repetido + " veces");

    }

    public void compararLongitud(String frase) {

        if (c.getLongitud() > frase.length()) {
            System.out.println("La longitud de la primer frase es de " + c.getLongitud() + " y es mayor a la de la segunda "
                    + "frase que su longitud es de " + frase.length());
        } else if (c.getLongitud() < frase.length()) {
            System.out.println("La longitud de la primer frase es de " + c.getLongitud() + " y es menor a la de la segunda "
                    + "frase que su longitud es de " + frase.length());
        } else {
            System.out.println("La longitud de la primer frase es de " + c.getLongitud() + " y es igual a la de la segunda "
                    + "frase que su longitud es de " + frase.length());
        }

    }

    /*• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
     */
    public String unirFrases(String Frase) {

        return c.getFrase() + " " + Frase;
    }

    /*
     Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y
     */
    public void reemplazarA(String letra) {
        letra.toUpperCase();
        String nuevaFrase = " ";

        for (int i = 0; i < c.getLongitud(); i++) {
            if ("A".equals(c.getFrase().toUpperCase().substring(i, i + 1))) {
                nuevaFrase += letra;
            } else {
                nuevaFrase += String.valueOf(c.getFrase().charAt(i));

            }
        }
        System.out.println("La nueva frase es " + nuevaFrase);
    }

    /*   • Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no
     */
    public void contiene(String letra) {
        letra.toUpperCase();

        boolean correcto = false;
        
              for (int i = 0; i < c.getLongitud() - 1; i++) {

            if (letra.equals(c.getFrase().substring(i, i + 1))) {
               correcto=true;
            }
        
        }
        if (correcto) {
            System.out.println("verdadero");

        } else {
            System.out.println("falso");
        }
    }
}
