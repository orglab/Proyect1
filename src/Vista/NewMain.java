/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Logica.OperacionArchivo;
import jdk.internal.dynalink.CallSiteDescriptor;

/**
 *
 * @author manyor.gomez
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        OperacionArchivo op = new OperacionArchivo();
        
        op.leerArchivo();
    }
    
}
