/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bisext;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Bisext {

    public static void main(String[] args) {
        //Declaració de variables

        int numero;
        Scanner ent = new Scanner(System.in);
        numero = ent.nextInt();

        if (numero >= 1582) {

            if (numero % 400 == 0 || numero % 4 == 0 && numero % 100 != 0) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }
}
