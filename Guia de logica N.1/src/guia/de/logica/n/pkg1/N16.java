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
public class N16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double horas;
        double preciohora;
        double pagosemana;
        double pagomes;
        pagomes = 0 ;
        pagosemana = 0;
        Scanner read = new Scanner (System.in);
        
        System.out.println("Introduzca la cantidad de horas trabajadas durante la semana");
        horas = read.nextDouble();
        System.out.println("Introduzca el precio por hora trabajada:");
        preciohora = read.nextDouble();
        if(horas>37 && horas<57){
            pagosemana=horas*preciohora;
            pagomes=pagosemana*4;
            System.out.println("La cantidad de horas trabajadas durante la semana son:"+ horas);
            System.out.println("La cantidad de horas trabajadas durante el mes son:"+ horas*4);
            System.out.println("el pago semanal es:"+ pagosemana);
            System.out.println("el pago mensual es:"+ pagomes);
            }else{
                    System.out.println("error");
        }
    }
    
}
