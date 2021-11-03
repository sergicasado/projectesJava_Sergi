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
public class Exercici15 {

    public static void main(String[] args) {

        Scanner escaner = new Scanner(System.in);

        char lletra;

        System.out.println("Introdueix una lletra minúscula");

        lletra = escaner.nextLine().charAt(0);

       
            
        switch (lletra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("La lletra que has introduit es una vocal");

                break;
            default:
                System.out.println("La lletra que has introduit no es una vocal o està en majúscula");

        }

        
    }

}
