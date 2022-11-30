/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.de.logica.n.pkg1;

import java.util.Scanner;

/**
 *Dado dos fracciones ingresadas por el usuario, determinar si son fraccionesequivalentes. 
 * @author Sebastian
 */
public class N20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num1;
        int den1;
        int num2;
        int den2;;
        
        Scanner read = new Scanner(System.in);
       
        
        System.out.println("inserte primer numerador");
        num1 = read.nextInt();
          System.out.println("inserte primer denominador");
        den1 = read.nextInt();
        
          System.out.println("inserte segundo numerador");
        num2 = read.nextInt();
        
          System.out.println("inserte segundo denenominador");
        den2 = read.nextInt();
        
        if(num1 / den1 == num2 / den2){
                System.out.println("Son equivalentes");
            }else{
                    System.out.println("No son equivalentes");
                    }
        
        
    }
    
}
