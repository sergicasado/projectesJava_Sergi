/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisclasse.nf2;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class Exercici1 {
    
    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        String linia, segona;
        char car;
        int cont=0;
        
        //Demanem a l'usuari la introducció d'una línia NO BUIDA
        do{
            System.out.println("Escriu una línia de text acabada en INTRO:");
            //linia=ent.skip("[\r\n]*").nextLine().trim();
            linia=ent.nextLine().trim();
            if(!linia.isEmpty()) break;
            else System.out.println("No pot ser una línia que només conté espais en blanc.");
        }while(true);
        
        
        //Demanem a l'usuari la introducció d'un caràcter
        do{
            System.out.println("Escriu un caràcter a buscar dins del text:");
            //segona=ent.skip("[\r\n]*").nextLine();
            segona=ent.nextLine();
            if(segona.length()==0) System.out.println("Has d'escriure un caràcter com a mínim.");
            else break;
        }while(true);
        
        System.out.format("Has triat el caràcter '%c'. %n",car=segona.charAt(0));
        
        //Recorrem la línia caracter a caracter comparant en el que busquem
        for (int i = 0; i < linia.length(); i++) {
            //Si trobem el buscat incremento elcomptador d'aparicions
            if(linia.charAt(i)==car) cont++;
        }
        
        System.out.format("El caràcter '%c' apareix %d vegades %ndins del text: %n%s%n", car, cont, linia);
        
    }
    
}
