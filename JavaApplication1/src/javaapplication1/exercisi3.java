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
public class exercisi3 {

    public static void main(String[] args) {

        //Declaració de variables
        Scanner ent = new Scanner(System.in);

        int any;

        //Demanem un numero enter igual o major que 1582
        do {
            System.out.println("Introdueix un any major o igual que 1582:");
            any = ent.nextInt();

            if (any >= 1582) {
                System.out.println(" ");
            } else {
                System.out.println("ERROR:0X5427 ");
            }
            
            

        } while (any < 1582);

        if (any % 400 == 0 || (any % 4 == 0 && any % 100 != 0)) {
            System.out.println("L'any és bixest");
        } else {
            System.out.println("L'any no és bixest");
        }

        /*
        
        //suposem que l'usuari ha posat un any correcte (>=1582)
        
        System.out.println( any%400 == 0  || ( any%4 == 0 && any%100 != 0  ));
       

        
        //suposem que l'usuari ha posat un numero enter correcte (qualsevol)
        
        System.out.println(any >=1582 && (any%400 == 0  || ( any%4 == 0 && any%100 != 0  )));
        
         */
    }

}
