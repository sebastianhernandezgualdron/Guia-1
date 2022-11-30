/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.de.logica.n.pkg1;

import java.util.Scanner;

/**
 *Realizar un programa que convierta una temperatura dada en grados centígrados
 * en grados Fahrenheit.  Imprimir la temperatura en grados centígrados y en grados Fahrenheit.
 * @author Sebastian
 */
public class N14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float gradosCen;
     
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese grados centigrados");
        gradosCen = read.nextFloat();
       
        System.out.println("La temperatura en grados centigrados es" + gradosCen);
        System.out.println("El temperatura en grados Fahrenheit es"+ ((gradosCen * 1.8)+ 32) );
        
    }
    
}
