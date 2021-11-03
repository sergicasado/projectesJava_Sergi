/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectors;

import java.util.Scanner;

/**
 *
 * @author Sergi
 */
public class Exercici5 {

    public static void main(String[] args) {

        //final int -> Es una constant, vol dir que el valor que li assignem
        //ja no es podrà canviar, i serà sempre el mateix.
        //Declaració de constants
        final int QUANTITAT = 5;

        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        int[] valors;
        int suma = 0;
        double mitjana;

        //Li diem al nou vector que la seva cantitat sera la de la int QUANTITAT
        valors = new int[QUANTITAT];

        if (QUANTITAT <= 0) {
            System.out.println("Adéu!!");
        } else {

            //Aqui sabem que QUANTITAT es positiva    
            valors = new int[QUANTITAT];

            //Demanem valors a l'usuari
            System.out.format("Introdueix %d valors enters:%n", QUANTITAT);
            for (int i = 0; i < valors.length; i++) {
                valors[i] = ent.nextInt();

                //Suma val 0, com es un for, cada vegada sumarà cada valor que 
                //li fiquem, fins que arribi al valors.length = QUANTITAT i parara.
                suma = suma + valors[i];

            }

            //Calculem la mitjana, una vegada hem llegit i sunmat tots els valors
            //Multiplicar per un real al fer la mitjana. (*1.0)
            //SUMA/QUANTITAT NO ES CORRECTE PERQUE DONARA RESULTAT EN ENTER I NO 
            //CONTARIEM ELS DECIMALS.
            mitjana = (suma * 1.0) / QUANTITAT;

            //Mostrem els valors majors o iguals que la mitjana.
            System.out.format("Els valors >= que %f són: %n", mitjana);

            for (int i = 0; i < valors.length; i++) {

                System.out.format("%s", ((valors[i] >= mitjana) ? (valors[i] + "\n") : ""));

                // ALTRA MANERA DE EXPRESAR-HO, COM BAIX
                // %s Per Strings, o comodin si no sabem que posar.
//                if (valors[i]>=mitjana) System.out.format("%s", (valors[i]+"\n"));
//                else System.out.format("%s","");
            }

        }

    }

}
