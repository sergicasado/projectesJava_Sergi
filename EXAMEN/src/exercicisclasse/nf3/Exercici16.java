/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisclasse.nf3;

import java.util.Random;

/**
 *
 * @author profe
 */
public class Exercici16 {
    
    public static void main(String[] args) {
        int[][] matriu=new int[5][10];
        int[] sumaF=new int[5];
        int[] sumaC=new int[10];
        
        Random r=new Random();
        
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                //Generem enters aleatoris entre 0 i 100
                matriu[i][j]=r.nextInt(100+1);
                
                //Generem enters aleatoris entre 15 i 100
                //matriu[i][j]=r.nextInt(100-15+1)+15;
                
                System.out.format("%4d", matriu[i][j]);
                
                //Acumulem la fila
                sumaF[i]=sumaF[i]+matriu[i][j];

                //Acumulem la columna
                sumaC[j]=sumaC[j]+matriu[i][j];
            }
            System.out.println("");
        }
        
        //Mostrem la suma de les files
        System.out.println("\nVector en la suma de les files:\n");
        for (int i = 0; i < sumaF.length; i++) {
            System.out.format("%5d", sumaF[i]);
        }
        System.out.println("");
        
        //Mostrem la suma de les columnes
        System.out.println("\nVector en la suma de les columnes:\n");
        for (int i = 0; i < sumaC.length; i++) {
            System.out.format("%4d", sumaC[i]);
        }

        System.out.println("");

    }
    
}
