/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author alumne
 */
public class Vectors {
    
    
    
    public static void main(String[] args) {
    
        final int CONSTANT=25;
        
        Scanner ent=new Scanner(System.in);
        System.out.println("Quants valors necessites?:");
        int dimensio=ent.nextInt();
        int [] vector=new int[CONSTANT];
        dimensio=25;
        if (vector!=null) System.out.println(vector.length);
       
        for (int i = 0; i < vector.length; i++){
          if(i%2==0) vector[i]=45;
            System.out.format("El contingut de la casella %d és %d %n", i+1, vector [i]);
             
       
              
       
      }
       
       
       
       
       
       
       
       
       
       
       
       
       
       //Per accedir a un vector: 1. Nom variable
       //                            vector [ num enter  ]
        
       
       //Asignar valors a posicions del vector => vector [X (num que vulguem)] = vector [X]+1
        
        
        
        
        
        
        
        
        
        
    }
    
}
