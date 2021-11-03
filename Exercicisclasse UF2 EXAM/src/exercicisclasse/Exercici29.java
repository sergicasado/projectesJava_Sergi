/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisclasse;

import static metodes.Numero.mcdIteratiu;
import static metodes.Numero.mcdRecursiu;

/**
 *
 * @author profe
 */
public class Exercici29 {
    
    public static void main(String[] args) {
        
        System.out.println(mcdRecursiu(3,6));
        System.out.println(mcdRecursiu(-3,-6));
        System.out.println(mcdRecursiu(0,-6));
        System.out.println(mcdRecursiu(0,0));
        System.out.println(mcdRecursiu(5,0));
        
        System.out.println(mcdIteratiu(3,6));
        System.out.println(mcdIteratiu(-3,-6));
        System.out.println(mcdIteratiu(0,-6));
        System.out.println(mcdIteratiu(0,0));
        System.out.println(mcdIteratiu(5,0));

        
    }
    
}
