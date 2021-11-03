/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisclasse;

import static metodes.Numero.potenciaRec;

/**
 *
 * @author profe
 */
public class Exercici31 {
    
    public static void main(String[] args) {
        
        System.out.println(potenciaRec(2.0,4));
        System.out.println(potenciaRec(4.506,8));
        System.out.println(potenciaRec(2.0,-4));
        System.out.println(potenciaRec(4.506,-8));
        System.out.println(potenciaRec(2.0,0));
        System.out.println(potenciaRec(0,0));

        System.out.println(potenciaRec(Double.MAX_VALUE,Double.MAX_EXPONENT));
        

    }
    
}
