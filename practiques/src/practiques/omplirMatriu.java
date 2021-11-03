/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiques;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class omplirMatriu {
    
    public static void main(String[] args) {
        
      //Feu un programa en Java que òmpligue una matriu quadrada de dimensió n x n,
      //de la següent forma (exemple per a n igual a 5):  
      
      Scanner ent = new Scanner(System.in);
      
      int num;
      int[][] matriu;
      int index=1;
      
      
      num = ent.nextInt();
      
      matriu = new int [num][num];
      
        for (int i = 0; i < matriu.length; i++) {
            
            for (int j = 0; j < matriu.length; j++) {
                
                matriu[i][j]=index;
                System.out.print(matriu[i][j] + "         ");
  
                index++;
                
            } 
            System.out.println("");
            
        }
        
        
        
        
    }
    
}
