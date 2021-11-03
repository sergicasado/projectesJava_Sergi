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
public class Condicionals {

    public static void main(String[] args) {
        
              //Declaració de variables
        Scanner ent = new Scanner(System.in);
        boolean condicio = false;
        int num;


        //Demanem a l'usuari l'introducció d'un número enter
        System.out.println("Introdueix un número enter");
        num = ent.nextInt();

        //Comproba la condició, i si és certa executa les instruccions del seu
        //cos
        if (num != 9) {

            System.out.println("Hem entrat dins del cos de l'if");
            num++;

            if (num % 6 == 0) {
                System.out.println("El número es divisible per 6");
            }

        }

        //Exemple de condició en 2 ifs
        if (num == 10) {
            System.out.println("El número val 10");
        }

        if (num != 10) {
            System.out.println("El número no val 10");
        }

        //if else equivalent
        if (num == 10) {
            System.out.println("El númeo val 10");
        } else {
            System.out.println("El número no val 10");
        }
        
        
        
        
        
  
        condicio = false;
        if (condicio = true) {
            System.out.println("El que sigui...");
        }
        
        
      
    }

}
