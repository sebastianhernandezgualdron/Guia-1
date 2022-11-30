/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.de.logica.n.pkg1;

import javax.swing.JOptionPane;

/** Definir el valor final de cada sentencia, decir si es falsa o verdadera. Se
 * debe realizar todas las operaciones.
 *
 * @author Sebastian Hernandez Gualdron
 */
public class GuiaDeLogicaN1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float a;
        float b;
        float c;
        float d;
        float e;
        float f;
        float g;
        float h;
        float i;
        float j;
        a=25/5;
        b=3;
        c=8;
        d=2;
        e=9;
        f=0;
        g=(e*2);
        h=(2/2)+1;
        i=20 % 2;
        j=2+3-9*7;
        
        if((j<h || g>d)){
            if(d % 3 == 0){
                JOptionPane.showMessageDialog(null, "Verdadero");
            }else{
                JOptionPane.showMessageDialog(null, "Falso");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Falso");
        }
    }
    
}
