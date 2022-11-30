/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.de.logica.n.pkg1;

import java.util.Scanner;

/**Un estudiante desea realizar el cálculo de promedio de sus notas, se
 * debe leer las notas del estudiante y calcular el promedio e imprimirlo.
 *
 * @author Sebastian
 */
public class N24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int cantNotas;
         float nota;
         float prom;
         prom = 0;
      
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese cantidad de notas");
        cantNotas = read.nextInt();
        
        for(int i=0; i<cantNotas; i++){
            System.out.println("Ingrese nota "+ (i + 1));
        nota = read.nextInt();
        
        if(nota>=0 || nota<=5.0){
            prom = prom + nota;
        }
            
        }
        
       
        
        System.out.println("El promedio es "+ (prom / cantNotas) );
       
    }
    
}
