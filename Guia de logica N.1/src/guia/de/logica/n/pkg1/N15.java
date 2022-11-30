/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.de.logica.n.pkg1;

import java.util.Scanner;

/**
 *15.Realizar un programaque calcule el valor a pagar por algunos galones 
 * de gasolina si sabemos que cada litro de gasolina vale 9.500.Imprimir la 
 * cantidad de galones, precio por galón, cantidad de litros y precio a pagar.
 * @author Sebastian
 */
public class N15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         double galones;
        double litros;
        
       Scanner read = new Scanner (System.in);
        litros = 0;
        System.out.println("Introduzca la cantidad de galones:");
        galones = read.nextDouble();
        System.out.println("La cantidad de galones ingresada es:"+ galones);
        System.out.println("El precio por cada galon es de 36,100");
        litros=galones*3.8;
        System.out.println("la cantidad de litros es :" + litros);
        System.out.println("El precio total en galones es:" + galones*36100);
        System.out.println("El precio total en litros es: " + litros*9500);
    }
    
}
