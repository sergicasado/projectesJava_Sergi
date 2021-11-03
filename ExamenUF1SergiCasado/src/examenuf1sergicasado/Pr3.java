/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenuf1sergicasado;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Pr3 {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        String cadena = "test";
        char t = 't';

        char[][] matriu;
        int num;
        char valor=cadena.charAt(0);

        System.out.println("Introdueix un enter major que 0 pero que no superi");
        System.out.println("el nombre de caracters de la paraula:" + cadena);

        do {

            num = ent.nextInt();

            if (num <= 0 || num > cadena.length()) {
                System.out.println("Ha de ser major que 0 i menor que el numero de caracters!");
            }else break;

        } while (num <= 0 || num >= cadena.length());

        int files = (num * 2);
        int columnes = num;
        
        matriu = new char[files][columnes];

        
        int cont = 0;
        for (int i = 0; i < matriu.length; i++) {
            cont=0;
            for (int j = 0; j < matriu[i].length; j++) {

                matriu[i][j] = cadena.charAt(cont);
                cont++;
                
                
                
                

            }

        }

    }

}
