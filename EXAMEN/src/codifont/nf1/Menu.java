/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codifont.nf1;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class Menu {
    
    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        int opcio;
        boolean permaneixer=true;
        
        do {            
            System.out.println("Menú del programa");
            System.out.println("1. Mostrar hola");
            System.out.println("2. Escriure un caracter");
            System.out.println("3. Sortir del programa");
            System.out.println("Tria una opció:");

            opcio=ent.nextInt();

            switch (opcio) {
                case 1:
                    System.out.println("Hola");
                    break;
                case 2:
                    System.out.println("Escriu un caracter:");
                    char c=ent.skip("[\r\n]*").nextLine().charAt(0);
                    break;
                case 3:
                    System.out.println("Adéu!!");
                    permaneixer=false;
                    break;
                default:
                    System.out.println("Opció incorrecta!!");
            }
                    
        } while (permaneixer);
        
    }
    
}
