
public class Sucursal {

    public Number numSucursal;

    public Number getNumSucursal() {
        return numSucursal;
    }

    public void setNumSucursal(Number numSucursal) {
        this.numSucursal = numSucursal;
    }

    public Sucursal(String numSucursal, String codigoId){
      this.numSucursal = numSucursal;
      this.codigoId = codigoId;
  }

@Override
public boolean equals(Object obj){
  if (this.numSucursal == obj){
      return true;
  }
  if (this == null){
      return false;
  }
  return true;
}
}
