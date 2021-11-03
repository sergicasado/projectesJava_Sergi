/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenuf1sergicasado;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Pr1 {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        String caracter;
        char a;

        int num1, num2;

        do {
            System.out.println("Introdueix una lletra:");

            caracter = ent.nextLine();
            if (caracter.isEmpty()) {

                caracter = " ";
                a = caracter.charAt(0);

            } else {
                a = caracter.charAt(0);

            }

            break;

        } while (true);

        System.out.println("Introdueix dos numeros diferents (Han de ser majors que 0!!):");

        do {
            num1 = ent.nextInt();
            num2 = ent.nextInt();

            if (num1 <= 1 || num2 <= 1 || num1 == num2) {
                System.out.println("Han de ser majors que 0 i diferents!!");
            }

        } while (num1 <= 1 || num2 <= 1 || num1 == num2);

    }

}
