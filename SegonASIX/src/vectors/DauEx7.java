/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectors;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class DauEx7 {

    public static void main(String[] args) {

        Random r = new Random();
        Scanner ent = new Scanner(System.in);
        int numCares, numTirades;
        int[] dau;
        //Demanem número de cares

        do {
            System.out.println("Introdueix el número de cares del dau (>=2):");
            numCares = ent.nextInt();

            if (numCares < 2) {
                System.out.println("Ha de ser major o igual que 2");
            } else {
                break;
            }
        } while (true);

        //Ara ja podem instanciar el vector en el número de cares que ens ha donat.
        dau = new int[numCares];

        //Demanem número de tirades
        do {
            System.out.println("Introdueix el número de tirades (>=1):");
            numTirades = ent.nextInt();

            if (numTirades < 1) {
                System.out.println("Ha de ser major o igual que 1");
            } else {
                break;
            }
        } while (true);

        //Simulem les tirades
        for (int i = 0; i < numTirades; i++) {

            //Simulem una tirada
            int tirada = r.nextInt(numCares);
            System.out.println("Ha sortit el num: " + (tirada + 1));
            

            //incrementem el contador dins el vector de la posicio 'tirada'
            dau[tirada] = dau[tirada] + 1;

        }

        //Mostrem les vegades que ha sortit cada cara
        
        for (int i = 0; i < dau.length; i++) {
            
            System.out.format("La cara %d ha sortit %d vegades %n", i+1, dau[i]);
            
            
        }
        
    }

}
