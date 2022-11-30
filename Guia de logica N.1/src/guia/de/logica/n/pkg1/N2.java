/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.de.logica.n.pkg1;

import java.util.Scanner;

/**
 *Leer un número e imprimir un mensaje si es positivo o negativo.
 * @author Sebastian
 */
public class N2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float num1;
       
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese numero 1");
        num1 = read.nextFloat();
        
        if(num1<0){
            System.out.println("numero negativo");
        }else{
            if(num1>0){
                System.out.println("numero positivo");
            }else{
                System.out.println("numero neutro");
            }
        }
        
    }
    }
    

