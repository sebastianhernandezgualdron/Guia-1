/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.de.logica.n.pkg1;

import java.util.Scanner;

/**
 *Dado un número en metros(m) realizar el cálculo de conversión a Km, Hm, Dc, dm, cm y mm.  
 * @author Sebastian
 */
public class N7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float metros;
     
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese metros");
        metros = read.nextFloat();
       
        System.out.println("En km es "+ (metros / 1000) );
        System.out.println("En Hm es "+ (metros / 100));
        System.out.println("En Dcm es "+ (metros / 10));
        System.out.println("En dm es "+ (metros * 10));
        System.out.println("En cm es "+ (metros * 100));
        System.out.println("En mm es "+ (metros * 1000));
    }
    
}
