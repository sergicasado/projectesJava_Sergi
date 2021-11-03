/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectors;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Practica3TipoRima {

    public static void main(String[] args) {

        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        int numEstrofes, estrofesQueRimen = 0, numLletres, tipoRima;
        String vers1, vers2, vers3, vers4;

        //Demanar número estrofes
        do {
            System.out.println("Introdueix el número d'estrofes (>=0)");
            numEstrofes = ent.nextInt();
            if (numEstrofes < 0) {
                System.out.println("Ha de ser major o igual que 0");

            } else {
                break;
            }
        } while (true);

        //Acabar si 0 estrofes
        if (numEstrofes == 0) {
            System.out.println("Adéu");
        } //o
        else {

            //tractar les estrofes
            for (int i = 0; i < numEstrofes; i++) {

                //Demanar lletra rima
                do {
                    System.out.println("Introdueix el número de la lletra per la rima (>=1)");
                    numLletres = ent.nextInt();
                    if (numLletres < 1) {
                        System.out.println("Ha de ser major o igual que 1");

                    } else {
                        break;
                    }
                } while (true);

                //Demanar tipo de rima
                do {
                    System.out.println("Introdueix el tipo rima (1-4)");
                    tipoRima = ent.nextInt();
                    if (tipoRima < 1 || tipoRima > 4) {
                        System.out.println("Ha de estar entre 1-4");

                    } else {
                        break;
                    }
                } while (true);

                //Llegir els versos
                System.out.println("Introdueix els 4 versos de longitud minima " + numLletres);
                for (int j = 0; j < 4; j++) {

                    String vers = ent.skip("[\r\n]*").nextLine();

                }

                //Tractar els versos
            }

            //Mostrar el resultat final
            System.out.format("Un total de %d estrofes %1$d han seguit la rima indicada"
                    //Per que surti el percentatge posem 2 %%
                    + "la qual cosa suposa un %5.1f%%  d'estrofes introduïdes%n", estrofesQueRimen,
                    estrofesQueRimen / numEstrofes * 100.0 //Per passar el numero a real

            );
        }
    }

}
