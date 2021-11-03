/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerprojecte;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class Vectors {
    
    public static void main(String[] args) {
        
        final int CONSTANT=2;
        
        Scanner ent=new Scanner(System.in);
        System.out.println("Quants valors necessites?:");
        int dimensio=ent.nextInt();
        int[] vector=new int[CONSTANT];
        
        boolean[] v2={true, false, true};   //vector de 3 caselles
        Scanner[] v3={new Scanner(System.in), //Vector de 4 caselles
            null, 
            new Scanner(System.in), 
            null};
        String[] diesSetmana={"Dilluns", "Dimarts", "Dimecres"};
        
        dimensio=25;
        if(vector!=null) System.out.println(vector.length);
        
        for (int i = 0; i < vector.length; i++) {
            if(i%2==0) vector[i]=45;
            System.out.format("El contingut de la casella %d és %d%n", i+1, vector[i]);
            
        }
        
        
        
    }
    
}
