/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.de.logica.n.pkg1;

import java.util.Scanner;

/**
 *Leer 2números, determinar el mayor de los 2e imprimirlo.
 * @author sebastian
 */
public class N4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float num1;
        float num2;
     
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese numero 1");
        num1 = read.nextFloat();
        
        System.out.println("Ingrese numero 2");
        num2 = read.nextFloat();
        if(num1<num2){
            System.out.println(num2+" es mayor");
        }else{
            System.out.println(num1+" es mayor");
        }
       
      
    }
    
}
