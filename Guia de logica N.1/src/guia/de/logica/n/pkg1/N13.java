/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.de.logica.n.pkg1;

import java.util.Scanner;

/**
 *Calcular el área de un rectángulo, se debe pedir al usuario los datospara el cálculo.
 * @author Sebastian
 */
public class N13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float largo;
        float ancho;
     
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el largo");
        largo = read.nextFloat();
         System.out.println("Ingrese el ancho");
        ancho = read.nextFloat();
       
        System.out.println("El area es "+ (largo * ancho) );
        
        
        
    }
    
}
