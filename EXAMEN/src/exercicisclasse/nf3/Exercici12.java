/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisclasse.nf3;

/**
 *
 * @author profe
 */
public class Exercici12 {
    
    public static void main(String[] args) {
        
        int n=25;
        
        int[][] m=new int[n][n];
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                
                if(i==j || i+j==m.length-1) m[i][j]=1;
                
                System.out.format("%2d", m[i][j]);
            }
            System.out.println("");
        }
        
    }
    
}
