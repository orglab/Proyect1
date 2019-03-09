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
public final class clsCarton extends Thread {

    private boolean continuar = true; //flag para saber si continua el procedimiento
    private int numCarton;
    private int[][] numeros;
    

    public clsCarton(int numCarton) {
        this.numCarton = numCarton;
    }

    public int getNumCarton() {
        return numCarton;
    }

    public void setNumCarton(int numCarton) {
        this.numCarton = numCarton;
    }
   
    
    public void validarCarton() {
    }

    public Object[][] llenarCarton(Object[][][] matriz) {

        return null;
    }

    @Override //se sobrescribe el método run
    public void run() {
        while (continuar) {   //hágase mientras continuar sea verdadero

        }
    }

    public int[][] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[][] numeros) {
        this.numeros = numeros;
    }
    
}
