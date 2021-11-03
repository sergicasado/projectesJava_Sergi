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
public class Exercicis16_17_Pt5 {

    public static void main(String[] args) {
        //Declaració de variables
        Scanner entN = new Scanner(System.in);    //L'utilitzo per llegir números
        Scanner entC = new Scanner(System.in);    //i este per les cadenes
        int num1, num2, opcio;
        char op;

        do {
            //Mostrem el menú 
            System.out.println("1. Fer operació.");
            System.out.println("2. Sortir del programa.");
            System.out.println("Tria una opció:");
            opcio = entN.nextInt();
            switch (opcio) {
                case 1:
                    //Demanem a l'usuari la introducció de les dades
                    //Comencem pels enters
                    System.out.println("Introduix 2 números enters qualsevol:");
                    num1 = entN.nextInt();
                    num2 = entN.nextInt();

                    //Demanem a l'usuari l'operació
                    System.out.println("Introduix l'operació + - * / % :");
                    op = entC.nextLine().charAt(0);

                    switch (op) {
                        case '+':
                            System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
                            break;
                        case '-':
                            System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
                            break;
                        case '*':
                            System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
                            break;
                        case '/':
                            if (num2 != 0) {
                                System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
                            } else {
                                System.out.println("Error: no pots dividir per 0!!");
                            }
                            break;
                        case '%':
                            if (num2 != 0) {
                                System.out.println(num1 + "%" + num2 + "=" + (num1 % num2));
                            } else {
                                System.out.println("Error: no pots dividir per 0!!");
                            }
                            break;
                        default:
                            System.out.println("Operació '" + op + "' incorrecta!!");
                    }

                    break;
                case 2:
                    System.out.println("Adéu!!");
                    break;
                default:
                    System.out.println("Opció incorrecta!!");
            }

        } while (opcio != 2);

    }

}
