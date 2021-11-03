/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exempleuf2;

import java.util.Scanner;
import static exempleuf2.Exercici11.buscaCadena;

/**
 *
 * @Sergi Exercici12
 */
public class Exercici12 {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        String text = "", text2;
        int cont = 0, index = 0;

        System.out.println("Introduix un text format per una o més línies i acabat en punt:");
        do {
            String linia = ent.nextLine().trim();
            if (text.isEmpty()) {
                text = linia;
            } else {
                text = text + '\n' + linia;
            }
            if (text.endsWith(".")) {
                break;
            }
        } while (true);

        System.out.println("Introduix un text acabat en INTRO:");
        text2 = ent.nextLine();

        if (text2.isEmpty()) {
            System.out.println("No pots buscar la cadena buida. Adéu!!");
        } else {
            
            
            index = buscaCadena(text, text2, 0);
            System.out.println("La subcadena apareix a les posicions:");
            while (index != -1) {
                System.out.println(index);
                cont++;
                index = buscaCadena(text, text2, index + 1);
            }

            System.out.format("%nEl text %s conté el text %n%s %n%d %nvegades.%n", text, text2, cont);
        }

    }

}
