
public abstract class Cuenta {

    private String numCuenta;
    private int saldo;
    private String nif;

    public Cuenta(String numCuenta, String nif, int saldo){
        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.nif = nif;
    }
       
    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
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
    public boolean equals(Object obj){
        if (this.numCuenta == obj){
            return true;
        }
        if (this == null){
            return false;
        }
        return true;
    }

}
