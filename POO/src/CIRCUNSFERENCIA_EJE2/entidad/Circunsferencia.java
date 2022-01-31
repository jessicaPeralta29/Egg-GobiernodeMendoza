package CIRCUNSFERENCIA_EJE2.entidad;

//Declarar una clase llamada Circunferencia que tenga como atributo privado el radio
//de tipo real
public class Circunsferencia {

    private double radio;

    //a) Método constructor que inicialice el radio pasado como parámetro.
    public Circunsferencia() {
    }

    public Circunsferencia(double radio) {
        this.radio = radio;
    }

    // b) Métodos get y set para el atributo radio de la clase Circunferencia.
    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    //c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
    //del objeto.
    public double crearCircunsferencia(double radio) {
        return radio;
    }
//d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).

    public void crearArea(double radio) {
        double area;
        area = Math.PI * Math.pow(radio, 2);
        System.out.println("area= "+area);
      

    }

//e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
    public void crearPerimetro(double radio) {

        double perimetro;
        perimetro = (2 * Math.PI * radio);
        System.out.println( "perimetro = "+perimetro);
    

    }

   

    @Override
    public String toString() {
        return "Circunsferencia{" + "radio=" + radio + '}';
    }
    
}
