/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisclasse;

import java.util.Arrays;
import static metodes.Vector.operaVector;

/**
 *
 * @author profe
 */
public class Practica1 {
    
    
    public static void main(String[] args) {
        
        int[] v=new int[]{1,2,3,4};
        System.out.println("Prova en vector diferent de null i booleà true:");
        System.out.println(Arrays.toString(v));
        System.out.println(Arrays.toString(operaVector (v, 2, true)));
        
        v=new int[]{1,2,3,4};
        System.out.println("Prova en vector diferent de null i booleà false:");
        System.out.println(Arrays.toString(v));
        System.out.println(Arrays.toString(operaVector (v, 2, false)));
        System.out.println(Arrays.toString(v));
        
        v=null;
        System.out.println("Prova en vector null i booleà true:");
        System.out.println(Arrays.toString(v));
        System.out.println(Arrays.toString(operaVector (v, 2, true)));
        System.out.println(Arrays.toString(v));
        
        v=null;
        System.out.println("Prova en vector null i booleà false:");
        System.out.println(Arrays.toString(v));
        System.out.println(Arrays.toString(operaVector (v, 2, false)));
        System.out.println(Arrays.toString(v));
        
    }
    
}
