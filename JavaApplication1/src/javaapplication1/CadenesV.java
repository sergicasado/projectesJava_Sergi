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
public class CadenesV {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        String text = "";
        String solucio = "";
        char lletra;

        System.out.println("Introdueix un text");

        do {
            text = ent.nextLine().trim();
            if (text.isEmpty()) {
                text = text + '\n';
       }
        }while(true);
    }

}
        

