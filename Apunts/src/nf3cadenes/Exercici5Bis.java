/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nf3cadenes;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class Exercici5Bis {

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
            //Versió sense poder usar l'indexOf()
            while(true){
            
                if(text.substring(index, index+text2.length()).equals(text2)) cont++;
                index++;
                if(index==text.length()-text2.length()) break;
            }
                                    
            System.out.format("%nEl text %s conté el text %n%s %n%d %nvegades.%n", text, text2, cont);
        }

    }

}
