/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerprojecte;

import java.util.Random;

/**
 *
 * @author profe
 */
public class VectorsMultidimensionals {
    
    public static void main(String[] args) {
//        Random r=new Random();
//        
//        int[][][] vector=new int[4][5][25];
//        
//        for (int i = 0; i < vector.length; i++) {
//            for (int j = 0; j < vector[i].length; j++) {
//                for (int k = 0; k < vector[i][j].length; k++) {
//                    vector[i][j][k]=r.nextInt();
//                    
//                }
//                
//            }
//        }

//        //Instanciem la matriu
//        int[][] matriu=new int [5][5];
//        int valor=0;
//        //Omplim i mostrem la matriu
//        for (int i = 0; i < matriu.length; i++) {
//            for (int j = 0; j < matriu[i].length; j++) {
//                matriu[i][j]=valor%8 + 1;
//                valor++;
//                System.out.format("%-5d",matriu[i][j]);
//            }
//            System.out.println("");
//        }

        char[][] matriu=new char [5][5];
        int valor=0;
        //Omplim i mostrem la matriu
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                matriu[i][j]= (char) ((valor % ('r'-'c'+1))+'c');
                valor++;
                System.out.format("%2c",matriu[i][j]);
            }
            System.out.println("");
        }



    }
    
}
