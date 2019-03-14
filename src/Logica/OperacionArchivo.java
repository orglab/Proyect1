/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author manyor.gomez
 */
public class OperacionArchivo {

    //private static final String sFichero = System.getProperty("user.home") + "\\Documents\\logApp.txt";
    private static final String sFichero = System.getProperty("user.home") + "/Desktop/logApp.txt";
    private static String str;
    private static final Date fecha = new Date();

    //crea el archivo en disco, recibe como parámetro la lista de estudiantes
    public static void crearArchivo(clsCarton cartonObj) {
        FileWriter flwriter = null;
        File f = new File(sFichero);

        //    String nombre, String apellido, int cedula, int telefono
        try {
            if (!f.exists()) {
                //crea el flujo para escribir en el archivoC:\
                flwriter = new FileWriter(sFichero);
                //crea un buffer o flujo intermedio antes de escribir directamente en el archivo
                BufferedWriter bfwriter = new BufferedWriter(flwriter);
                bfwriter.write(cartonObj.getNumCarton() + 1
                        + "," + cartonObj.isEstado()
                        + "," + fecha
                        + "," + cartonObj.getPersona().getNombre()
                        + "," + cartonObj.getPersona().getApellido()
                        + "," + cartonObj.getPersona().getCedula()
                        + "," + cartonObj.getPersona().getTelefono() + "\n");
                //cierra el buffer intermedio
                bfwriter.close();
                System.out.println("Archivo creado satisfactoriamente..");

            } else {
                aniadirArchivo(cartonObj.getNumCarton() + 1
                        + "," + cartonObj.isEstado()
                        + "," + fecha
                        + "," + cartonObj.getPersona().getNombre()
                        + "," + cartonObj.getPersona().getApellido()
                        + "," + cartonObj.getPersona().getCedula()
                        + "," + cartonObj.getPersona().getTelefono() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (flwriter != null) {
                try {//cierra el flujo principal
                    flwriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    //crea el archivo en disco, retorna la lista de estudiantes

    //crea el archivo en disco, retorna la lista de estudiantes
    public static ArrayList leerArchivo() {
        // crea el flujo para leer desde el archivo
        File file = new File(sFichero);
        ArrayList listaEstudiantes = new ArrayList<>();
        Scanner scanner;
        try {
            //se pasa el flujo al objeto scanner
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                // el objeto scanner lee linea a linea desde el archivo
                String linea = scanner.nextLine();
                Scanner delimitar = new Scanner(linea);
                //se usa una expresión regular
                //que valida que antes o despues de una coma (,) exista cualquier cosa
                //parte la cadena recibida cada vez que encuentre una coma				
                delimitar.useDelimiter("\\s*,\\s*");

                Object[] gap = new Object[7];
                for (int i = 0; i < gap.length; i++) {
                    gap[i] = delimitar.next();

                }
                clsPersona per = new clsPersona(gap[3].toString(), gap[4].toString(), Integer.valueOf(gap[5].toString()), Integer.valueOf(gap[6].toString()));
                clsCarton carton = new clsCarton(Integer.valueOf(gap[0].toString()), true, fecha, per);
                listaEstudiantes.add(carton);
            }
            //se cierra el ojeto scanner
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return listaEstudiantes;
    }
    //añadir más estudiantes al archivo

    public static void aniadirArchivo(String str) {
        FileWriter flwriter = null;
        try {//además de la ruta del archivo recibe un parámetro de tipo boolean, que le indican que se va añadir más registros 
            flwriter = new FileWriter(sFichero, true);
            BufferedWriter bfwriter = new BufferedWriter(flwriter);
            bfwriter.write(str);
            bfwriter.close();
            System.out.println("Archivo modificado satisfactoriamente..");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (flwriter != null) {
                try {
                    flwriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
