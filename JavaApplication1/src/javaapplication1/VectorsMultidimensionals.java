/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Random;


/**
 *
 * @author sergi
 */
public class VectorsMultidimensionals {
    
    public static void main(String[] args) {
        
//        //Vector bidimensional
//        int[][] matriu=
//        
//        //Primer instanciar files despres columnes
//        new int[5][6];
//        
//        
//        //Matriu no equitativa
//        
//        int[][]matriu2=
//        new int [5][];
//        
//        matriu[0]=new int[5];
//        matriu[1]=new int[1];
//        matriu[2]=new int[2];
//        matriu[3]=new int[5];
//        matriu[4]=new int[3];
    
        Random r=new Random();
        
        
        //2 dimensions

//        int [][] vector=new int[4][5];
        
        
        
//        for (int i = 0; i < vector.length; i++) {
//            
//            for (int j = 0; j < vector[i].length; j++) {
//               
//                vector[i][j]=r.nextInt();
//                
//            }
//            
//        }
        

// 3 dimensions

        int [][][] vector=new int[4][5][25];
        
        
        
        for (int i = 0; i < vector.length; i++) {
            
            for (int j = 0; j < vector[i].length; j++) {
                
                for (int k = 0; k < vector[i][j].length; k++) {
                  
                    vector[i][j][k]=r.nextInt();
                    
                }
               
                
                
            }
            
        }



    }
    
}
