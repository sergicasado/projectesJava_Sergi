/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisclasse;

import java.util.Arrays;
import static metodes.Vector.ompleVectorFloats;

/**
 *
 * @author profe
 */
public class Exercici18 {
    
    public static void main(String[] args) {
        
        System.out.println(Arrays.toString(ompleVectorFloats()));
        System.out.println(Arrays.toString(ompleVectorFloats(3.2F)));
        System.out.println(Arrays.toString(ompleVectorFloats(3.2F, 9F)));
        System.out.println(Arrays.toString(ompleVectorFloats(null)));
        System.out.println(Arrays.toString(ompleVectorFloats(new float[]{3.2F, 7.8F})));
        System.out.println(Arrays.toString(ompleVectorFloats(new float[0]))); //--> vector de 0 caselles 
        System.out.println(Arrays.toString(ompleVectorFloats(new float[]{}))); //--> vector de 0 caselles

    }
    
}
