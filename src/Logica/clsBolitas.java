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
public class clsBolitas extends Thread {

    private int cantBolitas;
    private int numerosBingo[] = new int[75];
    public Vista.frmBingo gbingo; //declara una variable de tipo FormaHilos
    private int temp[] = new int[75];

    public clsBolitas(Vista.frmBingo aThis) {
        this.cantBolitas = 0;
        this.numerosBingo = generarArrayBola();
        gbingo = aThis;
    }

    public int getCantBolitas() {
        return cantBolitas;
    }

    public void setCantBolitas(int cantBolitas) {
        this.cantBolitas = cantBolitas;
    }

    public int[] getNumerosBingo() {
        return numerosBingo;
    }

    public void setNumerosBingo(int[] numerosBingo) {
        this.numerosBingo = generarArrayBola();
    }
    
    //Genera las bolitas que salen conforme gira la tombola
    private int[] generarArrayBola() {
        int num = 0;

        for (int i = 0; i < 75; i++) {
            num = (int) (Math.random() * 75) + 1;
            if (validarNum(i, num, temp)) {
                temp[i] = num;
            } else {
                i--;
            }
        }
        return temp;

    }

    // Método que evita que una bolita se repita
    private boolean validarNum(int pos, int num, int[] par) {
        for (int j = 0; j < pos; j++) {
            if (num == temp[j]) {
                return false;
            }
        }
        return true;
    }

    @Override
    // se comienza el thread para las bolitas
    public void run() {
        try {

            for (int i = 0; i < 75; i++) {
                if (!gbingo.sacarBola(numerosBingo[i])) {
                    Thread.sleep(2000);
                    cantBolitas++;

                } else {
                    break;
                }

            }

        } catch (InterruptedException ex) {
        }
    }
}
