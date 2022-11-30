/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.de.logica.n.pkg1;

import java.util.Scanner;

/**
 *Leer un número y calcular: el cuadrado, el cubo e imprimir los resultados.
 * @author Sebastian
 */
public class N6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                float num1;
     
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese numero 1");
        num1 = read.nextFloat();
       
        System.out.println("El cuadrado es "+ (num1 * num1) );
        System.out.println("El cubo es "+ (num1 * num1 * num1));
    }
    
}
