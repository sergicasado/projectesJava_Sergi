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
public class Exercici1 {

    public static void main(String[] args) {

        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        int p, s;

        //Li diem a l'usuari que introduisque els números
        System.out.println("Introduix 2 números enters:");
        p = ent.nextInt();
        s = ent.nextInt();

        //Comprovem com són els números introduïts i li diem a l'usuari
        if (p == s) {
            System.out.println("Els 2 números són iguals.");
        } else {
            if (p > s) {
                System.out.println("El primer número és més gran que el segon.");
            } else {
                System.out.println("El primer número és més menut que el segon.");
            }
        }
    }

}
