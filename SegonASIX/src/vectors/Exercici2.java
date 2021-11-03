/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectors;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Exercici2 {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        int dia, mes, any;

        System.out.println("Introdueix un dia / mes / any");

        dia = ent.nextInt();
        mes = ent.nextInt();
        any = ent.nextInt();
        boolean bixest;
        boolean dataok;

        if (any >= 1582 && (any % 400 == 0 || (any % 4 == 0 && any % 100 != 0))) {
            bixest = true;
        } else {
            bixest = false;
        }

        if (bixest = true) {
            mes = 2;
        } else {

            do {
                
                if (dia<=31) mes = 1|3|5|7|8|10|12;
              
                
                if(dia<=30) mes=4|6|9|11;
                
                
                if (dia==28 | dia==29) mes=2;
              
                
                
                

            } while (dia > 0 && dia <= 31 && mes > 0 && mes <= 12);
        }
        
        
                
        
        
        
    }
}
