/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiques;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class prova5 {
    
    public static void main(String[] args) {
        
//        Escriu un programa que demane la introducció d'un text acabat en punt format
//        per una o més línies, i un segon text no buit acabat en INTRO, i compte
//        i digue quantes vegades apareix el segon dins del primer. Exemple:

      Scanner ent = new Scanner(System.in);

        //Demanar frase amb espais
        ent.useDelimiter("\n");
        String frase, copiafrase = "",paraula;
        char lletra;
        int cont = 0, contC = 0;
        

        System.out.println("Introdueix una frase:");

        do {
            frase = ent.next();
            if (frase.isEmpty() || frase.isBlank()) {
                cont = cont;
            } else {
                cont++;
            }
            copiafrase = copiafrase + frase;

            if (frase.endsWith(".")) {
                break;
            }

        } while (true);
        
        cont = 0;
        System.out.println("Introdueix paraula a buscar dins del text:");
        
        paraula = ent.next();
        
        for (int i = 0; i < args.length; i++) {
            
            
            
            
            
        }
        
    }
    
}
