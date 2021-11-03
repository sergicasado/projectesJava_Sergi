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
public class Exercici2 {

    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        int opcio;
        int cont;

        do {

            //Mostrem el menú
            System.out.println("0. Sortir");
            System.out.println("1. Solució en for");
            System.out.println("2. Solució en while");
            System.out.println("3. Solució en do_while");
            System.out.println("Tria una opció:");

            //Llegim l'opció
            opcio = ent.nextInt();

            switch (opcio) {
                case 0:
                        System.out.println("Adéu!!");
                    break;
                case 1:
                    //1. Solució en for

                    //Mostrem el resultat dins d'un for
                    for (cont = -50; cont <= 50; cont++) {
                        System.out.print(cont + " és ");
                        System.out.println(cont % 2 == 0 ? "parell" : "imparell");
                    }

                    break;
                case 2:
                    //2. Solució en while
                    //Inicialització de variables
                    cont = -50;

                    //Mostrem el resultat dins d'un while
                    while (cont <= 50) {
                        System.out.print(cont + " és ");
                        System.out.println(cont % 2 == 0 ? "parell" : "imparell");
                        cont++;
                    }

                    break;
                case 3:
                    //3. Solució en do_while
                    //Inicialització de variables
                    cont = -50;

                    //Mostrem el resultat dins d'un do_while
                    do {
                        System.out.print(cont + " és ");
                        System.out.println(cont % 2 == 0 ? "parell" : "imparell");
                        cont++;
                    } while (cont <= 50);

                    break;
                default:
                    System.out.println("Opció incorrecta!!");
            }

        } while (opcio!=0);

    }

}
