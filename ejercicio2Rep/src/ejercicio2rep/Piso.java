
package ejercicio2rep;

public class Piso {
    private piso [] pisos;
    private int dl;
    private int df;


    public Piso(int Npisos) {
       this.pisos = new piso[Npisos];
        this.df=Npisos;
        this.dl=0;
    }

    public piso[] getPisos() {
        return pisos;
    }

    public void setPisos(piso[] pisos) {
        this.pisos = pisos;
    }

    public int getDl() {
        return dl;
    }

    public void setDl(int dl) {
        this.dl = dl;
    }

    public int getDf() {
        return df;
    }

    public void setDf(int df) {
        this.df = df;
    }

  public boolean addCuenta(piso unPiso){  // la información de sus pisoS (maximo N cuentas)
        boolean cumple = false;
        if(this.dl < this.df){
            this.pisos[dl]=unPiso;
            cumple = true;
            this.dl++;
        }
        return cumple;
    }

    @Override
    public String toString() {
        return "Piso{" + "piso=" +  getPisos() + '}';
    }
    
    
}



