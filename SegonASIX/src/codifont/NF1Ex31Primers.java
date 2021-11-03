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
public class NF1Ex31Primers {

    public static void main(String[] args) {

        int num;
        int cont = 2;
        boolean primer = true;

        Scanner ent = new Scanner(System.in);

        num = ent.nextInt();
        do {

            if (num % cont == 0 && num > 1 && cont == num) {
                
                primer = true;
                
            } else if (num % cont != 0 || num == 1 || num < 2) {

                primer = false;
            }
            cont++;
            
        } while (num != -1);
        
        if (primer=true)System.out.println("SI");
        
        else   System.out.println("NO");
    }
}


















//        int num;
//        int contador = 2;
//        boolean primer = true;
//
//        Scanner ent = new Scanner(System.in);
//        num = ent.nextInt();
//
//        boolean primo = true;
//        while ((primer) && (contador != num)) {
//            if (num % contador == 0) {
//                primo = false;
//            }
//            contador++;
//        }
//        
//    }
//
//}
