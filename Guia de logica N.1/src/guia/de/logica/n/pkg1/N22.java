/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.de.logica.n.pkg1;

import java.util.Scanner;

/**
 *Leer N cantidad de números e imprimir la cantidad de positivo y cantidad de 
 * negativos. 
 * @author Sebastian
 */
public class N22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int cantNum;
         float num;
         int cantPosi;
         int cantNega;
         cantPosi=0;
         cantNega=0;
     
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese cantidad de numeros");
        cantNum = read.nextInt();
        
        for(int i=0; i<cantNum; i++){
            System.out.println("Ingrese num "+ (i + 1));
        num = read.nextInt();
        
        if(num>0){
            cantPosi++;
        }else{
            cantNega++;
        }
            
        }
        
       
        
        System.out.println("Los negativos son  "+cantNega );
        System.out.println("La positivios son  "+cantPosi );
    }
    
}
