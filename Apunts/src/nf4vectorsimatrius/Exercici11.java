/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nf4vectorsimatrius;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class Exercici11 {
    
    public static void main(String[] args) {
        
        //Declaració de variables
        Scanner ent=new Scanner(System.in); 
        int[][] matriu;
        int n,valor=1;
        
        //Demanem la dimensió a l'usuari
        do {            
            System.out.println("Introduix un número enter positiu (>0):");
            n=ent.nextInt();
            if(n<1) System.out.println("Ha de ser positiu!!");
            else break;
        } while (true);
        
        //Instanciem la matriu en la dimensió introduïda per l'usuari
        matriu=new int [n][n];
        
        //Omplim i mostrem la matriu
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                
                System.out.format("%-5d",matriu[i][j]=valor++);
            }
            System.out.println("");
        }
        
        
    }
}
