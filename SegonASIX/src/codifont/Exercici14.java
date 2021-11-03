/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codifont;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Exercici14 {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        String text = "";
        int num;

        System.out.println("Introdueix un numero enter (>0)");
        do {
            num = ent.nextInt();
            if (num < 1) {
                System.out.println("Ha de ser mes gran que 0");
            } else {
                break;
            }

        } while(true);
        
    }
}

    

