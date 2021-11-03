/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisdomjudge;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class Exercici31 {

    public static void main(String[] args) {
        //Decalaracio de variables
        Scanner ent = new Scanner(System.in);
        int num, contDivisors;

        //
        do {
            num = ent.nextInt();

            

            if (num < 2) {
                System.out.println("NO");
            } else {   //Tractem els números >=2

                contDivisors = 0;
                
                for (int i = 1; i < num && contDivisors <= 1; i++) {
                    if (num % i == 0) {
                        contDivisors++;
                    }
                }

                if (contDivisors == 1) {
                    System.out.println("SI");
                } else {
                    System.out.println("NO");
                }

            }

        } while (num != -1);

    }

}
