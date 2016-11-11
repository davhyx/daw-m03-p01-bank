
public class Cliente {

    public String nombre;
    public String nif;
    /*private Number pin;*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }
   /*
    public Numberkk getPin() {
        return pin;
    }

    public void setPin(Number pin) {
        this.pin = pin;
    }
    */

    public CrearCuenta(String numeroCuenta){ //Metodo Crear Cuenta le pasas el numero de Cuenta
      this.numeroCuenta = numeroCuenta;
      cuentas.add(numeroCuenta); //Le añades a la ARRAyLIST cuentas la cuenta
    }

    public BajaCuenta(String numeroCuenta){ //Metodo BajaCuenta le pasas la cuenta
      this.numeroCuenta = numeroCuenta;
      cuentas.remove(numeroCuenta);//Eliminar
    }

    public VerCuenta(String nombre){ //Metodo VerCuenta le pasas el nombre del cliente
      this.nombre = nombre;
      return (numeroCuenta && saldo); //Te devuelve el numero de cuenta
    }
/*
    public CambiarPin(Number pin){
      this.pin = pin;
      return pin;

    }
*/

}
