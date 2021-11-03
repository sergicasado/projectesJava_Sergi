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
public class Exercici11 {
    
    public static void main(String[] args) {
        
        int n=5, valor=1;
        
        int[][] m=new int[n][n];
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j]=valor;
                
                System.out.format("%3d", m[i][j]);
                valor++;
            }
            System.out.println("");
        }
        
    }
    
}
