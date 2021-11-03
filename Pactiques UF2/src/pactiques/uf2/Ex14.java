/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiques.uf2;

import java.util.Arrays;

/**
 *
 * @author Sergi
 */
public class Ex14 {
    
    public static void main(String[] args) {
        
        int [] vectorsito = {1,8,3,4,6,7,9,12,5};
        
        System.out.println(eliminaNoMultiples(vectorsito,3));
    }
    
    
    public static int eliminaNoMultiples(int num[], int parametre){
     //Tractament de casos especials
        
        if(num==null || num.length==0) return 0;

        //Declaració de variables
        boolean negatiu = num[0]<0 ;   //apuntem si el paràmetre és negatiu
        int suma=0, factor=1;         //variables per calcular el resultat
        int index=num.length-1;      //index per recorrer el vector. Situem l'index a la casella de més a la dreta del vector
        int[] vectorMultiples = new int [index];
        //Si el paràmetre és negatiu el passem a positiu
        if(negatiu) num[0]*=-1;
        
        while(index>=0){        //while(num!=0)
            suma+=num[index]*factor;
            index--;
            factor*=10;
        }
        //Si el paràmetre és negatiu passem la primera casella del vector a negatiu
        if(negatiu) suma*=-1;
        
        
        for (int i = 0; i < num.length; i++) {
            if (num[i]%parametre==0) {
                vectorMultiples[i] = num[i];
            }
            
        }
        
        int numeroTotal=0;
        
        for (int i = 0; i < vectorMultiples.length; i++) {
            numeroTotal+= vectorMultiples[i];
            
        }
        
        
        return numeroTotal;
    }
    
    
    
}
