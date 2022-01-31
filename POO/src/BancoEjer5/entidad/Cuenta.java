/*    5. Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual
 */
package BancoEjer5.entidad;

public class Cuenta {

    private int numCuenta;
    private long DNI;
    private double saldoActual;
   
  
    //• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.

    public Cuenta() {
    }

    public Cuenta(int numCuenta, long DNI, double saldoActual, String nombre, int contraseña) {
        this.numCuenta = numCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
    }
        //Agregar los métodos getters y setters correspondientes
    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }


    public void setSaldoActual(double saldoActual) {   
        this.saldoActual = saldoActual;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public double getSaldoActual() {
        return saldoActual;
    }



   
    

}
