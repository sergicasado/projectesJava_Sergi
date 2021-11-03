/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codifont.nf3;

import java.util.Random;

/**
 *
 * @author profe
 */
public class VectorIII {
    
    
    public static void main(String[] args) {
        Random r= new Random();
        
        //Generem qualsevol enter aleatòriament -> 2³² possibilitats
        System.out.println(r.nextInt());
        
        //generem números aleatoris entre 0 i l'anterior al que passem com a 
        //paràmetre --> en este cas entre 0 i 11
        for (int i = 0; i < 50; i++) 
            System.out.println(r.nextInt(12));
        
        //Anem a generar números aleatoris entre el 25 i el 50
        // el mínim és el 25, i el màxim és el 50
        // r.nextInt( maxim - minim + 1 ) + minim
        for (int i = 0; i < 50; i++) 
            System.out.println(r.nextInt( 50 - 25 + 1) + 25);
        
        
        //Anem a generar caràcters aleatoris entre 'B' i 'j'
        //System.out.println((int)'j'); --> val 106
        //System.out.println((int)'B'); --> val 66
        
        char c=(char)(r.nextInt('j' - 'B' + 1) + 'B');
        System.out.println(c);
        for (int i = 0; i < 50; i++) 
            System.out.format("%c %1$d %n",r.nextInt('j' - 'B' + 1) + 'B');
    }
    
    
}
