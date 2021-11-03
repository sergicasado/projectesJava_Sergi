/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exempleuf2;
import java.util.Arrays;



/**
 *
 * @Sergi PasParametres
 */
public class PasParametres {

    public static void main(String[] args) {
        
        int i=78;
        int[] v={1,2,3};
        
//        pasValor(i);
//        System.out.println(i);

        pasReferencia(v);
        System.out.println(Arrays.toString(v));
    }
    
    public static void pasValor(int i) {
        
        int j=0;
        i++;
        
    }

    public static void pasReferencia(int []vector) {
        
        int[] copia=new int[vector.length];
        for (int i = 0; i < copia.length; i++) {
            copia[i]=vector[i];
            
        }
        vector=copia;
        vector[0]=25;
        
    }
    
    
}
