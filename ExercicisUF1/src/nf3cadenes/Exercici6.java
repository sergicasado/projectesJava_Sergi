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
public class Exercici6 {

    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);
        String text = "";
        String separadors=" '\n,.";
        int cont=0;
        boolean enParaula=false;
        
        System.out.println("Introduix un text format per una o més línies i acabada en una que contingue el punt:");
        do {
            String linia = ent.nextLine().trim();
            
            if (text.isEmpty()) {
                text = linia;
            } else {
                text = text + '\n' + linia;
            }
            if (text.contains(".")) {
                break;
            }
        } while (true);

        for (int i = 0; i < text.length(); i++) {
            if(separadors.contains(Character.toString(text.charAt(i)))) //o if(separadors.contains(text.charAt(i)+""))
                enParaula=false;
            else{
                if(!enParaula) cont++;
                enParaula=true;
            }
        }
        
        System.out.format("%nEl text%n%s%nconté %d paraules.%n", text, cont);
        
        
    }
}
