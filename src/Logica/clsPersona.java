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
public class clsPersona {
    private String nombre;
    private String apellido;
    private int cedula;
    private int telefono;
    private int numCarton;
    
       public clsPersona() {
        this.numCarton = 0;
        this.nombre = null;
        this.apellido = null;
        this.cedula = 0;
        this.telefono = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    public int getNumCarton() {
        return numCarton;
    }

    public void setNumCarton(int numCarton) {
        this.numCarton = numCarton;
    }
}
