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
public class Exercici3 {
    
    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        String text="", linia;
        int cont=0;
        
        //Demanem a l'usuari la introducció del text
        System.out.println("Introduix línies de text (acabada en punt per finalitzar):");
        do {         
            linia=ent.nextLine().trim();
            //Mirem si la línia no és buida per incrementar el comptador
            if(!linia.isEmpty()) cont++;
            
            //Concatenem la línia al text
            text=text+linia;
            
            //Mirem si és o no la última línia del text
            if(linia.endsWith(".")) break;
            else text+='\n';    //Si no és la última afegixo un salt de línia
        } while (true);
        
        System.out.format("%nEl text:%n%n\"%s\"%n%nté %d "+(cont==1?"línia":"línies")+".%n", text, cont);
    }
    
}
