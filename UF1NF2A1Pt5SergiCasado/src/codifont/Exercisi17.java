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
public class Exercisi17 {

    public static void main(String[] args) {

        int opcio;
        int num1, num2;
        int signe;

        Scanner ent = new Scanner(System.in);

        do {
            System.out.println("Tria una se les següents opcions");
            System.out.println("1. Fer operació");
            System.out.println("2. Sortir");

            opcio = ent.nextInt();

            switch (opcio) {
                case 2:

                    System.out.println("Has sortit de la calculadora");

                    break;

                case 1:

                    System.out.println("Introdueix un número:");
                    num1 = ent.nextInt();
                    System.out.println("Escolleix [+ - * /]:");
                    signe = ent.next().charAt(0);
                    System.out.println("Introdueix un número");
                    num2 = ent.nextInt();

                    switch (signe) {
                        case '+':
                            System.out.println("El resultat dona:");
                            System.out.println(num1 + num2);

                            break;

                        case '*':
                            System.out.println("El resultat dona:");
                            System.out.println(num1 * num2);

                            break;

                        case '/':
                            System.out.println("El resultat dona:");
                            System.out.println(num1 / num2);

                            break;

                        case '-':
                            System.out.println("El resultat dona:");
                            System.out.println(num1 - num2);

                            break;
                            
                         
                            

                        default:
                            

                    }

            }

        } while (opcio != 1 && opcio != 2);

    }

}
