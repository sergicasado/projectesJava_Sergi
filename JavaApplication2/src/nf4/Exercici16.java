/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nf4;

import java.util.Random;

/**
 *
 * @author alumne
 */
public class Exercici16 {

    public static void main(String[] args) {

        int[][] matriu = new int[5][10];
        int[] sumFiles = new int[matriu.length];
        int[] sumColumnes = new int[matriu[0].length];

        Random r = new Random();

        for (int i = 0; i < matriu.length; i++) {
            int sumaFila = 0;
            for (int j = 0; j < matriu.length; j++) {

                System.out.format("%-4d", matriu[i][j] = r.nextInt(101));
                sumaFila += matriu[i][j];
            }

            sumFiles[i] = sumaFila;
            System.out.println("");

        }

        for (int j = 0; j < matriu[0].length; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < matriu.length; i++) {

                sumaColumna += matriu[i][j];

            }

            sumColumnes[j] = sumaColumna;

        }
            System.out.println("\nLa suma de les files:");
        for (int i = 0; i < sumFiles.length; i++) {
            System.out.format("%-4d", sumFiles[1]);
            
        }
            System.out.println("\nLa suma de les columnes:");
        for (int i = 0; i < sumColumnes.length; i++) {
            System.out.format("%-4d", sumColumnes[1]);
           
            
        
        
            
        }

    }

}
