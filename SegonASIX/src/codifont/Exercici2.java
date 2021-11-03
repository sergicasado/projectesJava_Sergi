/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codifont;

import java.util.Scanner;

//2. Fer un programa en Java que mostri els numeros enters entre el -5 i el 5 i dir si son parells o imparells
/**
 *
 * @author alumne
 */
public class Exercici2 {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        int ini, fi;

        //Demanem els valors al usuari, forçant-lo a que siguin correctes (ini <= fi);
        do {

            System.out.println("Introdueix un valor inicial:");

            ini = ent.nextInt();

            System.out.println("Introdueix un valor final:");
            fi = ent.nextInt();

            if (ini > fi) {
                System.out.println("Atenció, el valor inicial ha de ser menor o igual que el final");
            } else {
                break;
                //El codi s'executarà si les dades son correctes.
            }

        } while (true);

        //Ho fare usant la sentencia for
        for (int i = ini; i <= fi; i++) {

            if (i % 2 == 0) {
                System.out.println(i + " es parell");
            } else {
                System.out.println(i + " es imparell");
            }

        }

    }

}
