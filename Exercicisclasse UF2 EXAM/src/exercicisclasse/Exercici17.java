/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisclasse;

import java.util.Arrays;

/**
 *
 * @author profe
 */
public class Exercici17 {
    
    public static void main(String[] args) {
        
        System.out.println(Arrays.toString(tractaParametres(Integer.MIN_VALUE, Integer.MIN_VALUE+1)));
    }
    
    public static int[] tractaParametres(int... valors){
        //Tractament de casos especials
        if(valors==null || valors.length==0 ) return null;
    
        //Declaració de vars
        int suma, maxim, minim, quantitat;
        
//        int[] resultat=new int[4];  //instancio un vector de 4 caselles enteres
//                                    //inicialitzades a 0 [ 0, 0, 0, 0 ]
//                                    
//        //Omplic la segona casella en la quantitat de valors
//        resultat[1]=valors.length;
//        
//        //Inicialitzem la suma, maxim i minim en el contingut de la primera 
//        //casella del vector
//        resultat[0]=resultat[2]=resultat[3]=valors[0];
        
        //int[] resultat=new int[]{valors[0], valors.length, valors[0], valors[0]};
        suma=0;
        maxim=minim=valors[0];
        for (int i = 0; i < valors.length; i++) {
            //Sumem totes les caselles del vector acumulant-les a la primera 
            suma=suma+valors[i];
            if(valors[i] > maxim ) maxim=valors[i];
            if(valors[i] < minim ) minim=valors[i];
           
        }
        quantitat=valors.length;
        
        return new int[]{suma, quantitat, maxim, minim};
    }
    
    
    
}
