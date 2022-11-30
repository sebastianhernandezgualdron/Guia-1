/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.de.logica.n.pkg1;

import java.util.Scanner;

/**
 *Leer N cantidad de números e imprimir la cantidad de pares y cantidad de impares.
 * @author Sebastian
 */
public class N23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int cantNum;
         float num;
         int cantPar;
         int cantImpar;
         cantPar=0;
         cantImpar=0;
     
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese cantidad de numeros");
        cantNum = read.nextInt();
        
        for(int i=0; i<cantNum; i++){
            System.out.println("Ingrese num "+ (i + 1));
        num = read.nextInt();
        
        if(num % 2 == 0){
            cantPar++;
        }else{
            cantImpar++;
        }
            
        }
        
       
        
        System.out.println("Los pares son  "+cantPar );
        System.out.println("La impares son  "+cantImpar );
    }
    
}
