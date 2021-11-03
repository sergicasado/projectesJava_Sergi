/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisclasse;

import static exercicisclasse.Exercici8.vectorDigits;
import java.util.Arrays;

/**
 *
 * @author profe
 */
public class Exercici13 {
    
    public static void main(String[] args) {
        
        System.out.println(numVector(vectorDigits(0)));
        System.out.println(numVector(vectorDigits(1235)));
        System.out.println(numVector(vectorDigits(-12350)));
        System.out.println(numVector(vectorDigits(9)));
        System.out.println(numVector(vectorDigits(-8)));
        System.out.println(numVector(null));
        System.out.println(numVector(new int[0]));

//        numVector(vectorDigits(25)) --> 25
        
        
    }
    
    public static int numVector(int[] num){
        //Tractament de casos especials
        if(num==null || num.length==0) return 0;

        //Declaració de variables
        boolean negatiu = num[0]<0 ;   //apuntem si el paràmetre és negatiu
        int suma=0, factor=1;         //variables per calcular el resultat
        int index=num.length-1;      //index per recorrer el vector. Situem l'index a la casella de més a la dreta del vector
        
        //Si el paràmetre és negatiu el passem a positiu
        if(negatiu) num[0]*=-1;
        
        while(index>=0){        //while(num!=0)
            
            suma+=num[index]*factor;
            index--;
            factor*=10;
            
        }
        
        //Si el paràmetre és negatiu passem la primera casella del vector a negatiu
        if(negatiu) suma*=-1;
        
        return suma;
    }
    
}
