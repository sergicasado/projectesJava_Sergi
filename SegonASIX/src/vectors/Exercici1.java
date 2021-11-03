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
public class Exercici1 {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        int num;
        int[] factors;
        int index;
        int candidat;
        int copia;

        //Demanar numero
        do {
            System.out.println("Introdueix un enter positiu");

            num = ent.nextInt();
        

            if (num <= 0) {
                System.out.println("Ha de ser positiu");
            }

        } while (num <= 0);

        //Trtactar numero
        //Inicialitzant variables
        factors = new int[Math.round((float) (Math.log(num) / Math.log(2)))];
        index = 0;
        candidat = 2;
        copia = num;

        while (num != 1) {

            if (num % candidat == 0) {

                factors[index] = candidat;
                index++;
                num = num / candidat;

            } else {
                candidat++;
            }
        }
            

            //Tractament final
            index--;

            //mostrar Resultat
            //MostrarPrimeraLinia
            System.out.format("Descomposició factorial de %d;%n", copia);

            //Mostrar factors
            for (int i = index; i >= 0; i--) {
                System.out.print(factors[i] + " * ");
            }

        

        //tractamentFinal
        System.out.println("1");

    }

}
