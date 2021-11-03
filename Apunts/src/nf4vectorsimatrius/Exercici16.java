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
public class Exercici16 {
    
    public static void main(String[] args) {
        //Declaració de variables
        int[][] matriu=new int[15][10];
        int[] sumFiles=new int[matriu.length];
        int[] sumColumnes=new int[matriu[0].length];
        Random r =new Random();
        
        //Omplim la matriu i aprofitem per sumar les files
        for (int i = 0; i < matriu.length; i++) {
            int sumaFila=0;
            for (int j = 0; j < matriu[i].length; j++) {
                System.out.format("%-4d",matriu[i][j]=r.nextInt(101));
                sumaFila+=matriu[i][j]; //sumaFila=sumaFila+matriu[i][j];
            }
            sumFiles[i]=sumaFila;
            System.out.println("");
        }
        
        //Sumarem les columnes
        for (int j = 0; j < matriu[0].length; j++) {
            int sumaColumna=0;
            for (int i = 0; i < matriu.length; i++) {
                sumaColumna+=matriu[i][j];
            }
            sumColumnes[j]=sumaColumna;
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
