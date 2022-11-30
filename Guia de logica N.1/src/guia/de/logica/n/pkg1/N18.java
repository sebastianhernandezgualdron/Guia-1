/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.de.logica.n.pkg1;

import java.util.Scanner;

/**
 *
 * @author kakar
 */
public class N18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         double salario;
       
        Scanner read = new Scanner (System.in);
        
        System.out.println("Introduzca la su salario");
        salario = read.nextDouble();
        if(salario<700000){
             salario=(salario*(-0.02))-(salario*0.04)+(salario*0.11)+salario;  
        }else{
        if(salario>740999 && salario<1000000){
            salario=(salario*(-0.02))-(salario*0.04)+(salario*0.11)+salario;
          }
        else{
              if(salario>1000000 && salario<1800000){
                  salario=(salario*(-0.04))-(salario*0.06)+(salario*0.09)+salario;
               }    
        else{
        if(salario>1800000 && salario<2500000){
            salario=(salario*(-0.06))+(salario*0.05)-(salario*0.06)+(salario*0.09)+salario;
          }           
        else{
        if(salario>2500000){
            salario=(salario*(-0.08))+(salario*0.06)-(salario*0.10)+(salario*0.09)+salario;
        }
        }
        }
        }  
    } 
        System.out.println("su salario con descuento es:"+salario);
    }
    
}
