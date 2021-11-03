/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectors;

import java.util.Scanner;

/**
 *
 * @author sergicp
 */
public class UF1NF3Ex1 {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        // q -> quants numeros vols posar
        // numInterior -> Son els numeros que van omplint el vector.
        // v -> numero real qualsevol
        // cont -> conta els numeros iguals entre q i v
        int q, v;
        int[] numeros;
        int numInterior;
        int cont = 0;

        q = ent.nextInt();

        if (q > 0) {

            numeros = new int[q];

            //Llegir quantitat de numeros que te q
            //        numeros = new int[q];
            for (int i = 0; i < q; i++) {

                numInterior = ent.nextInt();

                numeros[i] = numInterior;

            }

            //Aqui ja tenim el vector amb els numeros introduits a cada posicio
            //Comprovació manual de les posicions / num del vector
//            System.out.println(numeros[0]);
//            System.out.println(numeros[1]);
//            System.out.println(numeros[2]);
//            System.out.println(numeros[3]);
//            System.out.println(numeros[4]);
            //Demanar  int v
            v = ent.nextInt();

            //Mostrar: 
            // una primera línia en la seqüència dels números reals introduïts que siguen menors que
            // v, separats per un ‘:’ (caràcter 2 punts), si n’hi ha algun, o un 0 en cas contrari,
            for (int i = 0; i < numeros.length; i++) {

                if (numeros[i] < v) {
                    System.out.print(numeros[i] + ":");
                }

            }

            // una segona línia en la quantitat dels números reals introduïts que siguen iguals que v,
            for (int i = 0; i < numeros.length; i++) {

                if (numeros[i] == v) {
                    cont++;
                }

            }
            System.out.println(cont);

            // una tercera línia en la seqüència dels números reals introduïts que siguen majors que
            // v, separats per un ‘:’ (caràcter 2 punts), si n’hi ha algun, o un 0 en cas contrari,
            for (int i = 0; i < numeros.length; i++) {

                if (numeros[i] > v) {
                    System.out.println(numeros[i] + ":");
                }

            }

        } else {

            do {

                if (q == 0) {
                    System.out.println("ADEU");
                    break;

                } else if (q < 0) {
                    System.out.println("QUANTITAT INCORRECTA");
                    break;
                }

            } while (true);

        }
    }
}
