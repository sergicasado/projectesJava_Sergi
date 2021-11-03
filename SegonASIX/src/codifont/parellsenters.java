/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codifont;

import java.util.Scanner;

/**
 * 9. Fes un programa en Java que demane a l'usuari la introducció de parelles
 * de números enters fins que siguen iguals o un de ells sigui zero. Al final ha
 * d'imprimir la suma i la mitjana dels números introduïts. Afegit: al final que
 * mostre també el producte dels números diferents de zero.
 *
 * @author profe
 */
public class parellsenters {

    public static void main(String[] args) {
        //Declaració de variables 
        Scanner ent = new Scanner(System.in);
        int num1,
                num2,
                suma = 0,
                producte = 1,
                comptador = 0;

        do {
          
            num1 = ent.nextInt();
            num2 = ent.nextInt();
            suma = suma + num1 + num2;
            comptador += 2;

            if (num1 != 0) {
                producte *= num1;
            }
            if (num2 != 0) {
                producte *= num2;
            }
            if (num1 == 0 && num2 == 0);

        } while (!(num1 == num2 || num1 == 0 || num2 == 0));
       

        System.out.println(suma);

        if (num1 == 0 && num2 == 0) {
            System.out.println("INDETERMINAT");
            
        } else {
            System.out.println(producte);
           
        }

        System.out.println((double)suma / comptador);
    }

}
