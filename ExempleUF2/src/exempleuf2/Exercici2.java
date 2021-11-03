/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exempleuf2;

import static exempleuf2.Exercici1.retornaCaracter;
import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @Sergi Exercici2
 */
public class Exercici2 {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int num;

        do {
            System.out.println("Introdueix els caracters a veure:");
            num = ent.nextInt();
            System.out.println(" ");
            if (num < 1) {
                System.out.println("Error: El número ha de ser major que 0:");
            } else {
                break;
            }
        } while (true);

        //Mostrem el resultat
        mostraVarisCaracters(num);

    }

    public static void mostraVarisCaracters(int quantitat) {

        for (int i = 0; i < quantitat; i++) {
            System.out.format("%c", retornaCaracter());
            
        }

    }
}
