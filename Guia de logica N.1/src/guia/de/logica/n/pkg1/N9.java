/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.de.logica.n.pkg1;

import java.util.Scanner;

/**
 *Dado un monto en pesos calcular el 15% menos y el 15% más.
 * Imprimir el monto inicial y con el descuento y con el aumento.
 * @author Sebastian
 */
public class N9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float monto;
        double descuento;
        descuento=0;
     
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese monto inicial");
        monto = read.nextFloat();
        descuento = monto * 0.15;
        
       
        System.out.println("El monto inicial "+monto );
        System.out.println("Con descuento "+(monto + descuento));
        System.out.println("Con aumento "+(monto - descuento));
        
        
    }
    
}
