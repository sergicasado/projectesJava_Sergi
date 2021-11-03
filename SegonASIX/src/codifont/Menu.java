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
public class Menu {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int opcio;
        

        do {

            System.out.println("------------------------------");
            System.out.println("| Menú del programa:         |");
            System.out.println("------------------------------");
            System.out.println("| 1. Autor                   |");
            System.out.println("| 2. Escriure un caracter    |");
            System.out.println("| 3. Sortir                  |");
            System.out.println("------------------------------");
            System.out.println("Tria una opció:");

            opcio = ent.nextInt();

            switch (opcio) {
                case 1:
                    System.out.println("Sergi");
                    break;
                case 2:
                    System.out.println("Escriu un caracter:");
               //   char c=ent.nextLine().charAt(0);    //Arreglar fallo: 
                    char c=ent.skip("[\r\n]*").nextLine().charAt(0);
                    System.out.println("Has escrit el caracter: "+c);
                    
                    break;
                case 3:
                    System.out.println("Has sortit del programa.");

                    break;

                default:
                    System.out.println("Opció incorrecta!");

            }

        } while (opcio!=3);

    }

}
