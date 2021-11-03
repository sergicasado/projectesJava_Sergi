/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ExercisiCadenesMillorat {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        String text = "";
        char c = 0;
        int cont = 0;

        System.out.println("Introduix un text format per una o mes linees i acabat en punt");
        do {
            String linia = ent.nextLine().trim();
            if (text.isEmpty()) {
                text = linia;

            } else {
                text = text + '\n' + linia;
            }
            if (text.charAt(text.length() - 1) == '.') {
                break;

            }
        } while (true);
        System.out.println("Introduix el caracter a buscar dins del text");
        do {
            //No fico el trim() per si vol buscar el caracter en blanc
            String linia = ent.nextLine();
            if (linia.isEmpty()) {
                System.out.println("No pots posar la cadena buida");
            } else {
                c = linia.charAt(0);
            }
            break;

        } while (true);

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == c) {
                cont++;
            }

        }
        System.out.format("%nEl caracter ´%c´ apareix %d vegades dins del text. %n", c, cont);

    }
}
