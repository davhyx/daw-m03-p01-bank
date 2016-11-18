
public class CuentaCorriente extends Cuenta implements Corriente {

    public CuentaCorriente(String numCuenta, String nif, int saldo) {
        super(numCuenta, nif, saldo);
    }

    public CuentaCorriente(int saldo){
       super(saldo);
   }
}
