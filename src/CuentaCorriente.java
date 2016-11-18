
public class CuentaCorriente extends Cuenta implements Corriente {

    public CuentaCorriente(String numCuenta, String nif, int saldo) {
        super(numCuenta, nif, saldo);
    }

    public void setDeposito(int deposito){
        int saldoTemp = getSaldo();
        saldoTemp += deposito;
        setSaldo(saldoTemp);
    }

    public void setExtraccion(int extraccion){
        int saldoTemp = getSaldo();
        saldoTemp -= extraccion;
        setSaldo(saldoTemp);
    }

    @Override
    public String toString(){
        return "El saldo en la cuenta es: " + this.getSaldo();
    }

    public CuentaCorriente(int saldo){
       super(saldo);
   }
}
}
