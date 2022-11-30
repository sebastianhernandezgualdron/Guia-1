/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.de.logica.n.pkg1;

import java.util.Scanner;

/**
 *Leer un número determinar si es par o impar e imprimir el mensaje.
 * @author sebastian
 */
public class N3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here float num1;
        float num1;
     
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese numero 1");
        num1 = read.nextFloat();
        
        if(num1%2==0){
            System.out.println("Es par");
        }else{
            System.out.println("Es impar");
        }
       
        System.out.println( );
    }
    
    }
    

