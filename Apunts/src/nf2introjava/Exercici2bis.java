/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nf2introjava;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class Exercici2bis {

    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        int cont, ini, fi;

        //Demanem a l'usuari la introducció dels valors
        System.out.println("Introduix el valor inicial i final a mostrar:");
        ini = ent.nextInt();
        fi = ent.nextInt();

        //Inicialitzo el comptador en el valor inicial
        cont = ini;

        //Mostrem el resultat ascendent dins d'un while
        while (cont <= fi) {
            System.out.print(cont + " és ");
//            if (cont % 2 == 0) {
//                System.out.println("parell");
//            } else {
//                System.out.println("imparell");
//            }
            //El if_else en operador condicional  (condicio ? cas_cert : cas_fals)
            System.out.println(    cont % 2 == 0 ? "parell" : "imparell"       );
            
            
            cont++;
        }

        if (ini != fi) {
            //Inicialitzo el comptador en el valor inicial
            cont = ini;

            //Mostrem el resultat descendent dins d'un while
            while (cont >= fi) {
                System.out.print(cont + " és ");
                if (cont % 2 == 0) {
                    System.out.println("parell");
                } else {
                    System.out.println("imparell");
                }
                cont--;
            }
        }

    }

}
