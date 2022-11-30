/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.de.logica.n.pkg1;

import java.util.Scanner;

/**
 *Leer 3número es imprimir solo los númerospares que se encuentran entre el 
 *rango de 100 y 200.
 * @author Sebastian
 */
public class N8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float num1;
        float num2;
        float num3;
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese numero 1");
        num1 = read.nextFloat();
        System.out.println("Ingrese numero 2");
        num2 = read.nextFloat();
        System.out.println("Ingrese numero 3");
        num3 = read.nextFloat();
        
        if(num1>=100 && num1<=200){
        if(num1 % 2 == 0){
            System.out.println(num1);
        }
    }
          if(num2>=100 && num2<=200){
        if(num2 % 2 == 0){
            System.out.println(num2);
        }
    }
            if(num3>=100 && num3<=200){
        if(num3 % 2 == 0){
            System.out.println(num3);
        }
    }
        
    }
    
}
