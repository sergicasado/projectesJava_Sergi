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
public class IntroduccioDades {
    
    public static void main(String[] args) {
        
        //Introducció de dades
        
        //1r Pas. Declarem un Scanner
        Scanner entNum = new Scanner(System.in);
        Scanner entCad = new Scanner(System.in);
        int edat, pes;
        String nom;
        
        System.out.println("Introdueix la teva edat");
          
        edat=entNum.nextInt();
        
        
        
        System.out.println("Introdueix el teu pes");
          
        pes=entNum.nextInt();

        
        
        System.out.println("Introdueix un nom");
        
        nom=entCad.nextLine();
        
        
        
        System.out.println("Tens "+edat+" anys, peses "+pes+" Kg i et dius "+nom
        );
        
        
   
    }
    
}
