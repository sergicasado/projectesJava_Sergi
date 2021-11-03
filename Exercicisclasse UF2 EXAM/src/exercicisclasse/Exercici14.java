/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisclasse;


import java.util.Arrays;
import static metodes.Vector.eliminaNoMultiples;
/**
 *
 * @author profe
 */
public class Exercici14 {
    
    public static void main(String[] args) {
        
        //1r cas --> vector en dades
        int[] vector=new int[]{2,3,4,5,6,7,8}; 
        
        eliminaNoMultiples(vector, 2);
        
        System.out.println(Arrays.toString(vector));

        //2n cas -- > vector null
        eliminaNoMultiples(null, 2);
        
        //3r cas --> vector buit
        vector=new int[]{}; 
        
        eliminaNoMultiples(vector, 2);

        System.out.println(Arrays.toString(vector));

        //4rt cas --> vector en dades però sense múltiplos
        vector=new int[]{1,3,7}; 
        
        eliminaNoMultiples(vector, 2);

        System.out.println(Arrays.toString(vector));

        //5nt cas --> segon paràmetre igual a 0
        vector=null; 
        
        eliminaNoMultiples(vector, 0);

        System.out.println(Arrays.toString(vector));

    }
    
}
