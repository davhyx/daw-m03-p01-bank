
public class Cliente {

    public String nombre;
    public String nif;
    public String numeroCuenta;
    /*private Number pin;*/

    public Cliente(String nombre, String nif){
        this.nombre = nombre;
        this.nif = nif;
    }

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


    public void CrearCuenta(String numeroCuenta, String nif){ //Metodo Crear Cuenta le pasas el numero de Cuenta y el titular
      this.numeroCuenta = numeroCuenta;
      this.nif = nif;
      //cuentas.add(numeroCuenta,nif); //Le añades a la ARRAyLIST cuentas la cuenta y el titular
    }

    public void BajaCuenta(String numeroCuenta){ //Metodo BajaCuenta le pasas la cuenta
      this.numeroCuenta = numeroCuenta;
      //cuentas.remove(numeroCuenta);//Eliminar
    }

    public void VerCuenta(String numeroCuenta){ //Metodo VerCuenta le pasas el nombre del cliente
      this.numeroCuenta = numeroCuenta;
      //return (cuentas.numeroCuenta && dinero); //Te devuelve el numero de cuenta y el saldo

    }

/*
    public CambiarPin(Number pin){
      this.pin = pin;
      return pin;

    }
*/

}
