
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

    public CrearCuenta(String numeroCuenta, String nif){ //Metodo Crear Cuenta le pasas el numero de Cuenta y el titular
      this.numeroCuenta = numeroCuenta;
      this.nif = nif;
      cuentas.add(numeroCuenta,nif); //Le añades a la ARRAyLIST cuentas la cuenta y el titular
    }

    public BajaCuenta(String numeroCuenta){ //Metodo BajaCuenta le pasas la cuenta
      this.numeroCuenta = numeroCuenta;
      this.nif = nif;
      cuentas.remove(numeroCuenta,nif);//Eliminar
    }

    public VerCuenta(String nombre){ //Metodo VerCuenta le pasas el nombre del cliente
      this.nombre = nombre;
      return (cuentas.numeroCuenta && dinero); //Te devuelve el numero de cuenta y el saldo
    }
/*
    public CambiarPin(Number pin){
      this.pin = pin;
      return pin;

    }
*/

}
