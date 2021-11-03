/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nf3;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Exercici8 {
    
    public static void main(String[] args) {
        
        Scanner ent = new Scanner(System.in);
        String text = "";
        int contAa,contEe,contIi,contOo,contUu;
        int [] vocals=new int[5];
        
        
        
                System.out.println("Escriu un text acabant en punt:");
        
        do {
            String linia = ent.nextLine().trim();
            
           
            
            if (text.isEmpty()) { text = linia;
            } else { text = text + '\n' + linia;
            }
            if (text.contains(".")) {
                break;
            }
            
         
            
        } while (true);
        
        
        
        
        
        
        
    }
    
}
