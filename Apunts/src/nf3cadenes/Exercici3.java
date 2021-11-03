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
public class Exercici3 {
    
    public static void main(String[] args) {
        
        Scanner ent = new Scanner(System.in);
        String text = "";
        int cont=0;
        
        System.out.println("Introduix un text format per una o més línies i acabat en punt:");
        do {
            String linia = ent.nextLine().trim();
            if (text.isEmpty()) {
                text = linia;
            } else {
                text = text + '\n' + linia;
            }
            if(!linia.isBlank()) cont++;
            if (text.endsWith(".")) {
                break;
            }
        } while (true);

        System.out.format("%nEl text %s conté %d %nlínies.%n", text, cont);
        
        
    }
    
}
