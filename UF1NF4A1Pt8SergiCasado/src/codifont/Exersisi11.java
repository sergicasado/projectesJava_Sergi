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
public class Exersisi11 {

    public static void main(String[] args) {

        //Vector de totes les lletres
        char[] lletres = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        String numdni;
        Scanner ent = new Scanner(System.in);
        Scanner entN = new Scanner(System.in);

        //declaració de variables
        int opcions, num;

        //Menú
        do {
            System.out.println("Tria una opció:");
            System.out.println("0. Sortir");
            System.out.println("1. Calcular lletra de DNI");        
            opcions = entN.nextInt();

            //té més o menys de 8 nums, incorrecte
            switch (opcions) {
               
                case 0:
                    System.out.println("Has sortit del programa");
                    break;
              
                case 1:
                    System.out.println("Introduix el nº de DNI:");
                    do {
                        numdni = ent.nextLine();
                        if (numdni.length() <8)System.out.println("Nombre incorrecte");
                        else break;
                        
                    } while (true);

                    num = Integer.parseInt(numdni.substring(0));
                    int pos;
                    pos=num%23;
                    System.out.format("DNI complet: %d%s%n", num,lletres[pos]);
                    System.out.println("");
                    break;

                
            }

        } while (true);
       

    }

}
