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
public class NF2Ex2LletraDNI {

    public static void main(String[] args) {

        char lletra;
        int num;
        String dni = "TRWAGMYFPDXBNJZSQVHLCKE";
        
        
        int residu = 0;

        Scanner ent = new Scanner(System.in);
        num = ent.nextInt();
        if (num < 0) {
            System.out.println("INCORRECTE");
        } else {
            residu = num % 23;
            
            

            for (int i = 0; i<dni.length(); i++) {
                
                
                 if (i==residu)System.out.println(dni.charAt(i));   
               
                 
                
            }
            
            

        }
    }

}
