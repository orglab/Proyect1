/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author Manyor
 */
public class BingoDatos {

    private int[][][] bingo = new int[10][5][5];

    public BingoDatos() {
        generarBingo();
    }

    public int[][] getBingo(int numBingo) {
        return getCartonBingo(numBingo);
    }

    public void setBingo(int[][][] bingo) {
        this.bingo = generarBingo();
    }

    private int[][] getCartonBingo(int numBingo) {
        int carton[][] = new int[5][5];
        for (int columna = 0; columna < 5; columna++) {
            for (int fila = 0; fila < 5; fila++) {
                carton[fila][columna] = this.bingo[numBingo][fila][columna];
            }
        }
        return carton;
    }

    private int[][][] generarBingo() {
        int numeroRandom = 0;
        for (int numMatriz = 0; numMatriz < 10; numMatriz++) {
            for (int columna = 0; columna < 5; columna++) {
                for (int fila = 0; fila < 5; fila++) {
                    numeroRandom = generarRandom(columna);
                    if (validarRepetidos(numMatriz, fila, columna, numeroRandom)) {
                        this.bingo[numMatriz][columna][fila] = numeroRandom;
                    } else {
                        fila--;
                    }
                }
            }
        }
        return bingo;

    }

    private boolean validarRepetidos(int numMatriz, int fila, int columna, int num) {
        boolean flag = true;
        for (int i = 0; i < fila; i++) {
            if (this.bingo[numMatriz][columna][i] == num) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    private int generarRandom(int col) {

        int num = 0;
        switch (col) {
            case 0:
                num = (int) (Math.random() * 15) + 1;
                break;
            case 1:
                num = (int) (Math.random() * (30 - 16) + 16);
                break;
            case 2:
                num = (int) (Math.random() * (45 - 31) + 31);
                break;
            case 3:
                num = (int) (Math.random() * (60 - 46) + 46);
                break;
            case 4:
                num = (int) (Math.random() * (75 - 61) + 61);
                break;
        }
        return num;
    }

}
