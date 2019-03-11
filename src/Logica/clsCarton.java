/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Manyor
 */
public final class clsCarton {

    private int numCarton;
    private int[][] numeros;
    private boolean estado;
    clsPersona persona;

    public int getNumCarton() {
        return numCarton;
    }

    public void setNumCarton(int numCarton) {
        this.numCarton = numCarton;
    }

    public int[][] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[][] numeros) {
        this.numeros = numeros;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public clsPersona getPersona() {
        return persona;
    }

    public void setPersona(clsPersona persona) {
        this.persona = persona;
    }

    public clsCarton(int numCarton, int[][] numeros, boolean estado, clsPersona persona) {
        this.numCarton = numCarton;
        this.numeros = numeros;
        this.estado = estado;
        this.persona = persona;
    }

    public clsCarton(int numCarton, int[][] numeros, boolean estado) {
        this.numCarton = numCarton;
        this.numeros = numeros;
        this.estado = estado;
    }

    public clsCarton() {

    }

}
