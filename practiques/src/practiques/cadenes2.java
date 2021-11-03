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
public class cadenes2 {

//     Millora: que el text introduït pugue contindre una o més línies de text, separades
//     per INTROs, i finalitze quan la línia acabe en el caràcter '.'
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        //Demanar frase amb espais
        ent.useDelimiter("\n");
        String frase, copiafrase = "";
        char lletra;
        int cont = 0;

        System.out.println("Introdueix una frase:");

        do {
            frase = ent.next();
            copiafrase = copiafrase + frase;

            if (frase.endsWith(".")) {
                break;
            }

        } while (true);

        System.out.println("frase introduida:");
        System.out.println(copiafrase);

        System.out.println("Introdueix la lletra a buscar dins la frase");
        lletra = ent.next().charAt(0);

        for (int i = 0; i < copiafrase.length(); i++) {

            if (copiafrase.charAt(i) == lletra) {
                cont++;
            }

        }

        System.out.format("La frase conté %d vegades la lletra %s", cont, lletra);

    }

}
