/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.de.logica.n.pkg1;

import java.util.Scanner;

/**
 *Dado 4 notas de un estudiante, calcular el promedio del estudiante, imprimir
 * las notas y el promedio.
 * @author sebastian
 */
public class N5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here      float num1;
        float nota1;
        float nota2;
        float nota3;
        float nota4;
        float prom;
        prom=0;
     
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese nota1");
        nota1 = read.nextFloat();
        if(nota1<=5.0 || nota1>0){
        System.out.println("Ingrese nota2");
        nota2 = read.nextFloat();
        if(nota2<=5.0 || nota1>0){
             System.out.println("Ingrese nota3");
        nota3 = read.nextFloat();
        if(nota3<=5.0 || nota1>0){
                    System.out.println("Ingrese nota4");
        nota4 = read.nextFloat();
        if(nota4<=5.0 || nota1>0){
            prom= nota1 + nota2 + nota3 + nota4;
            prom= prom / 4;
            System.out.println("las notas son "+ nota1 +" "+ nota2+" " + nota3+" " + nota4);
            System.out.println("El promedio es "+prom);
        }
   
        }
        }
        }
       

        
        
        }
       
    }
    

