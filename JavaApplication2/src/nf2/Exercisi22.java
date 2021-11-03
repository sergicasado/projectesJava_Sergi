/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nf2;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Exercisi22 {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        int num;
//
        do {
            System.out.println("num (>0):");
            num = ent.nextInt();

            if (num <= 0) {
                System.out.println("Ha de ser positiu");
            } else {
                break;
            }
        } while (true);

        for(int i=0; i < num; i++) {
            for(int j=0; j<i+1; j++) System.out.print("*");
            System.out.println("");

        }
        
//.................................................................

       do {
            System.out.println("num (>0):");
            num = ent.nextInt();

            if (num <= 0) {
                System.out.println("Ha de ser positiu");
            } else {
                break;
            }
        } while (true);

        for(int i=num-1; i >= 0; i--) {
            for(int j=0; j<i+1; j++) System.out.print("*");
            System.out.println("");

        }
//..................................................................

        do {
            System.out.println("num (>0):");
            num = ent.nextInt();

            if (num <= 0) {
                System.out.println("Ha de ser positiu");
            } else {
                break;
            }
        } while (true);

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }

            System.out.println("");
        }

 //...............................................................
 
   do {
            System.out.println("num (>0):");
            num = ent.nextInt();

            if (num <= 0) {
                System.out.println("Ha de ser positiu");
            } else {
                break;
            }
        } while (true);

        for (int i = num-1; i >=0; i--) {
            for (int j=0; j<num-i-1; j++) 
                System.out.print(" ");
            

            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }

            System.out.println("");
        }
 
 
 
        
    }

}
