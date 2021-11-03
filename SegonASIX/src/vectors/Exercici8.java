/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectors;

import java.util.Scanner;
import java.util.*;

/**
 *
 * @author alumne
 */
public class Exercici8 {

    public static void main(String[] args) {

        Vector<String> vec_tor = new Vector<String>();

        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        long numero, copia;
        int llargada;
        byte[] vector;
        int index;
        boolean negatiu;

        //Passos a seguir:
        //Demanar numero
        System.out.println("Introdueix un numero enter");
        numero = ent.nextLong();

        negatiu = numero < 0;

        //Seria el mateix que el de baix:
//        if(numero<0) negatiu=true;
//        else negatiu=false;
        if (numero == 0) {
            vector = new byte[1];
        } else {

            negatiu = numero < 0;

            if (negatiu) {
                numero *= -1;
            }

            copia = numero;

            //Hem de 
            llargada = 0;

            //CalcularLongitud + InstanciarVector.
            while (numero != 0) {

                llargada++;

                numero /= 10;

            }
            vector = new byte[llargada];

            System.out.println(llargada);

            //TractarNumero
            numero = copia; //ja que numero ara val 0 per el bucle d'abans
            //aixo es en cas de que necesitesim tornar a guardar el num

            for (int i = vector.length - 1; i >= 0; i--) {

                vector[i] = (byte) (numero % 10);
                numero /= 10;

            }

            if (negatiu) {
                vector[0] = vector[0] *= -1;
            }

//            Object[] arr = vector.toArray();

            

        }
        
        //MostrarResultat
            System.out.println(vector);
            
            for (int i = 0; i < vector.length; i++) {
                System.out.println(vector[i]);
            
        }
    }
}
