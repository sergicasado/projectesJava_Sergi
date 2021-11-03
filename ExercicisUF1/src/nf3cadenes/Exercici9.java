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
public class Exercici9 {

    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);
        String text = "", resultat="";
        String separadors=" ,.'\n;:-";
        
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

        //Recorrem el text d'esquerra a dreta i li treiem els separadors
        for (int i = 0; i < text.length(); i++) {
            //Miro si el caracter actual és o no separador, i el tracto
            if(!separadors.contains(text.charAt(i)+"")) //text.charAt(i)+"" equival a Character.toString(text.charAt(i))
                        //Concateno el caràcter al resultat
                        resultat+=text.charAt(i);   //resultat=resultat+text.charAt(i)
        }
        
        System.out.format("%nEl text sense separadors és%n%s%n", resultat);
        
        System.out.println("\nI al revés és:");
        for (int i = resultat.length()-1; i >= 0; i--) {
            System.out.format("%c", resultat.charAt(i));
        }
        System.out.println("");
    }
}
