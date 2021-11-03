/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisclasse.nf3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author profe
 */
public class Exercici6 {
    
    public static void main(String[] args) {
        //Declaració de constants
        final int QUANTITAT=4;
        
        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        int[] valors;
        
        if(QUANTITAT<=0) System.out.println("Adéu!!");
        else{
            //Aquí sabem que QUANTITAT és positiva
            valors=new int[QUANTITAT];
            
            //Demanem valors a l'usuari
            System.out.format("Introduix %d valors enters:%n", QUANTITAT);
            for (int i = 0; i < valors.length; i++) {
                valors[i]=ent.nextInt();
            }
            
            //Ordenem el vector
            Arrays.sort(valors);
            
            if(QUANTITAT%2==0){
                System.out.format("La mediana val %f%n", (valors[QUANTITAT/2]*1.0+valors[(QUANTITAT/2)-1])/2);
            }else{
                System.out.format("La mediana val %f%n", valors[QUANTITAT/2]*1.0);
            }
        }
    }
    
}
