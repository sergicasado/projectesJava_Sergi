/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nf2;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Exercisi15 {
    
    public static void main(String[] args) {
        
        Scanner ent=new Scanner(System.in);
        char c;
        
        //Demanem a l'usuari que escrigui un caracter
        System.out.println("Introdueix una lletra minúscula");
            
        c=ent.nextLine().charAt(0);
        
        switch (c) {
            case 'a':           
            case 'e':                
            case 'i':                
            case 'o':                
            case 'u': 
                
                System.out.println("És vocal");
            
                break;
                
            default: 
                System.out.println("No és vocal");
                
        }
        
        }
                
                
    }
    
