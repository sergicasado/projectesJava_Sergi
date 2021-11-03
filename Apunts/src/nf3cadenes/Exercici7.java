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
public class Exercici7 {

    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);
        String text = "", resultat="";
        
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

        for (int i = 0; i < text.length(); i++) {
            if(Character.isUpperCase(text.charAt(i)))
                resultat+=Character.toLowerCase(text.charAt(i));
            else
                resultat+=Character.toUpperCase(text.charAt(i));
        }
        
        System.out.format("%nEl text transformat és%n%s%n", resultat);
        
        
    }
}
