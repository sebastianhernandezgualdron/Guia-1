/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.de.logica.n.pkg1;

import java.util.Scanner;

/**Determinar la calificación de un estudiante según la siguiente escala de 
 * ponderación: •0 y 2.9 la ponderación es Insuficiente.•3.0 y 3.5 ponderación
 * es Regular.•3.6 y 4.0 ponderación es Bien.•4.1 y 4.5 Muy Bien.•4.6 y 5.0 es Excelente.
 *
 * @author Sebastian
 */
public class N17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         float nota;
     
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese nota");
        nota = read.nextFloat();
       
        if(nota>=0 && nota<=2.9){
            System.out.println("Insuficiente");
            
        }else{
            if(nota>=3.0 && nota<=3.5){
            System.out.println("regular");
        }else{
                if(nota>=3.6 && nota<=4.0){
            System.out.println("Bien");

                }else{
                     if(nota>=4.1 && nota<=4.5){
            System.out.println(" Muy Bien");
                }else{
                         if(nota>=4.6 && nota<=5.0){
            System.out.println("Excelente");
                     }
                     }
                }
            }
        }
    }
}

                    
                
    
    

