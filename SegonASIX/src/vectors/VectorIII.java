/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectors;
import java.util.Random;

/**
 *
 * @author alumne
 */
public class VectorIII {
    
    public static void main(String[] args) {
        
        //Declarar el random
        Random r= new Random();
        
        
        
        
        //Generem qualsevol enter aleatoriament -> 2³² possibilitats
        System.out.println(r.nextInt());
        
        //Genera un numero entre 0 (incluit) fins al numero que posem -1 (anterior)
        
        for (int i = 0; i < 2; i++) {
            
        //generem números aleatoris entre 0 i l'anterior al que posem com a
        //paràmetre --> en este cas entre 0 i 11
        System.out.println(r.nextInt(12));
        }
        
        
        //Anem a generar números aleatoris entre el 25 i el 50
        // el minim es el 25 i el màxim es el 50
        
        //r.nextInt( maxim - minim + 1 ) +minim
        
        System.out.println(r.nextInt( 50 - 25 + 1 ) + 25);
        
        
        //Anem a generar caràcters aleatoris entre 
        
       
        
        //Anem a generar caràcters aleatoris entre 'B' i 'j'
        // System.out.println((int)'j'); --> val 106
        //System.out.println((int)'B'); --> val 66
        
        //Aqui fem un casting per treureli una lletra en lloc de un enter
        char c=(char)(r.nextInt('j' - 'B' +1) + 'B');
        System.out.println(c);
        
        System.out.println("-----------------------------");
        
        for (int i = 0; i < 5; i++) {
             System.out.format("%c %1$d %n", r.nextInt('j' - 'B' +1) + 'B');
            
        }
       
        
        
       
        
    }
    
    
    
}
