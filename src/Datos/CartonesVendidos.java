/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Logica.clsCarton;

/**
 *
 * @author Manyor
 */
public class CartonesVendidos {

    private int numRegs;
    private clsCarton vect[];

    public CartonesVendidos(int tamVect) {
        this.numRegs = 0;
        this.vect = new clsCarton[tamVect];
    }

    public int getNumRegs() {
        return numRegs;
    }

    private void setNumRegs(int numRegs) {
        this.numRegs = numRegs;
    }

    public clsCarton[] getVect() {
        return vect;
    }

    public boolean insertCarton(clsCarton crtObj) {
        if (this.numRegs < this.vect.length ) {
            this.vect[numRegs] = crtObj;
            this.numRegs++;
            return true;
        }
        return false;
    }

    public clsCarton getRegistro(int pos) {
        return this.vect[pos];
    }

    public boolean editaPelicula(int pos, clsCarton crtObj) {
        if (pos >= 0 && pos < this.numRegs) {
            this.vect[pos] = crtObj;
            return true;
        }
        return false;
    }

    public boolean alreadyExist(int numCarton) {
        System.err.println(this.getNumRegs());
        if (this.numRegs != 0) {
            for (int i = 0; i < this.numRegs; i++) {
                if (this.vect[i].getNumCarton() == numCarton) {
                    return true;
                }
            }
        }
        return false;
    }
}
