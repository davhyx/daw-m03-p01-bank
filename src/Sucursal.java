
public class Sucursal {

<<<<<<< HEAD
    public Number numSucursal;
=======
    private String numSucursal = "0000";
    private String nombreSucursal;
>>>>>>> origin/master

    public String getNumSucursal() {
        return numSucursal;
    }

    public void setNumSucursal(String numSucursal) {
        this.numSucursal = numSucursal;
    }

<<<<<<< HEAD
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
=======
    public String getNombreSucursal() {
        return nombreSucursal;
    }

    public void setNombreSucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
    }
>>>>>>> origin/master
}
