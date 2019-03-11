/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Logica.clsPersona;

/**
 *
 * @author Jon
 */
public class DatosPersona {

    private int numRegs;
    private clsPersona vect[];

    public DatosPersona(int tamVect) {
        this.numRegs = 0;
        this.vect = new clsPersona[tamVect];
    }

    public int getNumRegs() {
        return numRegs;
    }

    private void setNumRegs(int numRegs) {
        this.numRegs = numRegs;
    }

    public clsPersona[] getVect() {
        return vect;
    }

    public boolean insertPersona(clsPersona PersonaObj) {
        if (this.numRegs < this.vect.length - 1) {
            this.vect[numRegs] = PersonaObj;
            this.numRegs++;
            return true;
        }
        return false;
    }

    public boolean eliminarPersona(int pos) {
        if (this.numRegs > 1) {
            for (int i = 0; i < this.numRegs; i++) {
                if (i == pos) {
                    for (int j = i; j < this.numRegs - 1; j++) {
                        vect[j] = vect[j + 1];
                    }

                }
            }
            this.numRegs--;
            return true;

        }
        return false;

    }

    public boolean editaPersona(int pos, clsPersona PersonaObj) {
        if (pos >= 0 && pos < this.numRegs) {
            this.vect[pos] = PersonaObj;
            return true;
        }
        return false;
    }

    public clsPersona getRegistro(int id) {
        if (this.numRegs != 0) {
            for (int i = 0; i < this.numRegs; i++) {
                if (this.vect[i].getCedula() == id) {
                    return this.vect[i];
                }
            }
        }
        return null;

    }

    public boolean alreadyExist(int id) {
        if (this.numRegs != 0) {
            for (int i = 0; i < this.numRegs; i++) {
                if (this.vect[i].getCedula() == id) {
                    return true;
                }
            }
        }
        return false;
    }

}
