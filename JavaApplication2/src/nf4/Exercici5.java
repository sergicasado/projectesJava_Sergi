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
public class Exercici5 {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        
        int nums;

        do {

            System.out.println("Introdueix una quantitat de números:");
            nums = ent.nextInt();

            final int QUANTITAT = nums;
            int[] vector = new int[QUANTITAT];

            if (nums <= 0) {
                System.out.println("Ha de ser positiu!!");
            } else break;
            }while(true);

        }
    
}
