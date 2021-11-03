/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nf4;
import java.util.Scanner;
/**
 *
 * @author alumne
 */
public class Exercici11 {
    
    public static void main(String[] args) {
        
        //Declaració de variables.
        Scanner ent=new Scanner(System.in);
        int[][] matriu;
        int n,valor=1;
        
        //Demanem la dimensio a l'usuari
        
        do {
            System.out.println("Introdueix un número positiu");
            n=ent.nextInt();
            System.out.println("");
            
            if(n<1)System.out.println("Ha de ser positiu!!");
            else break;
                   
        } while (true);
        
        
        //Instanciem la matriu en la dimensió introduïda per l'usuari
        matriu=new int [n][n];
        
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                
                
                System.out.format("%-d",matriu[i][j]=valor++);
                
                
            }
            
            System.out.println("");
        }
        
        
        
        
        
        
        
    }
    
}
