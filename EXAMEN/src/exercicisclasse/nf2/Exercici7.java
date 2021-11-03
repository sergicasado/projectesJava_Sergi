/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisclasse.nf2;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class Exercici7 {
    
    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        String text="", linia="", resultat="";
        
        //Demanem a l'usuari la introducció del text
        System.out.println("Introduix línies de text (acabada en punt per finalitzar):");
        do {         
            linia=ent.nextLine().trim();
            
            //Concatenem la línia al text
            text=text+linia;
            
            //Mirem si és o no la última línia del text
            if(linia.endsWith(".")) break;
            else text+='\n';    //Si no és la última afegixo un salt de línia
        } while (true);
        
        //Tractarem el text canviant majúscules per minúscules i viceversa
        for (int i = 0; i < text.length(); i++) {
            //Llegim el caràcter actual del text
            char c=text.charAt(i);
            if( Character.isUpperCase(c)) resultat+=Character.toLowerCase(c);
            else resultat+=Character.toUpperCase(c);
        }
        
        System.out.format("%nEl text transformat és:%n%n%s%n%n", resultat);
        
    }
    
}
