
public class Sucursal {

    private String numSucursal = "0000";
    private String nombreSucursal;



    public Sucursal(String numSucursal){
        this.numSucursal = numSucursal;
    }


    public String getNumSucursal() {
        return numSucursal;
    }

    public void setNumSucursal(String numSucursal) {
        this.numSucursal = numSucursal;
    }

    public String getNombreSucursal() {
        return nombreSucursal;
    }

    public void setNombreSucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;

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
