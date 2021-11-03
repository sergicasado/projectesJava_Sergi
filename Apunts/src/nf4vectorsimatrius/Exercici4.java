/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nf4vectorsimatrius;

/**
 *
 * @author profe
 */
public class Exercici4 {
    
    public static void main(String[] args) {
        int[] parells, imparells;   //Declaració
        //Instanciació
        parells=new int[51];
        imparells=new int[50];
        
        //Solució 1, tocant el mínim indispensable de l'exercici 3
        int indP=0, indI=0;
        
        
        for (int i = -50; i <= 50; i++) {
            System.out.format("%d és %s%n", i, (i%2==0?"parell":"imparell"));
            
            if(i%2==0){
                parells[parells.length-1-indP]=i;
                indP++;
            }
            else {
                imparells[imparells.length-1-indI]=i;
                indI++;
            }            
        }
        
        //Solució 2, canviant la manera de treballar dels índexos
        indP=parells.length-1; 
        indI=imparells.length-1;
        
        
        for (int i = -50; i <= 50; i++) {
            
            if(i%2==0){
                parells[indP--]=i;
            }
            else {
                imparells[indI--]=i;
            }            
        }

        
        //Mostrem el vector dels parells
        System.out.println("\nMostrem el vector dels parells:");
        for (int i = 0; i < parells.length; i++) {
            System.out.println(parells[i]);
            
        }
        
        //Mostrem el vector dels parells
        System.out.println("\nMostrem el vector dels imparells:");
        for (int i = 0; i < imparells.length; i++) {
            System.out.println(imparells[i]);
            
        }
        
    }
    
}
