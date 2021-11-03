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
public class Exercici14Complicat {
    
    public static void main(String[] args) {
        
        int n=6,valor=0;
        
        char[][] m=new char[n][n];
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j]=(char)('A'+valor);
                
                System.out.format("%2c", m[i][j]);
                
                //Si arribem a la Z assignem la A per la següent iteració
                valor=(valor+1)%('Z'-'A'+1);
            }
            System.out.println("");
        }
        
    }
    
}
