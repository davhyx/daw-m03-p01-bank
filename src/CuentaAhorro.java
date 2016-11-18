
public class CuentaAhorro extends Cuenta {


    public CuentaAhorro(String numCuenta, String nif, int saldo) {

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
        saldoTemp -= extraccion*0.2;
        setSaldo(saldoTemp);
    }

    @Override
    public String toString(){
         return "La extracción ha tenido una penalización del 2%. El saldo en la cuenta es: " + this.getSaldo();
    }

}
