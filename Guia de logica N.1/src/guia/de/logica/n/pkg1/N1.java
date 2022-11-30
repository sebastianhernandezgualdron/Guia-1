/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.de.logica.n.pkg1;

import java.util.Scanner;

/**
 *Realizar un programa que pida al usuario 2 números y se realicen las 
 * 4operaciones básicas (Suma, resta, multiplicación, división). Imprimir los 
 * resultados.
 * @author Sebastian
 */
public class N1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float num1;
        float num2;
        float suma;
        float resta;
        float multi;
        float divi;
        suma=0;
        resta=0;
        multi=0;
        divi=0;
        
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese numero 1");
        num1 = read.nextFloat();
        
        System.out.println("Ingrese numero 2");
        num2 = read.nextFloat();
        
        suma = num1 + num2;
        resta = num1 - num2;
        multi = num1 * num2;
        divi = num1 / num2;
        System.out.println("suma"+suma +" resta"+resta +" multi"+multi+" divi"+ divi );
    }
    
}
