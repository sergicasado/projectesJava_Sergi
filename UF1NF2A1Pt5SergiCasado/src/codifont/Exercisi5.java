/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codifont;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Exercisi5 {

    public static void main(String[] args) {

        double pes;
        int cont = 0;
        

        Scanner ent = new Scanner(System.in);

        

        System.out.println("Introdueix el pes de la pizza (0.0 per acabar) ");

        do {
            pes = ent.nextDouble();

            if (pes > 0.0) {
                cont++;
            }
            if (pes == 0) {
                break;
            }

            System.out.format("%+10.2f %n", pes);
            System.out.format("%+010.2f %n", pes);
            System.out.format("%E %n", pes);
            System.out.format("%g %n", pes);

        } while (true);
        System.out.format("S'han intruduit %d pizzes", cont);

    }
}
