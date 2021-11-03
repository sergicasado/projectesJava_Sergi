/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nf4vectorsimatrius;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author profe
 */
public class Exercici14 {
    
    public static void main(String[] args) {

        //Declaració de variables
        Scanner ent=new Scanner(System.in); 
        char[][] matriu;
        int n;
        int valor;
        
        //Demanem la dimensió a l'usuari
        do {            
            System.out.println("Introduix un número enter positiu (>0):");
            n=ent.nextInt();
            if(n<1) System.out.println("Ha de ser positiu!!");
            else break;
        } while (true);
        
        //Instanciem la matriu en la dimensió introduïda per l'usuari
        matriu=new char [n][n];
        
        //Omplim i mostrem la matriu
        valor=0;
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                matriu[i][j]= (char) ((valor % ('Z'-'A'+1))+'A');
                valor++;
                System.out.format("%-2c",matriu[i][j]);
            }
            System.out.println("");
        }



    }
    
}
