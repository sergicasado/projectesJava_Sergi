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
public class cadenes1 {

//     Escriu un programa en Java que demane la introducció d'un text no buit format
//     per una sola línia i acabat en INTRO, i un caràcter, i finalitze dient
//     quantes vegades apareix el caràcter dins del text. Exemple:
//  Introduix un text acabat en INTRO:
//  En un lugar de la Mancha.
//
//  Introduix el caràcter a buscar dins del text:
//  a
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        //Demanar frase amb espais
        ent.useDelimiter("\n");
        String frase;
        char lletra;
        int cont = 0;

        System.out.println("Introdueix una frase:");
        frase = ent.next();
        
        System.out.println("frase introduida:");
        System.out.println(frase);

        System.out.println("Introdueix la lletra a buscar dins la frase");
        lletra = ent.next().charAt(0);

        for (int i = 0; i < frase.length(); i++) {

            if (frase.charAt(i) == lletra) {
                cont++;
            }

        }

        System.out.format("La frase conté %d vegades la lletra %s", cont, lletra);

    }

}
