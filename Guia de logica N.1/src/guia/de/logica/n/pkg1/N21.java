/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.de.logica.n.pkg1;

import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class N21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int cantNum;
         float num;
         float suma;
         suma=0;
     
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese cantidad de numeros");
        cantNum = read.nextInt();
        
        for(int i=0; i<cantNum; i++){
            System.out.println("Ingrese num "+ (i + 1));
        num = read.nextInt();
        suma= suma + num;
            
        }
        
       
        
        System.out.println("La suma es "+suma );
    }
    
}
