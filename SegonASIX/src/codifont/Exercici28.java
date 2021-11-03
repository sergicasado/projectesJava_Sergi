/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codifont;

import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class Exercici28 {

    public static void main(String[] args) {

        int num;

        Scanner ent = new Scanner(System.in);
        num = ent.nextInt();
        if (num == 0) {
            System.out.println("CAP");
        }

        if (num < 0) {
            num = num * (-1);
        }
        String cadena;
        for (int i = num; i > 0; i--) {
            
            
            if (num % i == 0) {
                System.out.print(i);
                
                if (i!=1)
                System.out.print("-");
                
                                                
            }
     
            
        }

    }

}
