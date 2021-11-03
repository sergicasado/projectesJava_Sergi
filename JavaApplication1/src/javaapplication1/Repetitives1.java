/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Repetitives1 {

    public static void main(String[] args) {

        //Declaració variables
        Scanner ent = new Scanner(System.in);

        int cont=1;
        int passos1, passos2;

        System.out.println("De quin numero vols començar?");
        passos1 = ent.nextInt();
        
        System.out.println("En quin numero vols acabar?");
        passos2 = ent.nextInt();

        /*
        //Estructura del while
        while (cont <= passos1) {

            System.out.println("Estic dins del while i cont val " + cont);
            cont++;

        }

        if (passos1 < 0) {
            System.out.println("No es pot representar en negatiu");
        }

        cont = 1;
        //While utilitzant break
        while (true) {

            System.out.println("Estic dins del while i cont val " + cont);
            cont++;

            if (!(cont <= passos1)) {
                break;
            }

        }

        /*
        //Exemple del while utilitzant continue
        cont = -50;
        while (cont <= passos) {
            cont++;
            System.out.println("Cont val " + cont);
            if (cont % 2 == 0) {
                System.out.println("Cont és parell");
            }

            if (cont % 2 != 0) {
                System.out.println("Cont és imparell");
            }

        }
        
         */

 /*
           cont=1;
            while (cont <= passos){
            cont++;
            System.out.println("Cont és parell");
            System.out.println("Cont val " +cont);
           if (cont%2!=0) continue;
           
           if (cont%3!=0) continue;
                System.out.println("Con es imparell");
         */
        
 
 cont=passos1;
        while (cont >= passos1 && cont <= passos2) {
            
            System.out.println("Cont val " + cont);
            if (cont % 2 == 0) {
                System.out.println("Cont és parell");
            } else {

                System.out.println("Cont és imparell");

            }
            ++cont;
        }
        
        while (cont <=passos1 && cont >=passos2){
                 System.out.println("Cont val " + cont);
            if (cont % 2 == 0) {
                System.out.println("Cont és parell");
            } else {

                System.out.println("Cont és imparell");

            }
            --cont;
            
        }
    }

}
