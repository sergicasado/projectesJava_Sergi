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

        int pes;

        Scanner ent = new Scanner(System.in);

        System.out.println("Introdueix el pes de la pizza ");

        pes = ent.nextInt();
        if (pes > 0) {
            System.out.println("Has introduit " + pes + " Kg");
        } else {
            System.out.println("El pes que has introduit es incorrecte");
        }

    }

}
