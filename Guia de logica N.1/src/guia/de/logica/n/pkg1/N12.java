/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.de.logica.n.pkg1;

import java.util.Scanner;

/**
 *Calcular el área de un círculo, se debe pedir al usuario los datos para el cálculo.
 * @author Sebastian
 */
public class N12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          float radio;
     
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el radio");
        radio = read.nextFloat();
       
        System.out.println("El area es "+ (3.14159265359 * radio * radio ) );
        
    }
    
}
