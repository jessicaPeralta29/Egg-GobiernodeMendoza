
package NESPRESSO;

import NESPRESSO.entidad.Cafetera;
import NESPRESSO.entidad.servicio.ServicioCafetera;

public class NespressoCafeteria {

    public static void main(String[] args) {
        
        ServicioCafetera caffe= new ServicioCafetera();
        Cafetera cafe=new Cafetera();
        //bienvenida;
          caffe.ejecutar();
        
    }
    
}
