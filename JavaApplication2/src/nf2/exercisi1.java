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
public class exercisi1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Introducció de dades
        Scanner ent = new Scanner(System.in);
        int n1, n2;

        System.out.println("Introdueix el primer número");
        n1 = ent.nextInt();

        System.out.println("Introdueix el segon número");
        n2 = ent.nextInt();

        if (n1 == n2) {

            System.out.println("Els dos números son iguals");

        } else {
            if (n1 > n2) {
                System.out.println("El primer número es mes gran que el segon");
            } else {

                System.out.println("El segon número és mes gran que el primer");
            }

        }

    }
    
}
