/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codifont.nf1;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class Bucles6 {
    
    public static void main(String[] args) {
        
        Scanner ent = new Scanner(System.in);
        int num, cont5=0, cont15=0;
        
        
        //Demanem números de l'1 al 20, sino s'acaba el programa
        //i al final direm quants eren <=5 i quants >=15
        while (true){
            System.out.println("Escriu números enters de l'1 al 20:");
            num=ent.nextInt();
            
            if(num>=1 && num<=5){
                cont5++;    //equival a cont5=cont5+1
                continue;
            }
            
            if(num>=15 && num<=20){
                cont15++;    //equival a cont15=cont15+1
                continue;
            }
            
            System.out.println("No has posat un valor entre 1 i 5, ni 15 i 20");
            
            //Condició de sortida del bucle
            if(!(num>=1 && num<=20)) break;
            
        }
        
        System.out.println("Has introduit "+cont5+" números entre 1 i 5.");
        System.out.println("Has introduit "+cont15+" números entre 15 i 20.");
    }
    
}
