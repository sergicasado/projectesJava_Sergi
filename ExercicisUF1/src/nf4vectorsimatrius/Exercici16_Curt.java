/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nf4vectorsimatrius;

import java.util.Random;

/**
 *
 * @author profe
 */
public class Exercici16_Curt {
    
    public static void main(String[] args) {
        //Declaració de variables
        int[][] matriu=new int[5][10];
        int[] sumFiles=new int[matriu.length];
        int[] sumColumnes=new int[matriu[0].length];
        Random r =new Random();
        
        //Omplim la matriu i aprofitem per sumar les files i les columnes
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                System.out.format("%-4d",matriu[i][j]=r.nextInt(101));
                sumFiles[i]+=matriu[i][j];  //sumFiles[i]=sumFiles[i]+matriu[i][j];
                sumColumnes[j]+=matriu[i][j];
            }
            System.out.println("");
        }
        
        //Mostrem la suma de les files
        System.out.println("\nLa suma de les files és:");
        for (int i = 0; i < sumFiles.length; i++) {
            System.out.format("%-4d",sumFiles[i]);
            
        }

        //Mostrem la suma de les columnes
        System.out.println("\nLa suma de les columnes és:");
        for (int i = 0; i < sumColumnes.length; i++) {
            System.out.format("%-4d",sumColumnes[i]);
            
        }


    }
    
}
