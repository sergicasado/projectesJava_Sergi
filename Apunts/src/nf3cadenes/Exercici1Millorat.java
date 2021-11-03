/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nf3cadenes;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author alumne
 */
public class Exercici1Millorat {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int num;
        int[][] matriu;
        int valor;
        int i, j;

        do {
            System.out.println("Introdueix un número enter imparell entre (1-31):");
            num = ent.nextInt();
            if (num < 1 || num > 31 || num % 2 == 0) {
                System.out.println("Nombre incorrecte!!");
            } else {
                break;
            }
        } while (true);

        matriu = new int[num][num];
        
        
        
        System.out.println("");
        System.out.println("Matriu generada:");
        
        
        for (int k = 0; k < matriu.length; k++) {
            for (int l = 0; l < matriu[k].length; l++) {
               
                
                matriu[k][l] = (k*matriu.length)+(l+1);
                
                System.out.format("%-4d", matriu[k][l]);

            }
            System.out.println("");
        }

       
        

    }
}
