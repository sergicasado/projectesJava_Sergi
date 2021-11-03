/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nf2introjava;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class Exercici15 {

    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        char c;

        //Demanem a l'usuari que escrigue un caràcter
        System.out.println("Introduix una lletra minúscula:");
        c = ent.nextLine().charAt(0);

        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("És vocal");
                break;
            default:
                System.out.println("No és vocal");
        }

    }

}
