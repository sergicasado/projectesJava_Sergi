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
public class prova4 {

    public static void main(String[] args) {

//        Escriu un programa que demane la introducció d'una o més línies de text, 
//        separades per INTROs, i acabe quan una de les línies contingue el caràcter
//       '.'. A continuació ha de dir quantes línies i quants caràcters s'han introduït.
//       Nota: no comptem com a caràcters ni els espais en blanc ni els salts de línia.
//sout quantes lines, caracters
        Scanner ent = new Scanner(System.in);

        //Demanar frase amb espais
        ent.useDelimiter("\n");
        String frase, copiafrase = "";
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

        String noespai = copiafrase.replace(" ", "");

        for (int i = 0; i < noespai.length(); i++) {

            contC++;

        }

        contC--;

        System.out.format("El text conté %d lines, conté %d caracters", cont, contC);

    }

}
