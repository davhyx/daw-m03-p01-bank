
public class Sucursal {


    public Number numSucursal;

    private String numSucursal = "0000";



    public String getNumSucursal() {
        return numSucursal;
    }

    public void setNumSucursal(String numSucursal) {
        this.numSucursal = numSucursal;
    }


    public Sucursal(String numSucursal){
      this.numSucursal = numSucursal;

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
