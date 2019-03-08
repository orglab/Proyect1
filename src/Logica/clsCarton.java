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
    private clsPersona persona;

    public clsCarton(int numCarton) {
        this.numCarton = numCarton;
    }

    public int getNumCarton() {
        return numCarton;
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

    
    
    public boolean isDisponible() {
        return persona == null;
    }
    
    public String getEstado(){
        if(this.isDisponible()){
           return "DISPONIBLE"; 
        }
        
        return "VENDIDO";
    }
    
    public clsPersona getPersona() {
        return persona;
    }

    public void setPersona(clsPersona persona) {
        this.persona = persona;
    }
}
