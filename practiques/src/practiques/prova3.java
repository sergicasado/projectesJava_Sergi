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
public class prova3 {

    public static void main(String[] args) {

//        Escriu un programa que demane la introducció d'una o més línies de text, 
//        separades per INTROs, i finalitze quan una de les línies acabe en
//        el caràcter '.'. A continuació ha de dir quantes línies s'han
//        introduït. Nota: no comptabilitzarem les línies que no contenen caràcters.
        Scanner ent = new Scanner(System.in);

        //Demanar frase amb espais
        ent.useDelimiter("\n");
        String frase, copiafrase = "";
        char lletra;
        int cont = 0;

        System.out.println("Introdueix una frase:");

        do {
            frase = ent.next();
            if (frase.isEmpty()) {
                cont = cont;
            } else {
                cont++;
            }
            copiafrase = copiafrase + frase;

            if (frase.endsWith(".")) {
                break;
            }

        } while (true);

        System.out.format("El text conté %d lines", cont);

    }

}
