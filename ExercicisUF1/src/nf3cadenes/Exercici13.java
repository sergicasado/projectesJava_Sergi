/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nf3cadenes;

import java.util.Scanner;


public class Exercici13 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String text = "";
        int posIni = 0;

        System.out.println("Introdueix un text no buit format per una sola línia:");

        do {
            text = ent.nextLine().trim();

            if (!text.isBlank()) {
                break;
            } else System.out.println("Ha de ser no buit!!");

        } while (true);

        System.out.println("\nEl text conté les paraules:");
        do {
            int posFin = text.indexOf(' ', posIni);
            if (posFin != -1) {
                if (posIni != posFin) {
                    System.out.println(text.substring(posIni, posFin));
                }
            } else {
                System.out.println(text.substring(posIni));
            }
            posIni = posFin + 1;
        } while (posIni != 0);
    }
}