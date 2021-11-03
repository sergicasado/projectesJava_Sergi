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
public class Exercici14 {
    
    public static void main(String[] args) {
        
        int n=6;
        char valor='A';
        
        char[][] m=new char[n][n];
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j]=valor;
                
                System.out.format("%2c", m[i][j]);
                
                //Si arribem a la Z assignem la A per la següent iteració
                if(valor=='Z') valor='A';
                //si era inferior a Z incrementem el caràcter
                else valor++;
            }
            System.out.println("");
        }
        
    }
    
}
