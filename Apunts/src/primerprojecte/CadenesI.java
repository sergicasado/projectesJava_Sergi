/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerprojecte;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class CadenesI {
    
    public static void main(String[] args) {
        Scanner ent=new Scanner(System.in);
//        String cadena="Hola";
//        int i;
//        cadena="Adéu";
//        
//        cadena=cadena.concat(", bon dia");
//        
//        System.out.println(cadena.length());
        String text;
        System.out.println("Introduix un text no buit:");
        do{
            text=ent.nextLine().trim();
            //if(text.length()==0) System.out.println("No pot ser buit!!");
            if(text.isEmpty()) System.out.println("No pot ser buit!!");
            //if(text.isBlank()) System.out.println("No pot ser buit!!");
            else break;
        }while(true);
        
        System.out.println("Has introduït: ".concat(text));
        
        System.out.println("El teu text comença per "+text.charAt(0));
        int contVocals=0;
        
        for (int i = 0; i < text.length(); i++) {
            char c=text.toLowerCase().charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') contVocals++;
        }
        
        System.out.format("%nHi ha %d vocals dins del text %s%n", contVocals, text);
    }
    
}
