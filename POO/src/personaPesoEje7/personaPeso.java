
package personaPesoEje7;

import personaPesoEje7.entidad.Persona;
import personaPesoEje7.servivicio.PersonaServicio;


public class personaPeso {

    
    public static void main(String[] args) {
      Persona pers1=new Persona();
      PersonaServicio servicio= new PersonaServicio();
      
      
      
      
      
      Persona[] listaPersonas = servicio.crearPersonas(4);
      servicio.porcentajesEdad(listaPersonas);
      servicio.porcentajesPeso(listaPersonas);
    }
    
    
}
