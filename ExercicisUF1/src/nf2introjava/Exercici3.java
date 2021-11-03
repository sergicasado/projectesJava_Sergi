/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nf2introjava;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class Exercici3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaració de variables
        Scanner ent=new Scanner(System.in);
        int any;
        
        //Demanem un número enter major o igual que 1582
        System.out.println("Introduix un número enter major o igual que 1582:");
        any=ent.nextInt();
        
        //Suposem que l'usuari ha posat un any correcte (>=1582)
        System.out.println( any%400 == 0  || ( any % 4 == 0   &&  any %100 != 0  ));
        
        //Suposem que l'usuari ha posat un número enter correcte (qualsevol)
        System.out.println( any >= 1582 && (any%400 == 0  || ( any % 4 == 0   &&  any %100 != 0  )));
        
        if(any >= 1582 && (any%400 == 0  || ( any % 4 == 0   &&  any %100 != 0  ))){
            System.out.println("L'any és bixest.");
        }
        else{
            System.out.println("L'any no és bixest.");
        }
        
    }
    
}
