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
public class descomposicio {

    public static void main(String[] args) {

//    Escriu un programa en Java que determine i escrigue la descomposició en factors
//    primers en ordre decreixent d'un número enter positiu (forçant a l'usuari a 
//    que introduisque un d'estos números majors que 0). Evidentment haurem de guardar
//    els divisors primers trobats a un vector d'enters i mostrar-los al final de l'execució.
//    Nota: la grandària del vector es pot reduïr en la següent fórmula, per números majors que 1,
//    sent num el número introduït per l'usuari:
//        
        Scanner ent = new Scanner(System.in);

        int num;
        int cont = 2;
        int[] vector = new int[10];
        int resultat;
        int[] muestra = new int [10]; 
        System.out.println("Introdueix un numero >0:");
        do {

            num = ent.nextInt();
            if (num <= 0) {
                System.out.println("Ha de ser major que 0!!");
            }

        } while (num <= 0);
       //Rellenamos vector
        for (int i = 0; i < vector.length; i++) {
            if (num % cont == 0) {
                num=num/cont;
                vector[i] = cont;
                muestra[i]= vector[i];
                System.out.print(vector[i]+"*");
            } else {
                cont++;
            }
        }
        System.out.print("1");
        //Mostrar el vector

//        for (int i = 0; i < muestra.length; i++) {
//            System.out.print(muestra[i]+" ");
//        }
    }

}
