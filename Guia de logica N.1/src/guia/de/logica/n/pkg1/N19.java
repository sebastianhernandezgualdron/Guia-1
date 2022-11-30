/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.de.logica.n.pkg1;

import java.util.Scanner;

/**Realizar una calculadora de hipotenusa o catetos
 *
 * @author Sebastian
 */
public class N19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float catAd;
        float catOp;
        float hypo;
        
        hypo = 0;
        Scanner read =  new Scanner(System.in);
        System.out.println("ingrese cateto opuesto");
        catOp = read.nextFloat();
        System.out.println("ingrese cateto adyacente");
        catAd = read.nextFloat();
        
        hypo = (catOp * catOp) + (catAd + catAd);
        System.out.println("La hipotenusa es " + hypo);
    }
    
}
