/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codifont.nf1;

/**
 *
 * @author profe
 */
public class Bucles8 {

    public static void main(String[] args) {
        int i, j;

        //for
        for (i = 0; i < 10; i++) {
            System.out.println(i);
        }

        i++;
        
        System.out.println("");
        //Faig un while equivalent al for de dalt, però usant la variable j enlloc de la i

        j = 0;
        while (j < 10) {
            System.out.println(j);

            j++;
        }

        j++;

    }

}
