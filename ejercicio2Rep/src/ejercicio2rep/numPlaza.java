/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2rep;

/**
 *
 * @author ericc
 */
public class numPlaza {
    private NumeroPlaza [] Nplaza;
    private int dl;
    private int df;

    public numPlaza(int Nplaza, int dl, int df) {
        this.Nplaza = new NumeroPlaza[Nplaza];
        this.dl = dl;
        this.df = df;
    }

    public NumeroPlaza[] getNplaza() {
        return Nplaza;
    }

    public void setNplaza(NumeroPlaza[] Nplaza) {
        this.Nplaza = Nplaza;
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

    
    public boolean addCuenta(NumeroPlaza NPlaza){  // la información de sus pisoS (maximo N cuentas)
        boolean cumple = false;
        if(this.dl < this.df){
            this.Nplaza[dl]=NPlaza;
            cumple = true;
            this.dl++;
        }
        return cumple;
    }
    
    
    @Override
    public String toString() {
        return "numPlaza{" + "Nplaza=" + Nplaza + ", dl=" + dl + ", df=" + df + '}';
    }

   
    


 
}