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
public class ExerciciIVCadenes {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        String text = "";
        char c = 0;
        int cont = 0;

        System.out.println("Introdueix un text format per una o mes linees i acabat en punt");
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

        System.out.println("Introdueix un text format per una o mes linees i acabat en ENTER");      
        String linia = ent.nextLine().trim();          
                 
        

    }
}
